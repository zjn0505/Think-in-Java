package ch10_holding.Lesson;

import java.util.*;

/**
 * Created by Jienan on 2017/2/23.
 */
// Arrays.asList() makes its best guess about type.
class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class L06_AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(
                new Crusty(), new Slush(), new Powder()
        );
        // Doesn't allow before JDK8, since it will return List<Powder>
        List<Snow> snow2 = Arrays.asList(
                new Light(), new Heavy()
        );
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());

        List<Snow> snow4 = Arrays.<Snow>asList(
                new Light(), new Heavy()
        );
    }
}
