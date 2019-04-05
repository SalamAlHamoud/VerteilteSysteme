
package Hallo;


public class Meldung{

	private final  String nr;
        private final String name;
	private final boolean frau;
        private final int alter;
        private final double gewicht;
        private final double grosse;
	private String kommentar;

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
    }
    

	