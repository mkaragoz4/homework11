package questions;

public class Muhasebe extends Personel {
	protected int saatlikUcret;
	protected String statu;
	protected double maas;
	
	public void maasHesapla(double saatlikUcret) {
		this.maas = saatlikUcret * 8 * 30;
	}
	
	
}
