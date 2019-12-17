package Ornek;

public class Test {
	public static Hayvan rasgeleSec(){
		int sec=(int) (Math.random()*3);
		System.out.println("Geeln sayi: "+sec);
		
		
		Hayvan h=null;
		if(sec==0) h=new Hayvan();
		else if(sec==1) h=new Kartal();
		else if(sec==2) h=new Timsah();
		
		return h;
		
		
	}
	
	public static void main(String[] args){
		Hayvan dizi[]=new Hayvan[3];
		
		for(int i=0; i<dizi.length;i++){
			dizi[i]=rasgeleSec();
			
		}
		for(int i=0; i<dizi.length;i++){
			
			dizi[i].avYakala();
			
			
		}
	}

}
