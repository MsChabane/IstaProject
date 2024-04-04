package ista.gestionactif.achatmodifier.model;

import java.util.Date;

public class Actif {
    private String id;
    private String idInvtr;
    private Date dateInvtr;
    private String desg;
    private double valeur;
    private String obsrv;
    private String bdCmd;//change string
    private String bdLvrs;
    private String idCa;
    private int idGa;//automatique
    private int idFr;// --
    public Actif(String id, String idInvtr, Date dateInvtr, String desg, double valeur, String obsrv, String idCa, int idFr) {
        this.id = id;
        this.idInvtr = idInvtr;
        this.dateInvtr = dateInvtr;
        this.desg = desg;
        this.valeur = valeur;
        this.obsrv = obsrv;
        this.bdCmd = "";//bdlha
        this.bdLvrs = "";//--
        this.idCa = idCa;
        this.idGa = 0;//---
        this.idFr = idFr;
    }
    public Actif(String id, String idInvtr, Date dateInvtr, String desg, double valeur, String obsrv, String idCa, int idFr, int idGa) {
        this(id, idInvtr, dateInvtr, desg, valeur, obsrv, idCa, idFr);
        this.idGa = idGa;
    }

    public Actif(String id, String idInvtr, Date dateInvtr, String desg, double valeur, String obsrv, String idCa, int idFr, String bdCmd, String bdLvrs){
        this(id, idInvtr, dateInvtr, desg, valeur, obsrv, idCa, idFr);
        this.bdCmd = bdCmd;
        this.bdLvrs = bdLvrs;
    }

    public Actif(String id, String idInvtr, Date dateInvtr, String desg, double valeur, String obsrv, String idCa, int idFr, String bdCmd, String bdLvrs, int idGa){
        this(id, idInvtr, dateInvtr, desg, valeur, obsrv, idCa, idFr, bdCmd, bdLvrs);
        this.idGa = idGa;
    }

    public String getId() {
        return id;
    }

    public String getIdInvtr() {
        return idInvtr;
    }

    public Date getDateInvtr() {
        return dateInvtr;
    }

    public String getDesg() {
        return desg;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    public double getValeur() {
        return valeur;
    }

    public String getObsrv() {
        return obsrv;
    }

    public void setObsrv(String obsrv) {
        this.obsrv = obsrv;
    }

    public String getBdCmd() {
        return bdCmd;
    }


    public String getBdLvrs() {
        return bdLvrs;
    }

    public String getIdCa() {
        return idCa;
    }

    public int getIdGa() {
        return idGa;
    }

    public int getIdFr() {
        return idFr;
    }
}