import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by brian on 5/17/14.
 */
public class PsychoAnimation extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {

        primaryStage.setScene(
                new Scene(
                        new Group(
                                new ImageView(
                                        new Image(
                                                "https://lh6.googleusercontent.com/-UWMYANdo7q8/TnqlM1fbjDI/AAAAAAAAAIY/CVF0-WMA1Sk/w835-h833-no/DSCN1201.JPG"
                                        )
                                )
                        )
                )
        );
        primaryStage.show();
    }
}
