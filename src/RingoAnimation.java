import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by brian on 5/17/14.
 */
public class RingoAnimation extends Application {

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
                                                "http://37.media.tumblr.com/tumblr_lrzoc8T2801qmbkw2o1_400.gif"
                                        )
                                )
                        )
                )
        );
        primaryStage.show();
    }
}
