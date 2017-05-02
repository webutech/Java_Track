package synchronization;

public class SynchronizedExample2 {

	public static void main(String[] args) {
		TwoStringsSynchronizedBlock tsb=new TwoStringsSynchronizedBlock();
		new PrintStringsSynchonizedBlockThread("Hello ", "there.",tsb);
        new PrintStringsSynchonizedBlockThread("How are ", "you?",tsb);
        new PrintStringsSynchonizedBlockThread("Thank you ", "very much!",tsb);
	}

}
