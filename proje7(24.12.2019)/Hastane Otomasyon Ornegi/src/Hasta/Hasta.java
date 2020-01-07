package Hasta;

import Hastaliklar.Hastalik;
import HastaneOtomasyon.Doktor;

public class Hasta {
	private String ad;
	private String TCkimlikno;
	
	public Doktor[] doktorListesi=new Doktor[3];
	public Hastalik[] hastalikListesi=new Hastalik[3];
	
	
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getTCkimlikno() {
		return TCkimlikno;
	}
	public void setTCkimlikno(String tCkimlikno) {
		TCkimlikno = tCkimlikno;
	}
	
	
	
	

}
