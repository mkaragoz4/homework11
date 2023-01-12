package questions;

import java.util.ArrayList;


public class Isci extends Muhasebe {
	
	public Isci(String isim,String soyIsim,String adres,String telefon,String statu){
		super.isim=isim;    //super classtaki variable ulaşma yöntemi
		super.soyIsim=soyIsim;
		super.adres=adres;
		super.telefon=telefon;
		super.statu=statu;
		
	}
	
	
	public static void main(String[]args) {
		Isci isci1=new Isci("Ahmet","YILMAZ","Ankara","0555 345 65 65", "Sef");
		isci1.idAtama();
		isci1.maasHesapla(33.4);
	
		
		String idString1 = String.valueOf(isci1.id);    //integer olan id değeri String ifadeye dönüştürüldü
		String maasString1 = String.valueOf(isci1.maas);
		
		ArrayList<String> isciListe1=new ArrayList<>();   //ArrayList oluşturuldu
		isciListe1.add(isci1.isim);
		isciListe1.add(isci1.soyIsim);
		isciListe1.add(isci1.adres);
		isciListe1.add(isci1.telefon);
		isciListe1.add(isci1.statu);
		isciListe1.add(idString1);				//aynı classta olduğu için object oluşturulmadan geldi
		isciListe1.add(maasString1);					//aynı classta olduğu için object oluşturulmadan geldi
		System.out.println(isciListe1);
		
		Isci isci2=new Isci("Memet","KARA","Izmir","0554 655 34 34", "Sef Yardimcisi");
		isci2.idAtama();
		isci2.maasHesapla(33.4);
		
		String idString2 = String.valueOf(isci2.id);    //integer olan id değeri String ifadeye dönüştürüldü
		String maasString2 = String.valueOf(isci2.maas);
		
		ArrayList<String> isciListe2=new ArrayList<>();
		isciListe2.add(isci2.isim);
		isciListe2.add(isci2.soyIsim);
		isciListe2.add(isci2.adres);
		isciListe2.add(isci2.telefon);
		isciListe2.add(isci2.statu);
		isciListe2.add(idString2);				//aynı classta olduğu için object oluşturulmadan geldi
		isciListe2.add(maasString2);					//aynı classta olduğu için object oluşturulmadan geldi
		System.out.println(isciListe2);
		
		Isci isci3=new Isci("Ali","KAZIM", "Eskisehir","0555 433 23 12","Operator");
		isci3.idAtama();
		isci3.maasHesapla(13);
		
		String idString3=String.valueOf(isci3.id);
		String maasString3=String.valueOf(isci3.maas);
		
		ArrayList<String> isciListe3=new ArrayList<>();
		isciListe3.add(isci3.isim);
		isciListe3.add(isci3.soyIsim);
		isciListe3.add(isci3.adres);
		isciListe3.add(isci3.telefon);
		isciListe3.add(isci3.statu);
		isciListe3.add(idString3);
		isciListe3.add(maasString3);
		System.out.println(isciListe3);
		
		
		
	}
}