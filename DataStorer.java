import java.util.ArrayList;

public class DataStorer {
	private static ArrayList<String> list = new ArrayList<String>(5);
	
	synchronized void putData(String data) throws InterruptedException {
		if(list.size()==5) {
			wait(10000);
		}
		list.add(data);
		System.out.println(data +": data placed");
		notify();
	}
	
	synchronized String removeData() throws InterruptedException {
		String remove;
		if(list.isEmpty()) {
			wait(10000);
		}
		remove=list.get(list.size()-1);
		list.remove(list.size()-1);
		System.out.println(remove +": data removed");
		notify();
		return remove;
	}


}
