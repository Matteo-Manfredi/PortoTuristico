public class Barca {
    private String nome;
    private String nazionalità;
    private double lunghezza;
    private String tipologia;

    public String getNome() {
        return nome;
    }
    public String getNazionalità() {
        return nazionalità;
    }
    public double getLunghezza() {
        return lunghezza;
    }
    public String getTipologia() {
        return tipologia;
    }
    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }
    public void setNazionalità(String nazionalità) {
        this.nazionalità = nazionalità;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int setTipologia(String tipologia) {
        int risultato=0;
        if(tipologia.equals("vela")||tipologia.equals("vela")){
            this.tipologia = tipologia;
        }
        else{
            risultato=-1;
        }
        return risultato;
        
    }
}
