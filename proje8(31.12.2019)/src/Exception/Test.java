package Exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Test {
	
	public static void main(String args[]){
		
		/*
		try{
			
			int x=5;
			int y=0;
			//int z=x/y;
			//System.out.println(z);
			
			int dizi[]=new int[3];
			
			for(int i=0; i<4; i++){
				dizi[i]=i;
				
			}
			
			catch (Exception e) {// en baþta bunu yazarsak direk bu exception a düþeceði için aþaðýdakileri anlamsýz olur.
				System.out.println("genel bir hata var .");
				
			}
			
		} catch (ArithmeticException e){//eception türlerini yazarak burada hangi exception türü oldugu bulunur.
			System.out.println("Programda bir hata var..");
			e.printStackTrace();
			
		} catch(ArrayIndexOutOfBoundsException e ){
			System.out.println("dizi boyutu aþma hatasi");
		}
		catch (Exception e) {
			System.out.println("genel bir hata var .");
		}finally {
			System.out.println("Her durumda burasi çalýþacak");
		}
		*/
		try {
			cokCalis();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Hata yakalandý.");
			
		}
		
		
		
	}
	public static void cokCalis() throws Exception
	{
		File f=new File("Ornek.txt");
		BufferedReader bf =new BufferedReader(new FileReader(f));
		
	}
	
	
		
	

}
