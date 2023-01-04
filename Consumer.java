
public class Consumer extends Thread {
	DataStorer storer;
	public DataStorer getStorer() {
		return storer;
	}
	public void setStorer(DataStorer storer) {
		this.storer = storer;
	}
	public void run() {
		while(true) {
			try {
				if(storer.removeData()==null)
					break;
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
