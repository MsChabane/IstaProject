package ista.gestionactif.achatmodifier.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.border.LineBorder;
import javax.swing.JComboBox;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;


public class AchatAjout extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtHhh;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField txtNumRefGa;
    private JTextField txtDurreGa;
    private JTextField txtDateGa;
    private JTextField txtCndtGrnt;
    private JTable table;

    /**
     * Launch the application.
     */


    /**
     * Create the frame.
     */
    public AchatAjout() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1050, 800);
        contentPane = new JPanel();
        contentPane.setForeground(new Color(255, 255, 255));
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1034, 50);
        panel.setToolTipText("");
        contentPane.add(panel);
        panel.setLayout(null);
        Color c1 =new Color(3, 106, 181);
        panel.setBackground(c1);

        JLabel lblNewLabel = new JLabel("Achat d'actif > Ajout");
        lblNewLabel.setForeground(SystemColor.window);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
        lblNewLabel.setBounds(337, 0, 403, 47);
        panel.add(lblNewLabel);

        JLabel logo = new JLabel();
        logo.setBounds(-35, 0, 178, 66);
        panel.add(logo);
        //ImageIcon img=new ImageIcon(this.getClass().getResource("/istaim.png"));
        //logo.setIcon(img);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
        panel_1.setBounds(11, 62, 1012, 30);

        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("Fournisseur");
        lblNewLabel_2.setBounds(21, 11, 84, 14);
        panel_1.add(lblNewLabel_2);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.setBackground(SystemColor.text);
        panel_2.setBounds(10, 61, 1014, 100);
        contentPane.add(panel_2);
        panel_2.setBorder(new LineBorder(new Color(204, 204, 204)));
        panel_2.setLayout(null);





        JComboBox comboFrnsr  = new JComboBox();
        comboFrnsr.setBackground(Color.white);
        comboFrnsr.setBounds(159, 46, 686, 37);
        panel_2.add(comboFrnsr);

        comboFrnsr.setBorder(null);


        JPanel panel_3 = new JPanel();
        panel_3.setBounds(11, 181, 1012, 30);
        panel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
        contentPane.add(panel_3);
        panel_3.setLayout(null);

        JLabel lblNewLabel_4 = new JLabel("Type-Actif");
        lblNewLabel_4.setBounds(21, 11, 84, 15);
        panel_3.add(lblNewLabel_4);
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));

        JPanel panel_4 = new JPanel();
        panel_4.setBackground(new Color(255, 255, 255));
        panel_4.setBounds(10, 180, 1014, 100);
        panel_4.setBorder(new LineBorder(new Color(204, 204, 204)));
        contentPane.add(panel_4);
        panel_4.setLayout(null);



        JComboBox comboTypeActif = new JComboBox();
        comboTypeActif.setBounds(159, 49, 686, 37);
        comboTypeActif.setBackground(Color.white);
        comboTypeActif.addItem("chabane");
        panel_4.add(comboTypeActif);

        JPanel panel_5 = new JPanel();
        panel_5.setBorder(new LineBorder(new Color(204, 204, 204)));
        panel_5.setBackground(SystemColor.text);
        panel_5.setBounds(10, 300, 1014, 150);
        contentPane.add(panel_5);
        panel_5.setLayout(null);

        JPanel panel_6 = new JPanel();
        panel_6.setBorder(new EmptyBorder(0, 0, 0, 0));
        panel_6.setBounds(1, 1, 1012, 30);
        panel_5.add(panel_6);
        panel_6.setLayout(null);

        JLabel lblNewLabel_6 = new JLabel("Détails-Actifs ");
        lblNewLabel_6.setBounds(21, 11, 84, 15);
        panel_6.add(lblNewLabel_6);
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));

        JLabel lblNewLabel_7 = new JLabel("N° D’Inventaire* :");
        lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblNewLabel_7.setBounds(11, 55, 87, 14);
        panel_5.add(lblNewLabel_7);

        txtHhh = new JTextField();
        txtHhh.setBounds(108, 40, 174, 40);
        panel_5.add(txtHhh);
        txtHhh.setColumns(10);
        txtHhh.setBorder(new EmptyBorder(0,0,0,0));
        txtHhh.setBackground(new Color(237,237,237));

        JLabel lblNewLabel_8 = new JLabel("Valeur * :");
        lblNewLabel_8.setBounds(292, 55, 46, 14);
        panel_5.add(lblNewLabel_8);

        JLabel lblNewLabel_9 = new JLabel("Date* :");
        lblNewLabel_9.setBounds(532, 55, 36, 14);
        panel_5.add(lblNewLabel_9);

        JLabel lblNewLabel_10 = new JLabel("Observation:");
        lblNewLabel_10.setBounds(762, 55, 63, 14);
        panel_5.add(lblNewLabel_10);

        JLabel lblNewLabel_11 = new JLabel("Deseignation* :");
        lblNewLabel_11.setBounds(11, 113, 75, 14);
        panel_5.add(lblNewLabel_11);

        JLabel lblNewLabel_12 = new JLabel("Bon de Livraison:");
        lblNewLabel_12.setBounds(280, 113, 97, 14);
        panel_5.add(lblNewLabel_12);

        JLabel lblNewLabel_13 = new JLabel("Bon de Commande:");
        lblNewLabel_13.setBounds(571, 113, 108, 14);
        panel_5.add(lblNewLabel_13);

        textField_1 = new JTextField();
        textField_1.setBounds(96, 98, 174, 40);
        panel_5.add(textField_1);
        textField_1.setColumns(10);
        textField_1.setBorder(new EmptyBorder(0,0,0,0));
        textField_1.setBackground(Colors.instance.getBackgroundtext());

        textField_2 = new JTextField();
        textField_2.setBounds(348, 40, 174, 40);
        panel_5.add(textField_2);
        textField_2.setColumns(10);
        textField_2.setBorder(new EmptyBorder(0,0,0,0));
        textField_2.setBackground(Colors.instance.getBackgroundtext());

        textField_3 = new JTextField();
        textField_3.setBounds(578, 40, 174, 40);
        panel_5.add(textField_3);
        textField_3.setColumns(10);
        textField_3.setBorder(new EmptyBorder(0,0,0,0));
        textField_3.setBackground(Colors.instance.getBackgroundtext());

        textField_4 = new JTextField();
        textField_4.setBounds(835, 40, 150, 40);
        panel_5.add(textField_4);
        textField_4.setColumns(10);
        textField_4.setBorder(new EmptyBorder(0,0,0,0));
        textField_4.setBackground(Colors.instance.getBackgroundtext());

        textField_5 = new JTextField();
        textField_5.setBounds(387, 98, 174, 40);
        panel_5.add(textField_5);
        textField_5.setColumns(10);
        textField_5.setBorder(new EmptyBorder(0,0,0,0));
        textField_5.setBackground(Colors.instance.getBackgroundtext());

        textField_6 = new JTextField();
        textField_6.setBounds(689, 98, 174, 40);
        panel_5.add(textField_6);
        textField_6.setColumns(10);
        textField_6.setBorder(new EmptyBorder(0,0,0,0));
        textField_6.setBackground(Colors.instance.getBackgroundtext());

        JPanel panel_8 = new JPanel();
        panel_8.setBorder(new EmptyBorder(0, 0, 0, 0));
        panel_8.setBackground(new Color(237, 237, 237));
        panel_8.setBounds(12, 468, 1012, 30);
        contentPane.add(panel_8);
        panel_8.setLayout(null);

        JLabel lblNewLabel_14 = new JLabel("Garantie");
        lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_14.setBounds(21, 11, 55, 14);
        panel_8.add(lblNewLabel_14);

        JPanel panel_7 = new JPanel();
        panel_7.setBorder(new LineBorder(new Color(204,204,204)));
        panel_7.setBackground(new Color(255, 255, 255));
        panel_7.setBounds(11, 467, 1014, 120);
        contentPane.add(panel_7);
        panel_7.setLayout(null);

        JLabel lblNewLabel_15 = new JLabel("N° reference Garantie:");
        lblNewLabel_15.setBounds(10, 35, 174, 14);
        panel_7.add(lblNewLabel_15);

        JLabel lblNewLabel_16 = new JLabel("Durée : ");
        lblNewLabel_16.setBounds(204, 35, 86, 14);
        panel_7.add(lblNewLabel_16);

        JLabel lblNewLabel_17 = new JLabel("Unité : ");
        lblNewLabel_17.setBounds(324, 35, 54, 14);
        panel_7.add(lblNewLabel_17);

        JLabel lblNewLabel_18 = new JLabel("Date : ");
        lblNewLabel_18.setBounds(430, 35, 174, 14);
        panel_7.add(lblNewLabel_18);

        JLabel lblNewLabel_19 = new JLabel("Condition :");
        lblNewLabel_19.setBounds(624, 35, 184, 14);
        panel_7.add(lblNewLabel_19);

        JLabel lblNewLabel_20 = new JLabel("Type :");
        lblNewLabel_20.setBounds(818, 35, 174, 14);
        panel_7.add(lblNewLabel_20);

        txtNumRefGa= new JTextField();
        txtNumRefGa.setBounds(10, 57, 174, 40);
        panel_7.add(txtNumRefGa);
        txtNumRefGa.setColumns(10);
        txtNumRefGa.setBorder(new EmptyBorder(0,0,0,0));
        txtNumRefGa.setBackground(Colors.instance.getBackgroundtext());

        txtDurreGa = new JTextField();
        txtDurreGa.setBounds(204, 57, 100, 40);
        panel_7.add(txtDurreGa);
        txtDurreGa.setColumns(10);
        txtDurreGa.setBorder(new EmptyBorder(0,0,0,0));
        txtDurreGa.setBackground(Colors.instance.getBackgroundtext());
        JComboBox comboboxUnite= new JComboBox();
        comboboxUnite.setBounds(324, 57, 86, 40);
        panel_7.add(comboboxUnite);
        comboboxUnite.setBorder(new EmptyBorder(0,0,0,0));
        comboboxUnite.setBackground(Color.white);

        txtDateGa = new JTextField();
        txtDateGa.setBounds(430, 57, 174, 40);
        panel_7.add(txtDateGa);
        txtDateGa.setColumns(10);
        txtDateGa.setBorder(new EmptyBorder(0,0,0,0));
        txtDateGa.setBackground(Colors.instance.getBackgroundtext());


        txtCndtGrnt = new JTextField();
        txtCndtGrnt.setBounds(624, 57, 174, 40);
        panel_7.add(txtCndtGrnt);
        txtCndtGrnt.setColumns(10);
        txtCndtGrnt.setBorder(new EmptyBorder(0,0,0,0));
        txtCndtGrnt.setBackground(Colors.instance.getBackgroundtext());



        JComboBox<String> comboTypeGarantie = new JComboBox<String>();
        comboTypeGarantie.setBounds(818, 57, 174, 40);
        panel_7.add(comboTypeGarantie);
        comboTypeGarantie.setBorder(new EmptyBorder(0,0,0,0));
        comboTypeGarantie.setBackground(Color.white);
        comboTypeGarantie.addItem("alo");
        JPanel panel_9 = new JPanel();
        panel_9.setBorder(new LineBorder(new Color(204,204,204)));
        panel_9.setBackground(new Color(255, 255, 255));
        panel_9.setBounds(11, 598, 1014, 100);
        contentPane.add(panel_9);
        panel_9.setLayout(null);

        JPanel panel_10 = new JPanel();
        panel_10.setBorder(new EmptyBorder(0, 0, 0, 0));
        panel_10.setBounds(1, 1, 1012, 30);
        panel_9.add(panel_10);
        panel_10.setLayout(null);

        JLabel lblNewLabel_21 = new JLabel("Aperçu-Actif");
        lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_21.setBounds(21, 11, 81, 14);
        panel_10.add(lblNewLabel_21);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(22, 42, 971, 43);
        panel_9.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);
        table.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null, null, null, null, "", null, null},
                },
                new String[] {
                        "Id", "N\u00B0 d\u2019Inventaire", "Date", "D\u00E9signation ", "Valeur", "Fournisseur", "Bon de Livraison", "Bon de Commande", "Garantie", "Observations"
                }
        ));
        table.setRowHeight(20);



        JButton btnRetour = new JButton("< Retour");
        btnRetour.setBackground(new Color(245,245,245));
        btnRetour.setBounds(11, 715, 90, 27);
        btnRetour.setFocusable(false);
        contentPane.add(btnRetour);



        JButton btnAjouter = new JButton("Ajouter\r\n");
        btnAjouter.setForeground(new Color(255, 255, 255));
        btnAjouter.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnAjouter.setBackground(new Color(3, 106, 181));
        btnAjouter.setBounds(930, 715, 90, 27);
        btnAjouter.setFocusable(false);
        contentPane.add(btnAjouter);
		/*table.getColumnModel().getColumn(0).setPreferredWidth(86);
		table.getColumnModel().getColumn(1).setPreferredWidth(83);
		table.getColumnModel().getColumn(2).setPreferredWidth(142);
		table.getColumnModel().getColumn(3).setPreferredWidth(136);
		table.getColumnModel().getColumn(4).setPreferredWidth(60);
		table.getColumnModel().getColumn(5).setPreferredWidth(66);
		table.getColumnModel().getColumn(6).setPreferredWidth(88);
		table.getColumnModel().getColumn(7).setPreferredWidth(99);
		table.getColumnModel().getColumn(9).setPreferredWidth(83);*/






    }
}