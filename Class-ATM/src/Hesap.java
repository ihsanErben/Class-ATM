
public class Hesap {
    private String tc;
    private String parola;
    private int bakiye; 

    public Hesap(String tc, String parola, int bakiye) {
        this.tc = tc;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    public void para_cek(int miktar){
    
    if(miktar < bakiye){
    bakiye -= miktar;
    System.out.println("hesabinizdan " + miktar  + " TL para cekildi. Guncel bakiye:  " + bakiye);
    }
    else{
    System.out.println("Para cekilenemdi, yetersiz bakiye! Anlik bakiyeniz: " + bakiye);
    }
    }
    
    public void para_yatir(int miktar){
        bakiye += miktar;
        System.out.println("Hesabiniza " + miktar + " TL para yatirildi. Guncel bakiyeniz: " + bakiye);
        
    }
    
    
}
