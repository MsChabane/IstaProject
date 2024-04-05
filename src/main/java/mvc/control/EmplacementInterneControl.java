package mvc.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import mvc.model.BaseDonnee;
import mvc.model.EmplacementInterne;


public class EmplacementInterneControl {

		public static boolean siExist(EmplacementInterne emplacementInterne) {
			String query ="SELECT *  FROM Emplacement_Interne WHERE id_Emp = ? ";
			try(Connection connecton = BaseDonnee.getConnection() ;PreparedStatement prpStmt= connecton.prepareStatement(query)){
				 prpStmt.setInt(1, emplacementInterne.getIdEmpIn());
				return prpStmt.executeQuery().next();
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			return false;
			
		}
		public static boolean ajouter(EmplacementInterne emplacementInterne) {
			String query ="INSERT INTO  Emplacement_Interne  (id_EmpIn,intitule_EmpIn,employe_EmpIn,profession_EmpIn,id_TyEmp)values(?,?,?,?,?); ";
			try(Connection connecton = BaseDonnee.getConnection() ;PreparedStatement prpStmt= connecton.prepareStatement(query)){
				 prpStmt.setInt(1, emplacementInterne.getIdEmpIn());
				 prpStmt.setString(2, emplacementInterne.getIntituleEmp());
				 prpStmt.setString(3, emplacementInterne.getEmployeEmp());
				 prpStmt.setString(4, emplacementInterne.getProfessionEmp());
				 prpStmt.setInt(5, emplacementInterne.getIdTyEmp());
				 prpStmt.executeUpdate();
				 return true;
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			return false;
		}
		public static boolean modifier(EmplacementInterne emplacementInterne) {
			String query ="UPDATE emplacement_interne SET intitule_EmpIn=?,employe_EmpIn=?,profession_EmpIn=? WHERE id_EmpIn= ?  ";
			try(Connection connecton = BaseDonnee.getConnection() ;PreparedStatement prpStmt= connecton.prepareStatement(query)){
				 prpStmt.setString(1, emplacementInterne.getIntituleEmp());
				 prpStmt.setString(2, emplacementInterne.getEmployeEmp());
				 prpStmt.setString(3, emplacementInterne.getProfessionEmp());
				 prpStmt.setInt(4, emplacementInterne.getIdEmpIn());
				 prpStmt.executeUpdate();
				 return true;
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			return false;
		}
		public static ArrayList<EmplacementInterne>selectionerParType(int idTyEmp){
			ArrayList<EmplacementInterne>emplacements=new ArrayList<EmplacementInterne>();
			String query="SELECT id_EmpIn,intitule_EmpIn, employe_EmpIn ,profession_EmpIn FROM emplacement_interne WHERE id_TyEmp= ? ;";
			try(Connection connection =BaseDonnee.getConnection();PreparedStatement prpstmt=connection.prepareStatement(query)){
				prpstmt.setInt(1, idTyEmp);
				ResultSet rslt=prpstmt.executeQuery();
				while(rslt.next()) {
					emplacements.add(new EmplacementInterne(rslt.getInt("id_EmpIn"),idTyEmp ,rslt.getString("intitule_EmpIn") ,
							rslt.getString("employe_EmpIn"),rslt.getString("profession_EmpIn") ));
					
				}
				rslt.close();
				
				
			}catch(SQLException e) {
				System.out.println(e);
			}
			return emplacements;
		}
		public static ArrayList<EmplacementInterne>selectioner(){
			ArrayList<EmplacementInterne>emplacements=new ArrayList<EmplacementInterne>();
			String query="SELECT id_EmpIn,intitule_EmpIn , employe_EmpIn ,id_TyEmp,profession_EmpIn FROM emplacement_interne ;";
			try(Connection connection =BaseDonnee.getConnection();Statement stmt=connection.createStatement()){
				
				ResultSet rslt=stmt.executeQuery(query);
				while(rslt.next()) {
					emplacements.add(new EmplacementInterne(rslt.getInt("id_EmpIn"),rslt.getInt("id_TyEmp"),rslt.getString("intitule_EmpIn") ,
							rslt.getString("employe_EmpIn"),rslt.getString("profession_EmpIn") ));
				}
				rslt.close();
			}catch(SQLException e) {
				System.out.println(e);
			}
			return emplacements;
		}
		
		
		
		
		
}
