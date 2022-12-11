package javaapp;

import java.util.Scanner;
class app {

 	public static void main(String[] args) {
 	Scanner input=new Scanner(System.in);
 	int sayı=input.nextInt();
 	if(sayı<0){
 		System.out.println("Sayının mutlak değeri "+(sayı+(-2*sayı))+" dir");
 	}else if(sayı==0) {
 		System.out.println("Saynın mutlak değeri"+sayı+" dır");
 	}else if(sayı>0){
 		System.out.println("Saynın mutlak değeri"+sayı+" dır");
 	}
 	}
}
	