import java.util.Scanner;
public class Yenı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner giriş=new Scanner(System.in);
	System.out.println("Ortalamasını bulunmasını istediğiniz iki sayıyı girin : ");
		double sayı1,sayı2;
		sayı1=giriş.nextDouble();
		sayı2=giriş.nextDouble();
	System.out.println("Girilen sayıların ortalaması = " + (sayı1+sayı2)/2);
	
	
	}

}
