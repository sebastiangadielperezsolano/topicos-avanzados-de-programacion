package com.example.imagen;

import javafx.animation.*;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("imagen");
        Group root = new Group();
        Scene scena = new Scene(root,1300,668, Color.BLACK);
        stage.setScene(scena);

        Image image = new Image(getClass().getResourceAsStream("/com/example/imagen/6630b08b7ab22-753x494.jpeg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(1300);
        imageView.setFitHeight(668);
        root.getChildren().add(imageView);

        Image image3 = new Image(getClass().getResourceAsStream("/com/example/imagen/lmp2.png"));
        ImageView imageView3 = new ImageView(image3);
        imageView3.setPreserveRatio(true);
        imageView3.setLayoutX(1000);
        imageView3.setLayoutY(500);
        imageView3.setFitHeight(400);
        imageView3.setFitWidth(300);
        root.getChildren().add(imageView3);

        Image image2 = new Image(getClass().getResourceAsStream("/com/example/imagen/rexy_sin.png"));
        ImageView imageView2 = new ImageView(image2);
        imageView2.setPreserveRatio(true);
        imageView2.setFitHeight(1200);
        imageView2.setFitWidth(600);
        imageView2.setLayoutX(1200);
        imageView2.setLayoutY(300);
        root.getChildren().add(imageView2);

        Image image4 = new Image(getClass().getResourceAsStream("/com/example/imagen/2.png"));
        ImageView imageView4 = new ImageView(image4);
        imageView4.setPreserveRatio(true);
        imageView4.setFitHeight(400);
        imageView4.setFitWidth(300);
        imageView4.setLayoutX(-10);
        imageView4.setLayoutY(180);
        root.getChildren().add(imageView4);

        Image image5 = new Image(getClass().getResourceAsStream("/com/example/imagen/2.png"));
        ImageView imageView5 = new ImageView(image5);
        imageView5.setPreserveRatio(true);
        imageView5.setFitHeight(400);
        imageView5.setFitWidth(300);
        imageView5.setLayoutX(1000);
        imageView5.setLayoutY(180);
        root.getChildren().add(imageView5);

        Text texto1 = new Text(10,50,"24 ");
        texto1.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.THIN,36));
        texto1.setFill(Color.WHITE);
        root.getChildren().add(texto1);
        //efecto1
        DropShadow sombra = new DropShadow();
        sombra.setRadius(10);
        sombra.setOffsetX(-10);
        sombra.setOffsetY(10);
        sombra.setSpread(0.5);
        sombra.setColor(Color.DARKSLATEGRAY);
        texto1.setEffect(sombra);

        Text texto2 = new Text(50,70," horas ");
        texto2.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.THIN,36));
        texto2.setFill(Color.WHITE);
        root.getChildren().add(texto2);
        //efecto2
        InnerShadow dentro = new InnerShadow();
        dentro.setRadius(10);
        dentro.setOffsetX(5);
        dentro.setOffsetY(0);
        dentro.setColor(Color.DARKSLATEGRAY);
        dentro.setHeight(-.5);
        dentro.setWidth(-.5);
        texto2.setEffect(dentro);

        Text texto3 = new Text(150,95,"de ");
        texto3.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.THIN,36));
        texto3.setFill(Color.WHITE);
        root.getChildren().add(texto3);

        Text texto4 = new Text(190,125,"DAYTONA");
        texto4.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.THIN,36));
        texto4.setFill(Color.WHITE);
        root.getChildren().add(texto4);
        //efecto4
        Reflection agua = new Reflection();
        agua.bottomOpacityProperty().setValue(-100);
        agua.topOpacityProperty().setValue(5);
        agua.fractionProperty().setValue(1);
        agua.topOffsetProperty().setValue(0);
        texto4.setEffect(agua);

        Group lunagrupo = new Group();
        Circle lunallena = new Circle(1200, 50,360);
        lunallena.setFill(Color.DARKGRAY);
        lunallena.setRadius(130);
        lunagrupo.getChildren().add(lunallena);
        GaussianBlur lunaReal = new GaussianBlur();
        lunaReal.setRadius(50);
        lunallena.setEffect(lunaReal);

        Arc arco = new Arc(1200, 50, 40, 20, 150, 140);
        arco.setStroke(Color.BLACK);
        arco.setFill(Color.BLACK);
        arco.setStrokeWidth(2);
        lunagrupo.getChildren().add(arco);
        GaussianBlur crater = new GaussianBlur();
        crater.setRadius(50);
        arco.setEffect(crater);

        Arc arco2 = new Arc(1150, 75, 40, 20, 150, 140);
        arco2.setStroke(Color.BLACK);
        arco2.setFill(Color.BLACK);
        arco2.setStrokeWidth(2);
        lunagrupo.getChildren().add(arco2);
        GaussianBlur crater2 = new GaussianBlur();
        crater2.setRadius(25);
        arco2.setEffect(crater2);

        Arc arco3 = new Arc(1300, 90, 40, 20, 150, 140);
        arco3.setStroke(Color.BLACK);
        arco3.setFill(Color.BLACK);
        arco3.setStrokeWidth(2);
        lunagrupo.getChildren().add(arco3);
        GaussianBlur crater3 = new GaussianBlur();
        crater3.setRadius(25);
        arco3.setEffect(crater3);
        root.getChildren().add(lunagrupo);
