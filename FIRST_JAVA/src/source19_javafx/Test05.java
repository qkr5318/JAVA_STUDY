package source19_javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Test05 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		HBox root = new HBox();
		root.setPrefSize(300, 50);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);// 컨트롤러의 수평 간격 설정
		
		Button btn1 = new Button("버튼1");
		btn1.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				System.out.println("버튼1 클릭");
			}
			
		});
		
		Button btn2 = new Button("버튼 2");
		// 람다식 이용 버튼2 등록 처리함
		btn2.setOnAction(event -> System.out.println("버튼2 클릭"));
		
		
		root.getChildren().addAll(btn1, btn2);
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("이번트 핸들러 연습");
		primaryStage.setScene(scene);
		primaryStage.setOnCloseRequest(event -> System.out.println("종료 클릭!"));
		primaryStage.show();
		
	}
}
