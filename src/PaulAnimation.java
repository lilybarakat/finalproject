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
public class PaulAnimation extends Application {

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
                                                "http://37.media.tumblr.com/tumblr_m8k116di4x1r4xl9xo1_500.gif"
                                        )
                                )
                        )
                )
        );
        primaryStage.show();
    }
}
