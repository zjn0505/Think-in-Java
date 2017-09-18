import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Jienan on 2017/9/4.
 */
public class Game {

    MyBoard compBoard;
    MyBoard oppoBoard;
    MyBoard oppoBoardAICannotSee;

    int moveCount = 0;
    public static void main(String[] args) {
        Game game = new Game();
        game.generateRandomBoardforComputer();

        game.play();

    }

    private void play() {

        oppoBoard = new MyBoard();
        hitProfile = new ArrayList<String>();
        missProfile = new ArrayList<String>();



        Scanner reader = new Scanner(System.in);

        System.out.println("Input your setup in the format of 57|47,74|73,97|87");
        while (true) {
            String line = reader.nextLine();
            oppoBoardAICannotSee = init(line);
            if (oppoBoardAICannotSee != null) {
                break;
            } else {
                System.out.println("Please input in the format of 57|47,74|73,97|87");
            }

        }

        while (true) {

            System.out.println("Enter a position:");
            while (!reader.hasNextLine()) {
                reader.next();
                System.out.println("Invalid input");
            }
            String line = reader.nextLine();
            if (line.length() != 2) {
                System.out.println("Invalid input");
                continue;
            }
            int n = 0;
            if (isNumeric(line)) {
                n = Integer.valueOf(line);
            } else {
                char c0 = line.charAt(0);
                char c1 = line.charAt(1);
                if (Character.isDigit(c0)) {
                    n = (c0 - '0') * 10 + mapAtoI(c1);
                } else {
                    n = (c1 - '0') * 10 + mapAtoI(c0);
                }
            }

            int row = n / 10;
            int col = n % 10;
            if (0 < row && row < 10 && 0 < col && col < 10) {
                System.out.println(String.format("you are hitting : Row %d, Column %d", n / 10, n % 10));
            } else {
                System.out.println("Invalid input, number should be row + column from 1 to 9");
            }
            Position p = Position.getPosition(n);
            if (p != null) {
                FireResult result = compBoard.hit(p);
                System.out.println("It's a " + result.toString() + " on Row " + row + " Col " + col);
                moveCount++;
                if (result == FireResult.DESTROYED) {
                    System.out.println("You win");
                    System.out.println("You took " + moveCount + " moves to win.");
                    System.out.println("My layout is: ");
                    compBoard.printBoard();
                    return;
                } else if (result == FireResult.DUPLICATED || result == FireResult.DUPLICATED) {
                    moveCount--;
                    continue;
                }


                FireResult resultAIGuess = makeAIGuess();
                if (resultAIGuess == FireResult.DESTROYED) {
                    System.out.println("AI win");
                    System.out.println("AI took " + moveCount + " moves to win.");
                    System.out.println("Your layout is: ");
                    oppoBoardAICannotSee.printBoard();
                    System.out.println("My layout is: ");
                    compBoard.printBoard();
                    return;
                }
            }
        }

    }

    ArrayList<String> hitProfile = new ArrayList<String>();
    ArrayList<String> missProfile = new ArrayList<String>();

    private FireResult makeAIGuess() {
        ArrayList<Plane> planeList = ComputeBoard.createPlaneList(missProfile);
        ArrayList<Board> boardList = ComputeBoard.createBoardList(planeList, hitProfile);

        System.out.println("Available planes count : " + planeList.size());
        System.out.println("Available boards count : " + boardList.size());
        ArrayList<Integer> predictHeadList = ComputeBoard.predictHeadList(boardList);
        for (int i = 0; i < 81; i++) {
            if (i % 9 == 0) {
                System.out.println();
            }
            System.out.print(String.format("%3d ", predictHeadList.get(i)));
        }
        System.out.println();

        String position;
        while (true) {
            int index = predictHeadList.indexOf(Collections.max(predictHeadList));
            position = (index/9+1)+""+(index%9+1);
            if (hitProfile.contains(position)) {
                predictHeadList.remove(index);
            } else {
                break;
            }
        }

        FireResult result = oppoBoardAICannotSee.hit(Position.getPosition(Integer.valueOf(position)));
        if (result == FireResult.MISS) {
            missProfile.add(position);
        } else if (result == FireResult.HIT) {
            hitProfile.add(position);
        }
        System.out.println("I'm hitting you on " + position + " and got a " + result.toString());

        return result;

    }


    private void generateRandomBoardforComputer() {
        ArrayList<String> boards = new ArrayList<String>();
        try {
            File currentDir = new File(".");
            File res = new File(currentDir, "BoardStatus.txt");
            FileInputStream fstream = new FileInputStream(res);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                boards.add(strLine);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int rnd = new Random().nextInt(boards.size());
        compBoard = init(boards.get(rnd));

    }

    MyBoard init(String planeCode) {
        MyBoard board= new MyBoard();
//        String strline = "13|23,26|36,72|73";
        String strline = planeCode;
//        System.out.println (strline);
        String[] datas = strline.split(",");
        try {
            Plane p1, p2, p3;
            p1 = new Plane(datas[0]);
            p2 = new Plane(datas[1]);
            p3 = new Plane(datas[2]);
            board.resetBoards(new Plane[] {p1, p2, p3});
        } catch (BoardException e) {
            e.printStackTrace();
            return null;
        }
//        compBoard.printBoard();
        return board;

    }

    private static boolean isNumeric(String str) {
        for (char c : str.toCharArray())
        {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    private static int mapAtoI(char AtoI) {
        if (AtoI >= 'A' && AtoI <= 'Z') {
            return AtoI - 'A' + 1;
        } else if (AtoI >= 'a' && AtoI <= 'z') {
            return AtoI - 'a' + 1;
        }
        return 0;
    }
}
