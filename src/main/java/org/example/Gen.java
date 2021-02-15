package org.example;//ID:
//Name:
//


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Gen extends Application {
    

    public void start(Stage primaryStage) {

// Create a list of card numbers
        ArrayList<Integer> cards = getCards();

// Create a HBox pane
        HBox pane = new HBox(5);
        pane.setPadding(new Insets(5, 5, 5, 5));

// Add nodes to pane
        for (int i = 0; i < 3; i++)
        {
            System.out.println("C:\\\\Users\\\\prane\\\\IdeaProjects\\\\JavaFxTest\\\\src\\\\main\\\\resources\\\\image\\\\card\"" + cards.get(i) +".jpg" );
            pane.getChildren().add(new ImageView(new Image("file:///" + System.getProperty("user.dir") + "\\src\\main\\resources\\image\\card\\" + cards.get(i) + ".jpg")));
            //pane.getChildren().add(new ImageView(new Image("file:///C:\\Users\\prane\\IdeaProjects\\JavaFxTest\\src\\main\\resources\\image\\card\\" + cards.get(i) + ".jpg")));
        }

// Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("gen"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

    }

    /** Returns a list with numbers 1-52 stored in random order */

    private ArrayList<Integer> getCards() {
        ArrayList<Integer> cards = new ArrayList<Integer>();
        for (int i = 0; i < 52; i++) {

            cards.add(i + 1);

        }

        java.util.Collections.shuffle(cards);

        return cards;

    }

}

