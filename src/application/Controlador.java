package application;

//import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controlador {

	public AnchorPane mypane;

	@FXML
	private void handleClose() {
		System.exit(0);
	}

	@FXML
	private void openStage() {
	
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("View2.fxml"));
			mypane = (AnchorPane) loader.load();
			Scene scene = new Scene(mypane);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	

}
