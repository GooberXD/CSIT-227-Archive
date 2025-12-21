import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class BlueCube3D extends Application {

    @Override
    public void start(Stage stage) {
        // Create a cube (Box)
        Box cube = new Box(150, 150, 150);

        // Apply a blue material to the cube
        PhongMaterial blueMaterial = new PhongMaterial();
        blueMaterial.setDiffuseColor(Color.BLUE);
        blueMaterial.setSpecularColor(Color.LIGHTBLUE);
        cube.setMaterial(blueMaterial);

        // Rotate the cube for better visibility
        cube.getTransforms().addAll(
            new Rotate(30, Rotate.X_AXIS),
            new Rotate(30, Rotate.Y_AXIS)
        );

        // Create a camera
        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.setTranslateZ(-500);

        // Build the scene
        Group root = new Group(cube);
        Scene scene = new Scene(root, 600, 400, true);
        scene.setFill(Color.GRAY);
        scene.setCamera(camera);

        stage.setTitle("Blue 3D Cube");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
