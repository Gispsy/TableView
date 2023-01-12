package fr.tableview.tableview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

public class TableViewController {

    //Title
    public Text title;
    public Text title_prenom;
    public Text title_nom;
    public Text title_ville;

    //TextField
    public TextField txt_prenom;

    public TextField txt_nom;
    public TextField txt_ville;

    //Button
    public Button btn_sauver;
    public Button btn_annuler;
    public Button btn_supprimer;

    //Table
    public TableView lst_clients;

    //Column
    public TableColumn col_prenom;
    public TableColumn col_nom;
    public TableColumn col_ville;

    final ObservableList<Client> model = FXCollections.observableArrayList();

    public class Client {                       //Classe pour client Prenom, Nom, Ville
        private  String nom;
        private  String prenom;
        private  String ville;

        /**
         * Constructeur avec paramètres
         * @param nom : nom du client
         * @param prenom :prénom du client
         * @param ville :ville du client
         */
        public Client(String p, String n, String v) {
            this.prenom = p;
            this.nom = n;
            this.ville = v;
        }
        //Getters and Setters
        public String getNom() {
            return this.nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return this.prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public String getVille() {
            return this.ville;
        }

        public void setVille(String ville) {
            this.ville = ville;
        }
    }

    public void initialize() {
        //initialisation du modèle
        model.add(new Client("Josh", "Homme", "Joshua Tree"));
        model.add(new Client("Dave", "Grohl", "Warren"));
        model.add(new Client("Krist", "Novoselic", "Compton"));
        model.add(new Client("Robert", "Trujillo", "Santa Monica"));
        //On rend le tableau non-éditable
        lst_clients.setEditable(false);

        // Jonction du tableau avec les données
        col_prenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        col_nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        col_ville.setCellValueFactory(new PropertyValueFactory<>("ville"));

        // On indique au TableView quelle modèle observer pour trouver les données
        lst_clients.setItems(model);

    }

    @FXML// Sauvegarde la saisie dans le tableau
    public void Save(ActionEvent actionEvent) {


    }
    @FXML// Annule la saisie dans les TextField
    public void Cancel(ActionEvent actionEvent) {


    }
    @FXML// Supprimme la saisie dans le tableau
    public void Delete(ActionEvent actionEvent) {


    }

}
