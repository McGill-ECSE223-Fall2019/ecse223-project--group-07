package fxml;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

import ca.mcgill.ecse223.quoridor.Controller;
import ca.mcgill.ecse223.quoridor.QuoridorApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import ca.mcgill.ecse223.quoridor.model.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
public class SelectUsernameController {

		@FXML
	    private ComboBox<String> comboBoxWhite;

	    @FXML
	    private ComboBox<String> comboBoxBlack;

	    @FXML
	    private Pane pane;

	    @FXML
	    private Button Next;

	    @FXML
	    void nextClicked(MouseEvent event) {
	    	boolean isListedWhite = false;
	    	boolean isListedBlack = false;
	    	
	    	String whiteUsername = comboBoxWhite.getSelectionModel().getSelectedItem();
	    	String blackUsername = comboBoxBlack.getSelectionModel().getSelectedItem(); 
	    	
	    	ArrayList<User> list = new ArrayList<User>(QuoridorApplication.getQuoridor().getUsers());
	    	
	    	for(User u: list) {
	    		if(u.getName() == whiteUsername) {
	    			isListedWhite = true;
	    		}
	    		
	    		if(u.getName() == blackUsername) {
	    			isListedBlack = true;
	    		}
	    	}
	    	if(!isListedWhite)
	    	ca.mcgill.ecse223.quoridor.Controller.CreateNewUsername(whiteUsername);
	    	if(!isListedBlack)
	    	ca.mcgill.ecse223.quoridor.Controller.CreateNewUsername(blackUsername);
	    	
	    	Controller.SelectExistingUsername(QuoridorApplication.getQuoridor().getCurrentGame().getWhitePlayer(), whiteUsername);
	    	Controller.SelectExistingUsername(QuoridorApplication.getQuoridor().getCurrentGame().getBlackPlayer(), blackUsername);

	    	MainController.instance.setScreen("thinkingScreen");

	    }
	    
    
	    @FXML
	    void initialize()
	    {
	    	try (Scanner input = new Scanner(new File(getClass().getClassLoader().getResource("Usernames.txt").getFile())))
	    	{
				while(input.hasNextLine())
					QuoridorApplication.getQuoridor().addUser(input.nextLine());
				for (User user : QuoridorApplication.getQuoridor().getUsers())
				{
					comboBoxWhite.getItems().add(user.getName());
					comboBoxBlack.getItems().add(user.getName());
				}
			}
	    	catch (FileNotFoundException e)
	    	{
				e.printStackTrace();
			}
	    }
}
