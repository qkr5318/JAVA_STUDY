package source19_javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Test01 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Label label = new Label("안녕하세요~ JavaFX로 실행했습니다!");
		
		BorderPane pane = new BorderPane();
		pane.setCenter(label);
		
		Scene scene = new Scene(pane, 320, 240);
		
		primaryStage.setScene(scene);
		
		primaryStage.show(); // 윈도우 스테이지에 Scene 보여주기
		
	}
}
