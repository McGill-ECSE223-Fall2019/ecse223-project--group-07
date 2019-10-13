package ca.mcgill.ecse223.quoridor.features.stepfiles;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ca.mcgill.ecse223.quoridor.QuoridorApplication;
import ca.mcgill.ecse223.quoridor.model.*;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class SavePosition
{
	/* Traian Coza */
	@Given("No file {string} exists in the filesystem")
	public void no_file_exists_in_the_filesystem(String string) {
	    File file = new File(string);
	    if (file.exists())
	    	file.delete();
	}

	/* Traian Coza */
	@When("The user initiates to save the game with name {string}")
	public void the_user_initiates_to_save_the_game_with_name(String string) {
	    Controller.saveGame(new File(string));
	}

	/* Traian Coza */
	@Then("A file with {string} shall be created in the filesystem")
	public void a_file_with_shall_be_created_in_the_filesystem(String string) {
	    assertTrue(new File(string).exists());
	}

	/* Traian Coza */
	@Given("File {string} exists in the filesystem")
	public void file_exists_in_the_filesystem(String string) throws IOException {
	    new File(string).createNewFile();
	}

	/* Traian Coza */
	@When("The user confirms to overwrite existing file")
	public void the_user_confirms_to_overwrite_existing_file() {
	    Controller.setOverwrite(true);
	}

	/* Traian Coza */
	@Then("File with {string} shall be updated in the filesystem")
	public void file_with_shall_be_updated_in_the_filesystem(String string) {
		assertEquals(new File(string).lastModified() / 1000, System.currentTimeMillis() / 1000);
	}

	/* Traian Coza */
	@When("The user cancels to overwrite existing file")
	public void the_user_cancels_to_overwrite_existing_file() {
	    Controller.setOverwrite(false);
	}

	/* Traian Coza */
	@Then("File {string} shall not be changed in the filesystem")
	public void file_shall_not_be_changed_in_the_filesystem(String string) {
		assertNotEquals(new File(string).lastModified() / 1000, System.currentTimeMillis() / 1000);
	}
	
	public static class Controller {

		/**
		 * Same current game to provided file.
		 * @param file
		 */
		public static void saveGame(File file) {
			throw new UnsupportedOperationException();
		}

		/**
		 * Set the overwrite option (if saveGame is called on an existing file and overwrite is set, the file will be overwritten.
		 * @param overwrite
		 */
		public static void setOverwrite(boolean overwrite) {
			throw new UnsupportedOperationException();
		}
		
	}

}
