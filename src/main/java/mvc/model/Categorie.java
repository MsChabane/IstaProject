package mvc.model;

public class Categorie {
    private String id;
    private String dscp;
    private String idSes;

    public Categorie(String id, String dscp, String idSes) {
        this.id = id;
        this.dscp = dscp;
        this.idSes = idSes;
    }

    public String getId() {
        return id;
    }

    public String getDscp() {
        return dscp;
    }

    public void setDscp(String dscp) {
        this.dscp = dscp;
    }

    public String getIdSes() {
        return idSes;
    }
}
