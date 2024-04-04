package ista.gestionactif.achatmodifier.model;

public class Chapitre {
    private String id;
    private String titre;

    public Chapitre(String id, String titre) {
        this.id = id;
        this.titre = titre;
    }

    public String  getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
