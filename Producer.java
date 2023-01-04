
public class Producer extends Thread{
	String[] places= {"usa","uk","japan","china","india","aus"};
	public DataStorer getStorer() {
		return storer;
	}
	public void setStorer(DataStorer storer) {
		this.storer = storer;
	}
	DataStorer storer;
	public void run() {
		for(int i=0;i<places.length;i++) {
			try {
				storer.putData(places[i]);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
