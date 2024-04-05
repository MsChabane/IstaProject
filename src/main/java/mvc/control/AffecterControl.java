package mvc.control;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import mvc.model.Actif;
import mvc.model.Affecter;
import mvc.model.BaseDonnee;
import mvc.model.EmplacementInterne;


public class AffecterControl {
	public static  boolean ajouter(Affecter affecter) {
		
			String query ="INSERT INTO affecter (id_Ac,date_Af,id_EmpIn) values (?,?,?);";
			try(Connection connecton = BaseDonnee.getConnection() ;PreparedStatement prpStmt= connecton.prepareStatement(query)){
				 prpStmt.setString(1, affecter.getActif().getId());
				 prpStmt.setDate(2, new Date(affecter.getDateAf().getTime()));
				 prpStmt.setInt(3, affecter.getEmplacementInterne().getIdEmpIn());
				 return prpStmt.executeUpdate()>0;
				 
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			return false;
	}
	
	public static  boolean modifier(Affecter affecter) {
		String query ="UPDATE affecter  SET id_EmpIn =? WHERE id_Ac= ? and date_Af= ?";
		try(Connection connecton = BaseDonnee.getConnection() ;PreparedStatement prpStmt= connecton.prepareStatement(query)){
			 prpStmt.setInt(1, affecter.getEmplacementInterne().getIdEmpIn());
			 prpStmt.setString(2, affecter.getActif().getId());
			 prpStmt.setDate(3, new Date(affecter.getDateAf().getTime()));
			 
			 return prpStmt.executeUpdate()>0;
			 
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	public static ArrayList<Affecter> selectionEnPeriode(java.util.Date debut,java.util.Date fin) {
		ArrayList<Affecter> affectations=new ArrayList<Affecter>();
		String query="SELECT actif.id_Ac,actif.idInvtr_Ac,actif.desg_Ac,affecter.date_Af ,emplacement_interne.id_EmpIn,emplacement_interne.intitule_EmpIn,type_emplacement.intitule_TyEmp\r\n"
				+ " from AFFECTER\r\n"
				+ " INNER JOIN actif\r\n"
				+ " ON actif.id_Ac=affecter.id_Ac\r\n"
				+ " Inner JOIN  emplacement_interne \r\n"
				+ " On emplacement_interne.id_EmpIn=affecter.id_EmpIn\r\n"
				+ " Inner Join type_emplacement\r\n"
				+ " on emplacement_interne.id_TyEmp=type_emplacement.id_TyEmp"
				+ "WHERE date_Af BETWEEN  ? and ?;";//fi mysql tmchi mais hna mn3rf 3lah m7btch;
		try(Connection connection =BaseDonnee.getConnection();PreparedStatement prpstmt=connection.prepareStatement(query)){
			prpstmt.setDate(1, new java.sql.Date (debut.getTime()));
			prpstmt.setDate(2, new java.sql.Date (fin.getTime()));
			
			ResultSet rslt=prpstmt.executeQuery();
			while(rslt.next()) {
				affectations.add(new Affecter(
						new  Actif(rslt.getString("id_Ac"),rslt.getString("idInvtr_Ac"),rslt.getString("desg_Ac")),
						new Date(rslt.getDate("date_Af").getTime()),
						new EmplacementInterne(rslt.getInt("id_EmpIn"), rslt.getString("intitule_EmpIn") , rslt.getString("intitule_TyEmp"))
						));
			}
			rslt.close();
		}catch(SQLException e) {
			System.out.println(e);
		}
		return affectations;
		
	} 
	public static ArrayList<Affecter> consulter() {
		ArrayList<Affecter> affectations=new ArrayList<Affecter>();
		String query="SELECT actif.id_Ac,actif.idInvtr_Ac,actif.desg_Ac,affecter.date_Af ,emplacement_interne.id_EmpIn,emplacement_interne.intitule_EmpIn,type_emplacement.intitule_TyEmp\r\n"
				+ " from AFFECTER\r\n"
				+ " INNER JOIN actif\r\n"
				+ " ON actif.id_Ac=affecter.id_Ac\r\n"
				+ " Inner JOIN  emplacement_interne \r\n"
				+ " On emplacement_interne.id_EmpIn=affecter.id_EmpIn\r\n"
				+ " Inner Join type_emplacement\r\n"
				+ " on emplacement_interne.id_TyEmp=type_emplacement.id_TyEmp;";
		try(Connection connection =BaseDonnee.getConnection();Statement stmt=connection.createStatement()){
			
			ResultSet rslt=stmt.executeQuery(query);
			while(rslt.next()) {
				affectations.add(new Affecter(
						new  Actif(rslt.getString("id_Ac"),rslt.getString("idInvtr_Ac"),rslt.getString("desg_Ac")),
						new Date(rslt.getDate("date_Af").getTime()),
						new EmplacementInterne(rslt.getInt("id_EmpIn"), rslt.getString("intitule_EmpIn") , rslt.getString("intitule_TyEmp"))
						));
			}
			rslt.close();
		}catch(SQLException e) {
			System.out.println(e);
		}
		return affectations;
	}
	
	
}
