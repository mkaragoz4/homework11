package questions;

/*
•	Personel classina class seviyesinde id,isim,soyisim,address ve telefon datalaarinin deklerasyonunu yapin. Id atamasi, idAtama() methodunda olusturacaginiz programla yapilacak olup her calisana farkli bir id verilecektir. Id’ ler 6 basamakli bir sayi olarak tanimlanacaktir.  
•	Muhasebe classina saatlikUcret, statu ve maas datalarinin deklerasyonunu yapin. maasHesapla() methodu olusturun. Maas hesaplamak icin (maas=saatlikUcret*8*30) formulunu kullanin. Formuldeki 8 rakami gunluk calisma saatini, 30 ise bir aydaki otuz is gununu temsil etmektedir.
•	Parent (Super) classlardaki veriable’ lari kullanarak Isci classindan 3 adet isci olusturun. Olusturulan iscilerin tum bilgilerini array liste aktarin ve daha sonra consol’ a yazdirin.
•	Parent (Super) classlardaki veriable’ lari kullanarak Memur classindan 3 adet memur olusturun. Olusturulan memurlarin tum bilgilerini array liste aktarin ve daha sonra consol’ a yazdirin.

*/
public class Personel {
	public int id;
	public static int sayac=123100;  //static olmasının nedeni eski degerini silip yeni değer oluşturması
	public static int sayac2=152000;
	public String isim;
	public String soyIsim;
	public String adres;
	public String telefon;
	
	public void idAtama() {   // Her çalışana farklı bir id vermek için bir id üretme kodu
		id=sayac;
		sayac++;
			
	}
	
	public void idForMemur() {
		id=sayac2;
		sayac++;
		
	}
	
  }
 
