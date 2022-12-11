import java.util.Scanner;
public class SoruIkı {
public static void main(String[] args) {
	Scanner giriş=new Scanner(System.in);
	double gelir,vergi;
	System.out.println("Gelirinizi girin");
	gelir=giriş.nextDouble();
	if (gelir<=150000) {
		System.out.println("vergi "+gelir/4+" TL");
	}else if(gelir<=300000) {
		System.out.println("vergi "+gelir*0.3+" TL");
	}else if(gelir<=600000) {
		System.out.println("vergi "+gelir*0.35);
	}else if(gelir<=1200000) {
		System.out.println("vergi "+gelir*0.4);
	}
	System.out.println("vergi"+gelir/2+" TL");
}
}