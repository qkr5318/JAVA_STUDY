package source19_javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Test03 extends Application {
	
	public Test03() {
		System.out.println(Thread.currentThread().getName() + " : AppMain() 호출");
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : main() 호출");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("안녕하세요~ JavaFX로 실행 했습니다!");
		BorderPane pane = new BorderPane();
		pane.setCenter(label);
		
		Scene scene = new Scene(pane, 320, 240);
		primaryStage.setScene(scene);
		System.out.println(Thread.currentThread().getName() + " : start() 호출");
		primaryStage.show();
	}

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + " : init() 호출");
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + " : stop() 호출");
	}
}




