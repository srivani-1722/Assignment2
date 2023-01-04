
public class Table extends Thread {
		int t;  
		TablePrinter printer;
		
		  public Table(int t, TablePrinter printer) {
			this.t = t;
			this.printer = printer;
		}

		public void run(){  
			printer.printtable(t);
		} 

}
