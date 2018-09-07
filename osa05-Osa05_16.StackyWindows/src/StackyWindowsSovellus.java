
import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class StackyWindowsSovellus extends Application {

    public void start(Stage stage) {
        final int ikkunanLeveys = 640;
        final int ikkunanKorkeus = 480;

        stage.setTitle("StackyWindows 1.0");

        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setScene(scene);

        Canvas piirtoalusta = new Canvas(ikkunanLeveys, ikkunanKorkeus);
        root.getChildren().add(piirtoalusta);

        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();

        ArrayList<Ikkuna> ikkunat = new ArrayList<>();
        ikkunat.add(new Ikkuna(200, 40, 200, 400, Color.GREEN));
        ikkunat.add(new Ikkuna(250, 70, 250, 300, Color.RED));
        ikkunat.add(new Ikkuna(30, 80, 200, 300, Color.BLUE));

        root.setOnMousePressed((MouseEvent event) -> {
            System.out.println("mouse click " + event.getSource());
            System.out.println("\t" + event.getX());
            System.out.println("\t" + event.getY());
            int x =  (int) event.getX();
            int y =  (int) event.getY();
            if (ikkunat.get(0).ulkopuolella(x, y) == false) {
                System.out.println("VIHREÄ");
                Color valittu = ikkunat.get(0).getVari();
                
            } else if (ikkunat.get(1).ulkopuolella(x, y) == false) {
                System.out.println("PUNA");
                Color valittu = ikkunat.get(1).getVari();
            } else if (ikkunat.get(2).ulkopuolella(x, y) == false) {
                System.out.println("SINI");
                Color valittu = ikkunat.get(2).getVari();
            }
        });

        root.setOnMouseDragged((MouseEvent event) -> {
            System.out.println("moving mouse, mouse down!");
            System.out.println("\t" + event.getX());
            System.out.println("\t" + event.getY());

            // huom! jos haluat tarkastella hiiren siirtymisiä, tarvitset 
            // viittaustyyppisen muuttujan, jossa pidetään 
            // kirjaa hiiren aiemmasta sijainnista..
        });
        
        new AnimationTimer() {
            public void handle(long currentNanoTime) {
                piirturi.clearRect(0, 0, ikkunanLeveys, ikkunanKorkeus);
                
                for (Ikkuna ikkuna : ikkunat) {
                    piirturi.setFill(ikkuna.getVari());
                    piirturi.fillRect(ikkuna.getX(), ikkuna.getY(), ikkuna.getLeveys(), ikkuna.getKorkeus());
                }
            }
        }.start();

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
