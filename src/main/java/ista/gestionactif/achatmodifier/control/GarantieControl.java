package ista.gestionactif.achatmodifier.control;

import ista.gestionactif.achatmodifier.model.Garantie;
import ista.gestionactif.achatmodifier.model.BaseDonnee;

import java.sql.*;

public class GarantieControl {

    public static int getDernierID(){
        String query = "SELECT * FROM Garantie ORDER BY id_Ga DESC LIMIT 1 ";

        try (Connection connection = BaseDonnee.getConnection();){
            PreparedStatement prpStmt = connection.prepareStatement(query);
            ResultSet rs = prpStmt.executeQuery();
            if(rs.next())
                return rs.getInt("id_Ga");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return -1;
    }

    public static int ajouter (Garantie garantie){
        String query = "INSERT INTO Garantie(dtDeb_Ga, duree_Ga, unit_Ga, cndt_Ga, type_Ga) VALUE (?, ?, ?, ?, ?);";

        try(Connection connection = BaseDonnee.getConnection()){
            PreparedStatement prpStmt = connection.prepareStatement(query);
            prpStmt.setDate(1, new Date(garantie.getDtDeb().getTime()));
            prpStmt.setInt(2, garantie.getDuree());
            prpStmt.setString(3, String.valueOf(garantie.getUnit()));
            prpStmt.setString(4, garantie.getCndt());
            prpStmt.setString(5, garantie.getType());
            prpStmt.executeUpdate();
            return getDernierID();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return -1;
    }

}
