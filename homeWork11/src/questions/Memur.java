package questions;

import java.util.ArrayList;

	public class Memur extends Muhasebe {
	
	public Memur(String isim,String soyIsim,String adres,String telefon,String statu) {
		super.isim=isim;    //super classtaki variable ulaşma yöntemi
		super.soyIsim=soyIsim;
		super.adres=adres;
		super.telefon=telefon;
		super.statu=statu;
	}
	
	public static void memurlar () {
		Memur memur1=new Memur("Ali","YILMAZ","Ankara","0555 345 65 65", "Sef");
		memur1.idForMemur();   
		memur1.maasHesapla(12.2); 
		
		
		String idString1 = String.valueOf(memur1.id);    
		String maasString1 = String.valueOf(memur1.maas);
		
		
		ArrayList<String> memurListe1=new ArrayList<>();  
		memurListe1.add(memur1.isim);
		memurListe1.add(memur1.soyIsim);
		memurListe1.add(memur1.adres);
		memurListe1.add(memur1.telefon);
		memurListe1.add(memur1.statu);
		memurListe1.add(idString1);				
		memurListe1.add(maasString1);					
		System.out.println(memurListe1);
		
		
		
		
		Memur memur2=new Memur("Ali Osman","CEBECİ","Ankara","0555 345 65 65", "Sef");
		memur2.idForMemur();   
		memur2.maasHesapla(12.2); 
		
		
		String idString2 = String.valueOf(memur2.id);    
		String maasString2 = String.valueOf(memur2.maas);
		
		
		ArrayList<String> memurListe2=new ArrayList<>();  
		memurListe2.add(memur2.isim);
		memurListe2.add(memur2.soyIsim);
		memurListe2.add(memur2.adres);
		memurListe2.add(memur2.telefon);
		memurListe2.add(memur2.statu);
		memurListe2.add(idString2);				
		memurListe2.add(maasString2);					
		System.out.println(memurListe2);
		
		
		
		Memur memur3=new Memur("Ali ","KOC","IZMIR","0555 345 65 65", "Sef");
		memur3.idForMemur();   
		memur3.maasHesapla(12.2); 
		
		
		String idString3 = String.valueOf(memur3.id);    
		String maasString3 = String.valueOf(memur3.maas);
		
		
		ArrayList<String> memurListe3=new ArrayList<>();  
		memurListe3.add(memur3.isim);
		memurListe3.add(memur3.soyIsim);
		memurListe3.add(memur3.adres);
		memurListe3.add(memur3.telefon);
		memurListe3.add(memur3.statu);
		memurListe3.add(idString3);				
		memurListe3.add(maasString3);					
		System.out.println(memurListe3);
		
		
		
		
	}
	
	
}
	
	
		
	
	
	
	


