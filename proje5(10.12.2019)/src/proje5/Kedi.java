package proje5;

public class Kedi extends Hayvan{
	
	
	public Kedi(){
		
		System.out.println("Kedi nesnesi olu�turuluyor.. ");
		
	}
	
	void sesCikar(){
		System.out.println("M�YAV:.."); //overWriting ile ana s�n�ftaki(Hayvan s�n�f�ndaki) methodu ezdik.
		
	}

}
