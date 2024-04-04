package ista.gestionactif.achatmodifier.control;

import ista.gestionactif.achatmodifier.model.BaseDonnee;
import ista.gestionactif.achatmodifier.model.Categorie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategorieControl {
    public static boolean isExist(Categorie categorie){
        String query = "SELECT * FROM Categorie WHERE id_Ca = ?";

        try(Connection connection = BaseDonnee.getConnection()){
            PreparedStatement prpStmt = connection.prepareStatement(query);
            prpStmt.setString(1, categorie.getId());
            return prpStmt.executeQuery().next();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public static boolean ajouter(Categorie categorie) {
        String query = "INSERT INTO Categorie(id_Ca, dscp_Ca, id_Ses) VALUE (?, ?, ?);";

        try(Connection connection = BaseDonnee.getConnection()){
            PreparedStatement prpStmt = connection.prepareStatement(query);
            prpStmt.setString(1, categorie.getId());
            prpStmt.setString(2, categorie.getDscp());
            prpStmt.setString(3, categorie.getIdSes());
            prpStmt.executeUpdate();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public static boolean modifier(Categorie categorie){
        String query = "UPDATE Categorie SET dscp_Ca = ? WHERE id_Ca = ?";

        try(Connection connection = BaseDonnee.getConnection()){
            PreparedStatement prpStmt = connection.prepareStatement(query);
            prpStmt.setString(1, categorie.getDscp());
            prpStmt.setString(2, categorie.getId());
            prpStmt.executeUpdate();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
