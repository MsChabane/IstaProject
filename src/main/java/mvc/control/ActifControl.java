package mvc.control;

import java.sql.*;

import Exceptions.ActifException;
import mvc.model.Actif;
import mvc.model.BaseDonnee;

public class ActifControl{

    public static boolean siExist(Actif actif){
        String query = "SELECT * FROM Actif WHERE id_Ac = ?";

        try (Connection connection = BaseDonnee.getConnection()){
            PreparedStatement prpStmt = connection.prepareStatement(query);
            prpStmt.setString(1, actif.getId());
            return prpStmt.executeQuery().next();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public static boolean ajouter(Actif actif){
        String query = "INSERT INTO Actif(id_Ac, idInvtr_Ac, dateInvtr_Ac, desg_Ac, valeur_Ac, obsrv_Ac, bdCmd_Ac, bdLvrs_Ac, id_Ca, id_Fr) VALUE (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try(Connection connection = BaseDonnee.getConnection()){
            PreparedStatement prpStmt = connection.prepareStatement(query);
            prpStmt.setString(1, actif.getId());
            prpStmt.setString(2, actif.getIdInvtr());
            prpStmt.setDate(3, new Date(actif.getDateInvtr().getTime()));
            prpStmt.setString(4, actif.getDesg());
            prpStmt.setDouble(5, actif.getValeur());
            prpStmt.setString(6, actif.getObsrv());
            prpStmt.setString(7, actif.getBdCmd());
            prpStmt.setString(8, actif.getBdLvrs());
            prpStmt.setString(9, actif.getIdCa());
            prpStmt.setInt(10, actif.getIdFr());
            //prpStmt.setInt(11, actif.getIdFr());
            prpStmt.executeUpdate();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public static boolean modifier(Actif actif) throws ActifException {
        String query = "UPDATE Actif SET desg_Ac = ?, obsrv_Ac = ? WHERE id_Ac = ?";
        try(Connection connection = BaseDonnee.getConnection()){
            PreparedStatement prpStmt = connection.prepareStatement(query);
            prpStmt.setString(1, actif.getDesg());
            prpStmt.setString(2, actif.getObsrv());
            prpStmt.setString(3, actif.getId());
            prpStmt.executeUpdate();
            return true;

        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