//transicion1
        RotateTransition rotate = new RotateTransition(Duration.seconds(10),lunagrupo);
        rotate.setFromAngle(0);
        rotate.setToAngle(360);
        rotate.setCycleCount(Timeline.INDEFINITE);
        rotate.play();




//transicion4
        FadeTransition desvanecer2 = new FadeTransition(Duration.seconds(2), imageView5);
        desvanecer2.setFromValue(0);
        desvanecer2.setToValue(1);
        desvanecer2.setAutoReverse(true);
        desvanecer2.setCycleCount(Timeline.INDEFINITE);
        desvanecer2.play();

        //sonido1
        String ruta = "/com/example/imagen/2005_mustang_v6.mp3";
        Media media = new Media(getClass().getResource(ruta).toExternalForm());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        imageView2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mediaPlayer.seek(mediaPlayer.getStartTime());
                mediaPlayer.play();

                //transicion2
                Path rutatrans = new Path();
                rutatrans.getElements().add(new MoveTo(1100,200));
                rutatrans.getElements().add(new CubicCurveTo(-100, 200, -200, 250,-300, 250));
                rutatrans.getElements().add(new CubicCurveTo(-300, 250, -390, 200, -3000, 200));
                rutatrans.setStroke(Color.TRANSPARENT);
                root.getChildren().add(rutatrans);
                PathTransition seguirRuta = new PathTransition();
                seguirRuta.setDuration(Duration.seconds(5));
                seguirRuta.setPath(rutatrans);
                seguirRuta.setNode(imageView2);
                seguirRuta.setCycleCount(Animation.INDEFINITE);
                seguirRuta.play();
            }
        });

        //sonido 2
        String rutaLmp2 = "/com/example/imagen/motor-sesi.mp3";
        Media media2 = new Media(getClass().getResource(rutaLmp2).toExternalForm());
        MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
        imageView3.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mediaPlayer2.seek(mediaPlayer2.getStartTime());
                mediaPlayer2.play();
                //transicion3
                TranslateTransition trans = new TranslateTransition(Duration.seconds(3),imageView3);
                trans.setToX(-1500);
                trans.setToY(50);
                trans.setCycleCount(Timeline.INDEFINITE);
                trans.setDuration(Duration.seconds(7));
                trans.play();
            }
        });
        String pirotecnia1 = "/com/example/imagen/pirotecnia.mp3";
        Media media3 = new Media(getClass().getResource(pirotecnia1).toExternalForm());
        MediaPlayer mediaPlayer3 = new MediaPlayer(media3);
        imageView4.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mediaPlayer3.seek(mediaPlayer3.getStartTime());
                mediaPlayer3.play();
                //transicion4
                FadeTransition desvanecer = new FadeTransition(Duration.seconds(2), imageView4);
                desvanecer.setFromValue(0);
                desvanecer.setToValue(1);
                desvanecer.setAutoReverse(true);
                desvanecer.setCycleCount(Timeline.INDEFINITE);
                desvanecer.play();
            }
        });

        String pirotecnia2 = "/com/example/imagen/pirotecnia.mp3";
        Media media4 = new Media(getClass().getResource(pirotecnia2).toExternalForm());
        MediaPlayer mediaPlayer4 = new MediaPlayer(media4);
        imageView5.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mediaPlayer4.seek(mediaPlayer4.getStartTime());
                mediaPlayer4.play();
                //transicion4
                FadeTransition desvanecer = new FadeTransition(Duration.seconds(2), imageView5);
                desvanecer.setFromValue(0);
                desvanecer.setToValue(1);
                desvanecer.setAutoReverse(true);
                desvanecer.setCycleCount(Timeline.INDEFINITE);
                desvanecer.play();
            }
        });

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}