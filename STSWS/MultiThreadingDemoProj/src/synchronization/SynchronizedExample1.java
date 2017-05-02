package synchronization;

public class SynchronizedExample1 {

	public static void main(String[] args) {
		new PrintStringsSynchonizedThread("Hello ", "there.");
        new PrintStringsSynchonizedThread("How are ", "you?");
        new PrintStringsSynchonizedThread("Thank you ", "very much!");
	}

}
