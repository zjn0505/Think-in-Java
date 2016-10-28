package ch09_InnerClasses.Lesson;

/**
 * Created by Jienan on 2016/10/26.
 */
// Nesting a class within a scope.
public class L09_Parcel6 {
    private void internalTracking(boolean b) {
        if(b) {
            class TrackingSlip {
                private String id;
                TrackingSlip(String s) {
                    id = s;
                }
                String getSlip() { return id; }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
        // Can't use it here! Out of scope;
        //! TrackingSlip ts = new TrackingSlip("x");
    }
    public void track() { internalTracking(true); }

    public static void main(String[] args) {
        new L09_Parcel6().track();
    }
}
