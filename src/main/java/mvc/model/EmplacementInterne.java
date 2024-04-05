package mvc.model;

public class EmplacementInterne {
	private int idEmpIn;
	private int idTyEmp;
	private String intituleEmp;
	private String employeEmp;
	private String professionEmp;
	private String intitule_TyEmp;//normalment yji class TypeEmplacement bach n9dou n5dmo b join w nrikipiro bzaf hajat fi derba 
	//chouf wach3sdt fi affecter 
	public int getIdEmpIn() {
		return idEmpIn;
	}
	public void setIdEmpIn(int idEmpIn) {
		this.idEmpIn = idEmpIn;
	}
	public int getIdTyEmp() {
		return idTyEmp;
	}
	public void setIdTyEmp(int idTyEmp) {
		this.idTyEmp = idTyEmp;
	}
	public EmplacementInterne(int idEmpIn, String intituleEmp, String intitule_TyEmp) {
		super();
		this.idEmpIn = idEmpIn;
		this.intituleEmp = intituleEmp;
		this.intitule_TyEmp = intitule_TyEmp;
	}
	public String getIntituleEmp() {
		return intituleEmp;
	}
	public void setIntituleEmp(String intituleEmp) {
		this.intituleEmp = intituleEmp;
	}
	public String getEmployeEmp() {
		return employeEmp;
	}
	public void setEmployeEmp(String employeEmp) {
		this.employeEmp = employeEmp;
	}
	public String getProfessionEmp() {
		return professionEmp;
	}
	public void setProfessionEmp(String professionEmp) {
		this.professionEmp = professionEmp;
	}
	public EmplacementInterne(int idEmpIn, int idTyEmp, String intituleEmp, String employeEmp, String professionEmp) {
		this.idEmpIn = idEmpIn;
		this.idTyEmp = idTyEmp;
		this.intituleEmp = intituleEmp;
		this.employeEmp = employeEmp;
		this.professionEmp = professionEmp;
	}
	public EmplacementInterne(int idEmpIn,  String intituleEmp, String employeEmp, String professionEmp,int idTyEmp,String intitule_TyEmp) {
		super();
		this.idEmpIn = idEmpIn;
		this.idTyEmp = idTyEmp;
		this.intituleEmp = intituleEmp;
		this.employeEmp = employeEmp;
		this.professionEmp = professionEmp;
		this.intitule_TyEmp=intitule_TyEmp;
		
	}
	@Override
	public String toString() {
		return "EmplacementInterne [idEmpIn=" + idEmpIn + ", idTyEmp=" + idTyEmp + ", intituleEmp=" + intituleEmp
				+ ", employeEmp=" + employeEmp + ", professionEmp=" + professionEmp ;
				
	}
	public String getIntitule_TyEmp() {
		return intitule_TyEmp;
	}
	public void setIntitule_TyEmp(String intitule_TyEmp) {
		this.intitule_TyEmp = intitule_TyEmp;
	}
	public EmplacementInterne(int idEmpIn) {
		super();
		this.idEmpIn = idEmpIn;
	}
	
	
	

}
