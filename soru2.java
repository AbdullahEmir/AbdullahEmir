package soru;
import java.util.Scanner;
public class soru2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double cevap, mod, sayı,bolen;
		sayı=input.nextDouble();
		bolen=input.nextDouble();
		cevap=sayı/bolen;
		System.out.println(cevap);
		mod=sayı-(cevap*bolen);
		System.out.println(mod);
	}

}
