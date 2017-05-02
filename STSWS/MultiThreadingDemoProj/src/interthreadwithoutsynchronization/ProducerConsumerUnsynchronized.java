package interthreadwithoutsynchronization;

public class ProducerConsumerUnsynchronized {

	public static void main(String[] args) {
		NumberProcessMachine nbm=new NumberProcessMachine();
		NumberProducer np=new NumberProducer(nbm,1);
		NumberConsumer nc=new NumberConsumer(nbm,1);
		np.start();
		nc.start();
	}

}
