package proje6;

public class Test {
	
	static void hazirol(Asker a){
		a.selamVer();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asker asker =new Asker();
		Er er=new Er();
		Yuzbasi yuzbasi=new Yuzbasi();
		
		
		hazirol(asker);
		hazirol(er);
		hazirol(yuzbasi);
		
	}

}
