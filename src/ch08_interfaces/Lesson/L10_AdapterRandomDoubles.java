package ch08_interfaces.Lesson;

import sun.audio.AudioDataStream;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by Jienan on 2016/10/20.
 */
public class L10_AdapterRandomDoubles extends L10_RandomDoubles implements Readable{
    private int count;
    public L10_AdapterRandomDoubles(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0)
            return -1;
        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new L10_AdapterRandomDoubles(7));
        while (s.hasNextDouble())
            System.out.print(s.nextDouble() + " ");
    }
}
