package v46;

//Skapa ett program som l�ser in textrader fr�n 
//konsolen och avslutas n�r texten EXIT skrivs in.
import java.util.Scanner;

public class uppgift2 {

	public static void main(String[] args) {
		Scanner patte = new Scanner(System.in);
		boolean bigman = true;
		
		while(bigman) {
			String text = patte.next();
			if(text .equals("exit")) {
				bigman = false;
		
			}
			
		}

	}

}
