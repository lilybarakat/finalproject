
    import javafx.application.Application;
    import javafx.scene.Group;
    import javafx.scene.Scene;
    import javafx.scene.image.Image;
    import javafx.scene.image.ImageView;
    import javafx.stage.Stage;

    /**
     * Created by brian on 5/17/14.
     */
    public class GeorgeAnimation extends Application {

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
                                                    "http://24.media.tumblr.com/tumblr_mdn7472iHE1qhu85xo1_500.gif"
                                            )
                                    )
                            )
                    )
            );

            primaryStage.show();
        }
    }


