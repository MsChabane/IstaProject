package mvc.control;

import mvc.model.BaseDonnee;
import mvc.model.Chapitre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ChapitreControl {
    public static boolean isExist(Chapitre chapitre) {
        String query = "SELECT * FROM Chapitre WHERE id_Ch = ?";

        try(Connection connection = BaseDonnee.getConnection()){
            PreparedStatement prpStmt = connection.prepareStatement(query);
            prpStmt.setString(1, chapitre.getId());
            return prpStmt.executeQuery().next();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public static boolean ajouter(Chapitre chapitre) {
        if(!isExist(chapitre)) {
            String query = "INSERT INTO Chapitre (id_Ch, titre_Ch) VALUE (?, ?)";

            try (Connection connection = BaseDonnee.getConnection()) {
                PreparedStatement prpStmt = connection.prepareStatement(query);
                prpStmt.setString(1, chapitre.getId());
                prpStmt.setString(2, chapitre.getTitre());
                prpStmt.executeUpdate();
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean modifier(Chapitre chapitre){
        String query = "UPDATE Chapitre SET titre_Ch = ? WHERE id_Ch = ?";

        try(Connection connection = BaseDonnee.getConnection()){
            PreparedStatement prpStmt = connection.prepareStatement(query);
            prpStmt.setString(1, chapitre.getTitre());
            prpStmt.setString(2, chapitre.getId());
            prpStmt.executeUpdate();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
