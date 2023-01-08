package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("내가 만든 세계 유일 JavaFX 계산기 Ver 1.0");
		// 애플리케이션 이미지를 설정 처리합니다.
		primaryStage.getIcons().add(new Image(Class.forName("application.Main").getResourceAsStream("/application/resources/icon/tree.png")));
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
