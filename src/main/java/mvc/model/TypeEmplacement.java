package mvc.model;

public class TypeEmplacement {
	private int idTyEmp;
	private String intituleTyEmp;
	
	public int getIdTyEmp() {
		return idTyEmp;
	}
	public void setIdTyEmp(int idTyEmp) {
		this.idTyEmp = idTyEmp;
	}
	public String getIntituleTyEmp() {
		return intituleTyEmp;
	}
	public void setIntituleTyEmp(String intituleTyEmp) {
		this.intituleTyEmp = intituleTyEmp;
	}
	public TypeEmplacement(int idTyEmp, String intituleTyEmp) {
		
		this.idTyEmp = idTyEmp;
		this.intituleTyEmp = intituleTyEmp;
	}
	@Override
	public String toString() {
		return "TypeEmplacement [idTyEmp=" + idTyEmp + ", intituleTyEmp=" + intituleTyEmp + "]";
	}
	
	
}
