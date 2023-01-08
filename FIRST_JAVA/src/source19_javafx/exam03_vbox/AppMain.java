package source19_javafx.exam03_vbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppMain extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		// VBox 수직으로 배치하는 레이아웃 구현
		VBox root = FXMLLoader.load(getClass().getResource("root.fxml"));
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("내가 만든 JavaFX 프로그램");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}


