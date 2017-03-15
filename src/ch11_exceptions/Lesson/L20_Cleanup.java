package ch11_exceptions.Lesson;

/**
 * Created by Jienan on 2017/3/15.
 */
// Guaranteeing proper cleanup of a resource.
public class L20_Cleanup {
    public static void main(String[] args) {
        try {
            L19_InputFile in = new L19_InputFile("src\\ch11_exceptions\\Lesson\\L20_Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null)
                    ; // Perform line-by-line processing here...
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile construction failed");
        }
    }
}
