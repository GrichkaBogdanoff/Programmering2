package Läxa2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class blegg extends Application implements EventHandler<ActionEvent> {

	Stage stage;
	HBox Layout;
	Scene scene;

	Button Craig;
	Button Reldar;
	
	Button RemoveObj;
	Button ExitButton;

	Circle circle;
	Rectangle rectangle;

	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;

		buttonClegg();
		HBox container = bregg();

		Layout = new HBox();
		Layout.getChildren().add(container);

		scene = new Scene(Layout, 500, 200);

		stage.setScene(scene);
		stage.show();
	}

	@Override
	public void handle(ActionEvent event) {

		if (event.getSource() == Craig) {
			AddCircle();

		} else if (event.getSource() == Reldar) {
			AddRectangle();

		} else if (event.getSource() == ExitButton) {
			System.exit(0);

		} else if (event.getSource() == RemoveObj) {
			RemoveGlenn();

		} else {
			return;
		}
	}

	private void AddCircle() {

		Circle circle = new Circle();
		circle.setFill(Color.RED);
		circle.setRadius(15);

		Layout.getChildren().add(circle);
	}

	private void RemoveGlenn() {
		Layout.getChildren().clear();

		Layout.getChildren().add(Craig);
		Layout.getChildren().add(Reldar);
		Layout.getChildren().add(RemoveObj);
		Layout.getChildren().add(ExitButton);
	}

	private void AddRectangle() {

		Rectangle rectangle = new Rectangle();
		rectangle.setFill(Color.RED);
		rectangle.setWidth(25);
		rectangle.setHeight(25);

		Layout.getChildren().add(rectangle);
	}

	private void buttonClegg() {

		Craig = new Button("Circle");
		Craig.setOnAction(this);

		Reldar = new Button("Rectangle");
		Reldar.setOnAction(this);

		RemoveObj = new Button("Remove Objects");
		RemoveObj.setOnAction(this);

		ExitButton = new Button("Exit");
		ExitButton.setOnAction(this);
	}

	private HBox bregg() {

		HBox Hbox = new HBox();

		Hbox.getChildren().add(Craig);
		Hbox.getChildren().add(Reldar);
		Hbox.getChildren().add(RemoveObj);
		Hbox.getChildren().add(ExitButton);

		return Hbox;
	}

	public static void main(String[] args) {
		launch();
	}
}
