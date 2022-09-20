package intro;

public class main {

	public static void main(String[] args) {
		double dolarBugun=18.15;
		double dolarDun=18.15;
		String okYonu="";
		if (dolarBugun<dolarDun) {
			okYonu="down.svg";
			System.out.println(okYonu);
		}
		else if (dolarBugun>dolarDun) {
			okYonu="up.svg";
			System.out.println(okYonu);
			
			
		}
		else {
			okYonu="equal.svg";
			System.out.println(okYonu);
		}
	}

}
 