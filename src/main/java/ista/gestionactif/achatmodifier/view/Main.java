package ista.gestionactif.achatmodifier.view;

import ista.gestionactif.achatmodifier.control.FournisseurControl;
import ista.gestionactif.achatmodifier.model.Categorie;
import ista.gestionactif.achatmodifier.model.Chapitre;
import ista.gestionactif.achatmodifier.model.Fournisseur;
import ista.gestionactif.achatmodifier.model.Sessions;

public class Main {
    public static void main(String[] args) {
        new AchatAjout().setVisible(true);
/*        Chapitre chapitre = new Chapitre("09", "dar chkil");
        Sessions sessions = new Sessions("01", "bab chkil", "09");
        Categorie categorie = new Categorie("04", "kratib", "01");

        String idAc = chapitre.getId() + sessions.getId() + categorie.getId();
        Fournisseur fournisseur1 = new Fournisseur("Aissa", "Mouhadjer", "0552860901", "Ais", "111111111111");
        fournisseur1.setId(FournisseurControl.getID(fournisseur1));

        //hnaya 9bl mandir les echange li gtli 3lihm chabene

        Actif actif = new Actif("21334", "253", new Date(), "9andora", 106.4, "chaba tach3al",
                100, 100, categorie.getId(),
                GarantieControl.ajouter(new Garantie(new Date(), "9 jour", "mataya7hach", "type1")),
                fournisseur1.getId());

        System.out.println(ChapitreControl.isExist(chapitre));
        ChapitreControl.ajouter(chapitre);
        System.out.println(ChapitreControl.isExist(chapitre));
        chapitre.setTitre("IIIIASDKSDL");
        ChapitreControl.modifier(chapitre);

        System.out.println(SessionsControl.siExist(sessions));
        SessionsControl.ajouter(sessions);
        System.out.println(SessionsControl.siExist(sessions));
        sessions.setTitre("9ada w milod");
        SessionsControl.modifier(sessions);


        System.out.println(CategorieControl.isExist(categorie));
        CategorieControl.ajouter(categorie);
        categorie.setDscp("ana howa ");
        CategorieControl.modifier(categorie);


        System.out.println(FournisseurControl.siExist(fournisseur1));
        FournisseurControl.ajouter(fournisseur1);
        System.out.println(FournisseurControl.siExist(fournisseur1));
        fournisseur1.setIntituleEse("AISSSA");
        fournisseur1.setNom("AISSSSSA");
        FournisseurControl.modifier(fournisseur1);

        System.out.println(ActifControl.siExist(actif));
        ActifControl.ajouter(actif);
*/

    }
}