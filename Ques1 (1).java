
public class Ques1 {
 public static void main(String[] args) {
		DataStorer storer=new DataStorer();
		Consumer consumer=new Consumer();
		Producer producer=new Producer();
		consumer.setStorer(storer);
		producer.setStorer(storer);
		producer.start();
		consumer.start();
}

}
