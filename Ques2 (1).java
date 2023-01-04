
public class Ques2 {
	public static void main(String[] args) {
		TablePrinter printer=new TablePrinter();
		Table tab3=new Table(2,printer);
		Table tab2=new Table(3,printer);
		tab2.start();
		tab3.start();

	}

}
