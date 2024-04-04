package ista.gestionactif.achatmodifier.model;

public class Sessions {
    private String id;
    private String titre;
    private String idCh;

    public Sessions(String id, String titre, String idCh) {
        this.id = id;
        this.titre = titre;
        this.idCh = idCh;
    }

    public String getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getIdCh() {
        return idCh;
    }
}
