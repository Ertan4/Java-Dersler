package package1;

public class Televizyon {
	//yukar��evrim (Upcasting)
	public static void main(String args[])
	{
		XModel xmodel_kumanda=new YModel();
		XModel model=(XModel) new YModel();
		
		xmodel_kumanda.sesAc();
		xmodel_kumanda.sesKapat();
		xmodel_kumanda.kanlDegis();
		//Hata bu kumandada b�yle bir d��me yok ! 
		//xmodel_kumanda.teleText();
		
		
		
	}

}
