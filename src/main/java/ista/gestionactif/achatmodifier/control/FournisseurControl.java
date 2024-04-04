package ista.gestionactif.achatmodifier.control;

import ista.gestionactif.achatmodifier.model.BaseDonnee;
import ista.gestionactif.achatmodifier.model.Fournisseur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FournisseurControl {

    public static int getID(Fournisseur fournisseur){
        String query = "SELECT * FROM Fournisseur WHERE numRegCom_Fr = ?";

        try (Connection connection = BaseDonnee.getConnection()){
            PreparedStatement prpStmt = connection.prepareStatement(query);
            prpStmt.setString(1, fournisseur.getNumRegCom());
            ResultSet rs = prpStmt.executeQuery();
            if(rs.next())
                return rs.getInt("id_Fr");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return -1;
    }

    public static boolean siExist(Fournisseur fournisseur){
        String query = "SELECT * FROM Fournisseur WHERE numRegCom_Fr = ?";

        try (Connection connection = BaseDonnee.getConnection()){
            PreparedStatement prpStmt = connection.prepareStatement(query);
            prpStmt.setString(1, fournisseur.getNumRegCom());
            return prpStmt.executeQuery().next();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public static boolean ajouter (Fournisseur fournisseur){
        String query = "INSERT INTO Fournisseur(nom_Fr, prenom_Fr, numTel_Fr, intituleEse_Fr, numRegCom_Fr) VALUE (?, ?, ?, ?, ?);";
        return executeUpdate(fournisseur, query);
    }

    public static boolean modifier(Fournisseur fournisseur){
        String query = "UPDATE Fournisseur SET nom_Fr = ?, prenom_Fr = ?, numTel_Fr = ?, intituleEse_Fr = ? WHERE numRegCom_Fr = ?";
        return executeUpdate(fournisseur, query);
    }

    private static boolean executeUpdate(Fournisseur fournisseur, String query) {
        try(Connection connection = BaseDonnee.getConnection()){
            PreparedStatement prpStmt = connection.prepareStatement(query);
            prpStmt.setString(1, fournisseur.getNom());
            prpStmt.setString(2, fournisseur.getPrenom());
            prpStmt.setString(3, fournisseur.getNumTel());
            prpStmt.setString(4, fournisseur.getIntituleEse());
            prpStmt.setString(5, fournisseur.getNumRegCom());
            prpStmt.executeUpdate();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
