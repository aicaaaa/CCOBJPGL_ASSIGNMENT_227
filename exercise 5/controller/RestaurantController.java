package controller;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;
public class RestaurantController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Buddys buddys = new Buddys();
    Blakes blakes = new Blakes();
    Cabalen cabalen = new Cabalen();
    Aristocrat aristocrat = new Aristocrat();
    Maxs maxs = new Maxs();

    public void initialize() {

        buddys.setBestSeller("Crispy Pata");
        buddys.setRate("5 stars");

        blakes.setBestSeller("Pork Ribs");
        blakes.setRate("5 stars");

        cabalen.setBestSeller("Kare-Kare");
        cabalen.setRate("5 stars");

        aristocrat.setBestSeller("Chicken Barbecue");
        aristocrat.setRate("5 stars");

        maxs.setBestSeller("Sizzling Tofu");
        maxs.setRate("5 stars");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Buddy's best seller is " + buddys.getBestSeller() + " and their rate is"
            + buddys.getRate());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Blake's best seller is " + blakes.getBestSeller() + " and their rate is"
            + blakes.getRate());
        }

        if (sourceButton.equals(btn3)) {
            alert.setContentText("Cabalen's best seller is " + cabalen.getBestSeller() + " and their rate is"
            + cabalen.getRate());
        }

        if (sourceButton.equals(btn4)) {
            alert.setContentText("Aristocrat's best seller is " + aristocrat.getBestSeller() + " and their rate is"
            + aristocrat.getRate());
        }

        if (sourceButton.equals(btn5)) {
            alert.setContentText("Max's best seller is " + maxs.getBestSeller() + " and their rate is"
            + maxs.getRate());
        }

        alert.showAndWait();

    }
}
