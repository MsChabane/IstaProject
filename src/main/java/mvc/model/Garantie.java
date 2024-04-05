package mvc.model;

import java.util.Date;

public class Garantie {
    private int id;
    private Date dtDeb;
    private int duree;
    private Unit unit;
    private String cndt;
    private String type;

    public Garantie(Date dtDeb, int duree, Unit unit, String type) {
        this.dtDeb = dtDeb;
        this.duree = duree;
        this.unit = unit;
        this.type = type;
        this.cndt = "";
    }

    public Garantie(Date dtDeb, int duree, Unit unit, String cndt, String type) {
        this(dtDeb, duree, unit, type);
        this.cndt = cndt;
    }



    public Date getDtDeb() {
        return dtDeb;
    }

    public int getDuree() {
        return duree;
    }

    public String getCndt() {
        return cndt;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public Unit getUnit() {return unit;}

    public String getDureeComplet(){
        return String.valueOf(getDuree()) + " " + getUnit();
    }

    public void setId(int id){
        this.id = id;
    }
}
