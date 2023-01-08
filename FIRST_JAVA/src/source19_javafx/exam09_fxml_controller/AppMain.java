package source19_javafx.exam09_fxml_controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("내꺼 JAVAFX 컨트롤러 연습");
		primaryStage.setScene(scene);
		primaryStage.setOnCloseRequest(event -> System.out.println("종료 클릭!"));
		primaryStage.show();
		
		
	}

}
