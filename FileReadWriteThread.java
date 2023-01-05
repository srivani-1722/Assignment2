import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWriteThread implements Runnable{

	@Override
	public void run() {
		try {
		FileReader filereader = new FileReader("E:\\SriVani\\workspace\\Threads\\src\\read");
		FileWriter filewriter = new FileWriter("E:\\SriVani\\workspace\\Threads\\src\\write");
		String str = "";

        int i;
        while ((i = filereader.read()) != -1) {
            str += (char)i;
        }
        filewriter.write(str);
        filereader.close();
        filewriter.close();	
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}
	
}
