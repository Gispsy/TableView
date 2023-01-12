module fr.tableview.tableview {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.tableview.tableview to javafx.fxml;
    exports fr.tableview.tableview;
}