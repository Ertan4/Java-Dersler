package Upcasting;

public class Test {
	
	
	public static void main(String[] args){
		
		Sporcu s=new Sporcu();
		Futbolcu f=new Futbolcu();
		//Futbolcu t=new Sporcu();
		//Sporcu x =new Futbolcu();
		
		KontrolMerkezi.checkUp(s);
		KontrolMerkezi.checkUp(f); //
	}

}
