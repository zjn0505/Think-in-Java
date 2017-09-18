import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Jienan on 2017/9/18.
 */
class MyBoardTest {
    @Test
    void resetBoards() throws IOException {
        File currentDir = new File("..");
        File res = new File(currentDir, "BoardStatus.txt");
        FileInputStream fstream = new FileInputStream(res);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;
        //Read File Line By Line
        while ((strLine = br.readLine()) != null)   {
            singleBoardsTest(strLine);
        }
        br.close();

    }

    @Test
    void singleBoardsTest(String planeCode) throws IOException {
        MyBoard board = new MyBoard();
//        String strline = "13|23,26|36,72|73";
        String strline = planeCode;
        System.out.println (strline);
        String[] datas = strline.split(",");
        try {
            Plane p1, p2, p3;
            p1 = new Plane(datas[0]);
            p2 = new Plane(datas[1]);
            p3 = new Plane(datas[2]);
            board.resetBoards(new Plane[] {p1, p2, p3});
        } catch (BoardException e) {
            e.printStackTrace();
        }
        board.printBoard();


    }

}