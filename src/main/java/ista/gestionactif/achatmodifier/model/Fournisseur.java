package ista.gestionactif.achatmodifier.model;

public class Fournisseur extends Person{
    private String intituleEse;
    private String numRegCom;

    public Fournisseur(String nom, String prenom, String numTel, String intituleEse, String numRegCom) {
        super(nom, prenom, numTel);
        this.intituleEse = intituleEse;
        this.numRegCom = numRegCom;
    }

    public Fournisseur(String nom, String prenom, String numTel, String numRegCom) {
        super(nom, prenom, numTel);
        this.intituleEse = "";
        this.numRegCom = numRegCom;
    }

    public String getIntituleEse() {
        return intituleEse;
    }

    public void setIntituleEse(String intituleEse) {
        this.intituleEse = intituleEse;
    }

    public String getNumRegCom() {
        return numRegCom;
    }
}
