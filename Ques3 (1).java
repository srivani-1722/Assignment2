import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques3 {
	
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
            Runnable worker = new FileReadWriteThread();
            executor.execute(worker);
            executor.shutdown();
            System.out.println("file created");
	}

}
