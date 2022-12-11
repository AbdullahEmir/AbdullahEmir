
public class Soru {
public static void main(String[]args) {
int sayı1=1, sayı2=1, toplam=0;
	System.out.print(sayı1+", "+sayı2);
	for(int i=2;i<5;i++) {
		toplam=sayı1+sayı2;
		sayı1=sayı2;
		sayı2=toplam;
		System.out.print(", "+toplam);
	}
	System.out.println(" ");
}
}
