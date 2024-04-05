package mvc.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import mvc.model.BaseDonnee;
import mvc.model.TypeEmplacement;

public class TypeEmplacementControl {

	
	public static boolean siExist(TypeEmplacement typeEmplacement) {
		String query ="SELECT *  FROM type_emplacement WHERE id_TyEmp = ? ";
		try(Connection connecton = BaseDonnee.getConnection() ;PreparedStatement prpStmt= connecton.prepareStatement(query)){
			 prpStmt.setInt(1, typeEmplacement.getIdTyEmp());
			return prpStmt.executeQuery().next();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
		
	}
	public static boolean ajouter(TypeEmplacement typeEmplacementT) {
		String query ="INSERT INTO  type_emplacement  (intitule_TyEmp)values(?); ";
		try(Connection connecton = BaseDonnee.getConnection() ;PreparedStatement prpStmt= connecton.prepareStatement(query)){
			 
			 prpStmt.setString(1, typeEmplacementT.getIntituleTyEmp());
			 return prpStmt.executeUpdate()>0;
			 
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	public static boolean modifier(TypeEmplacement typeEmplacementT) {
		String query =" UPDATE type_emplacement SET intitule_TyEmp = ? WHERE id_TyEmp = ?;";
		try(Connection connecton = BaseDonnee.getConnection() ;PreparedStatement prpStmt= connecton.prepareStatement(query)){
			 
			prpStmt.setInt(1, typeEmplacementT.getIdTyEmp());
			 prpStmt.setString(2, typeEmplacementT.getIntituleTyEmp());
			 return prpStmt.executeUpdate()>0;
			 
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	public static ArrayList<TypeEmplacement>selectioner(){
		ArrayList<TypeEmplacement>types_emplacement=new ArrayList<TypeEmplacement>();
		String query="SELECT * FROM type_emplacement ;";
		try(Connection connection =BaseDonnee.getConnection();Statement stmt=connection.createStatement()){
			
			ResultSet rslt=stmt.executeQuery(query);
			while(rslt.next()) {
				types_emplacement.add(new TypeEmplacement(rslt.getInt("id_TyEmp"),rslt.getString("intitule_TyEmp")));
			}
			rslt.close();
		}catch(SQLException e) {
			System.out.println(e);
		}
		return types_emplacement;
	}
	
}
