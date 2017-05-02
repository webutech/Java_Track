package synchronization;

public class TwoStrings {
	
	// This method is not synchronized
   static void print(String str1, String str2) {
        System.out.print(str1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
        }
        System.out.println(str2);
    }

}
