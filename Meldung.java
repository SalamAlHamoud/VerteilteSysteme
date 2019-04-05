
package Hallo;


public class Meldung{

	final  String nr;
        final String name;
	final boolean frau;
        final int alter;
        final double gewicht;
        final double grosse;
	String kommentar;

	public Meldung(String nr,String name,boolean frau,int alter,double gewicht,double grosse, String kommentar) {
		this.nr = nr;
		this.name = name;
		this.frau = frau;
		this.alter = alter;
		this.gewicht = gewicht;
                this.grosse = grosse;
		this.setKommentar(kommentar);

	}

    private void setKommentar(String kommentar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }}
    

	