package mvc.model;

import java.util.Date;

public class Affecter {
	private Actif actif;
	private Date dateAf;
	private EmplacementInterne emplacementInterne;
	public Actif getActif() {
		return actif;
	}
	public void setActif(Actif actif) {
		this.actif = actif;
	}
	public Date getDateAf() {
		return dateAf;
	}
	public void setDateAf(Date dateAf) {
		this.dateAf = dateAf;
	}
	public EmplacementInterne getEmplacementInterne() {
		return emplacementInterne;
	}
	public void setEmplacementInterne(EmplacementInterne emplacementInterne) {
		this.emplacementInterne = emplacementInterne;
	}
	public Affecter(Actif actif, Date dateAf, EmplacementInterne emplacementInterne) {
		this.actif = actif;
		this.dateAf = dateAf;
		this.emplacementInterne = emplacementInterne;
	}
	@Override
	public String toString() {
		return "Affecter [actif=" + actif.getId() +" "+actif.getIdInvtr()+ " "+actif.getDesg()+", dateAf=" + dateAf + ", emplacementInterne=" + emplacementInterne.getIdEmpIn() 
				
				+" "+ emplacementInterne.getIntituleEmp() +" "+emplacementInterne.getIntitule_TyEmp();
	}
	
	
	
	
	
	
	
}
