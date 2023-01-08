package source19_javafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Test04 extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		VBox root = new VBox();
		root.setPrefWidth(350); // VBox의 폭 설정
		root.setPrefHeight(150); // VBox의 높이 설정
		root.setAlignment(Pos.CENTER); // 컨트롤을 중앙으로 정렬
		root.setSpacing(20); // 컨트롤의 수직 간격 설정
		
		Label label = new Label();
		label.setText("Hello~ Jananara!");
		label.setFont(new Font(30));
		
		Button button = new Button();
		button.setText("확인");
		
		// "확인" 버튼을 클릭하면 Platform.exit() 메서드를 호출해서
		// Application을 종료하도록 합니다.
		button.setOnAction(event -> Platform.exit());
		
		root.getChildren().add(label);
		root.getChildren().add(button);
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("Hi~ Jangnara!");
		primaryStage.setScene(scene); // 윈도우 스테이지에 장면(Scene) 설정하기
		primaryStage.show(); // 윈도우 스테이지에 show() 메서드 활용 보여주기
	}

}
