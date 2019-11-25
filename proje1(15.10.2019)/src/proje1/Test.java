package proje1;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;;

public class Test {

	/*
	 * public static void main(String args[]) {
	 * 
	 * int a; int b;
	 * 
	 * 
	 * Scanner scn=new Scanner(System.in);
	 * System.out.println("Birinci sayiyi giriniz: "); a=scn.nextInt();
	 * System.out.println("ikinci sayiyi giriniz: "); b=scn.nextInt();
	 * 
	 * 
	 * System.out.println("a+b="+(a+b));
	 */
	/*
	 * String ad,soyad,yas;
	 * ad=JOptionPane.showInputDialog(null,"Ýsminizi Giriniz: "); //arayüz
	 * eklemek için gerekli
	 * soyad=JOptionPane.showInputDialog(null,"Soyadýnýzý giriniz:");
	 * yas=JOptionPane.showInputDialog(null,"Yaþýnýzý giriniz: ");
	 * 
	 * String sonuc="ADINIZ:"+ad+"\nSOYADINIZ:"+soyad+"\nYASINIZ:"+yas;
	 * 
	 * JOptionPane.showMessageDialog(null, sonuc);
	 *//*
		 * 
		 * for(int i=0; i<=10; i++){ if(i%2==0){ System.out.println(i+
		 * " Çift Sayidir"); } else{ System.out.println(i+ " Tek sayidir "); }
		 * 
		 * 
		 * }
		 * 
		 * Random r = new Random(); int tahmin = r.nextInt(100);//int
		 * tahmin=(int)(Math.random()*100;) int deneme = 1;
		 * 
		 * Scanner scn = new Scanner(System.in);
		 * 
		 * boolean bulundu = false; while (!bulundu) {
		 * System.out.println("Bir sayi giriniz: "); int sayi = scn.nextInt();
		 * 
		 * if (sayi == tahmin) { System.out.println("Tebrikler..." + deneme +
		 * " denemede buldunuz.. "); bulundu = true;
		 * 
		 * } else if (sayi < tahmin) {
		 * System.out.println("Daha büyük bir sayi giriniz..");
		 * 
		 * } else { System.out.println("Daha Küçük bir sayi giriniz.."); }
		 * deneme++;
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * }
		 */

	int toplama(int x, int y) {
		return x + y;

	}

	int cikarma(int x, int y) {
		return x - y;
	}

	int bolme(int x, int y) {
		return x / y;
	}

	int carpma(int x, int y) {
		return x * y;
	}

	public static void main(String args[]) {
		Test t = new Test();
		System.out.println("Toplama: " + t.toplama(10, 5));
		System.out.println("Cikarma: " + t.cikarma(10, 5));
		System.out.println("Bolme: " + t.bolme(10, 5));
		System.out.println("Carpma: " + t.carpma(10, 5));

	}

}
