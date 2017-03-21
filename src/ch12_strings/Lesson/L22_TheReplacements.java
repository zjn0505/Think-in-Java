package ch12_strings.Lesson;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by Jienan on 2017/3/21.
 */

/*! Here's a block of text to use as input to
    the regular expression matcher. Note that we'll
    first extract the block of text by looking for
    the special delimiters, then process the
    extracted block. !*/

public class L22_TheReplacements {
    public static void main(String[] args) throws Exception {
        String s = TextFile.read("src\\ch12_strings\\Lesson\\L22_TheReplacements.java");
        // Match the specially commented block of text above;
        Matcher mInput =
            Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL)
                .matcher(s);
        if (mInput.find())
            s = mInput.group(1); // Captured by parentheses
        // Replace two or more spaces with a single space:
        s = s.replaceAll(" {2,}", " ");
        // Replace one or more spaces at the beginning of each
        // line with no spaces. Must enable MULTILINE mode:
        s = s.replaceAll("(?m)^ +", "");
        System.out.println(s);
        s = s.replaceFirst("[aeiou]", "(VOWEL1)");
//        System.out.println(s);
        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);
        // Process the find information as you
        // perform the replacements:
        while(m.find())
            m.appendReplacement(sbuf, m.group().toUpperCase());
        // Put in the remainder of the text:

        m.appendTail(sbuf);
        System.out.println(sbuf);

    }
}
