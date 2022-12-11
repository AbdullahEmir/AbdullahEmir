import java.util.Scanner;
public class SoruIkı {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("2 yaş bilgisi girin");
int yas1=input.nextInt();
int yas2=input.nextInt();
int ortalama;
ortalama=(yas1+yas2)/2;
int toplam = 0;
System.out.println("ortama= "+ortalama+" dır");
System.out.println("toplam "+toplam+" dır");

}
}