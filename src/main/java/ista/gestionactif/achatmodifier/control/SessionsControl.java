package ista.gestionactif.achatmodifier.control;

import ista.gestionactif.achatmodifier.model.BaseDonnee;
import ista.gestionactif.achatmodifier.model.Sessions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SessionsControl {
    public static boolean siExist(Sessions sessions){
        String query = "SELECT * FROM Sessions WHERE id_Ses = ?";

        try(Connection connection = BaseDonnee.getConnection()){
            PreparedStatement prpStmt = connection.prepareStatement(query);
            prpStmt.setString(1, sessions.getId());
            return prpStmt.executeQuery().next();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public static boolean ajouter(Sessions sessions){
        String query = "INSERT INTO Sessions(id_Ses, titre_Ses, id_Ch) VALUE (?, ?, ?);";

        try(Connection connection = BaseDonnee.getConnection()){
            PreparedStatement prpStmt = connection.prepareStatement(query);
            prpStmt.setString(1, sessions.getId());
            prpStmt.setString(2, sessions.getTitre());
            prpStmt.setString(3, sessions.getIdCh());
            prpStmt.executeUpdate();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public static boolean modifier(Sessions sessions){
        String query = "UPDATE Sessions SET titre_Ses = ? WHERE id_Ses = ?";

        try(Connection connection = BaseDonnee.getConnection()){
            PreparedStatement prpStmt = connection.prepareStatement(query);
            prpStmt.setString(1, sessions.getTitre());
            prpStmt.setString(2, sessions.getId());
            prpStmt.executeUpdate();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

}
