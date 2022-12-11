package soru;
import java.util.Scanner;
public class atamasorusu {
	public static void main(String[]args) {
	double sayı1,sayı2;
	double sayı3=0;
	Scanner input=new Scanner(System.in);
	System.out.println("Birbirlerine atanmasını istediğiniz iki sayıyı giriniz : ");
	sayı1=input.nextDouble();
	sayı2=input.nextDouble();
	sayı2=sayı1-sayı2;
	sayı1=sayı1-sayı2;
	sayı2=sayı1+sayı2;
	System.out.println("sayı1 = "+sayı1+" sayı2 = "+sayı2);
}
}