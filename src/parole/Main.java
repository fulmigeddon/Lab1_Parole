package parole;
	
import javafx.application.Application;
import javafx.stage.Stage;
import parole.model.Parole;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parole elenco = new Parole();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Parole.fxml"));
			BorderPane root = (BorderPane)loader.load();
			ParoleController controller = loader.getController();
			controller.setElenco(elenco);
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
