package proje5;

import kedi2.Kedi2;


public class Test {
	public static void main(String[] args){
		
		Hayvan h=new Hayvan();
		h.yas=5;
		//h.sesCikar();
		
		Kedi k=new Kedi();
		k.yas=6;
		//k.sesCikar();
		//System.out.println("hayvan yas:"+h.yas+"kedi yas:"+k.yas);
		
		Kedi2 k2=new Kedi2();
		k2.yas=8;
		
		
		VanKedisi vk=new VanKedisi();
		//vk.sesCikar();
		
		System.out.println("hayvan yas: "+h.yas+" kedi yas: "+k.yas+" k2 yas: "+k2.yas);
		
	}

}
