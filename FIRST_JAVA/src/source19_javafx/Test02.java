package source19_javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Test02 extends Application {
	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Label label = new Label("안녕하세요~ JavaFX로 실행 했습니다~!");
		
		FlowPane pane = new FlowPane();
		pane.getChildren().add(label);
		
		Scene scene = new Scene(pane, 320, 240);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
}

