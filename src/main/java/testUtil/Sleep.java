package testUtil;

public class Sleep {
    public static void sleep(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public void sleep(int i){
//        try {
//            Thread.sleep(i);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}
