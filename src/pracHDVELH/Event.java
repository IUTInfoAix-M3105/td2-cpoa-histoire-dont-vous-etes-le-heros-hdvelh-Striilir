/**
 * File: NodeMultipleEvents.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template Ã©tudiants
 */
package pracHDVELH;

import java.util.Scanner;

import myUtils.ErrorNaiveHandler;

/**
 * @author prost
 *
 */
public class Event extends NodeMultiple {
	public static final String ERROR_MSG_UNEXPECTED_END = "Sorry, for some unexpected reason the story ends here...";
	public static final String PROMPT_ANSWER = "Answer: ";
	public static final String WARNING_MSG_INTEGER_EXPECTED = "Please input a integer within range!";

	/* the player's current answer*/
	private String playerAnswer;

	/* The GUI */
	private GUIManager gui;

	/* The input reader */
	private Scanner reader;

	/* The daughter's index chosen for the next event */
	private int chosenPath;

	/* This event's identifier */
	private int id;

	/* The class variable to store the last identifier used*/
	static private int lastId = -1;

	/* CONSTRUCTOR */
	public Event(){
		this(new GUIManager(), null);
	}

	public Event(GUIManager gui, String data) {
		super(data);
		chosenPath = -1;
		this.gui = gui;
		this.reader = gui.getInputReader();
		id = ++lastId;
	}

	/**
	 * @return the playerAnswer
	 */
	public String getPlayerAnswer() {
		/* TO BE COMPLETED */
	}

	/**
	 * @param playerAnswer the playerAnswer to set
	 */
	public void setPlayerAnswer(String playerAnswer) {
		/* TO BE COMPLETED */
	}

	/**
	 * @return the reader
	 */
	public Scanner getReader() {
		return this.reader;
	}

	/**
	 * @param reader the reader to set
	 */
	public void setReader(Scanner reader) {
		/* TO BE COMPLETED */
	}

	/**
	 * @return the chosenPath
	 */
	public int getChosenPath() {
		return this.chosenPath;
	}

	/**
	 * @param chosenPath the chosenPath to set
	 */
	public void setChosenPath(int chosenPath) {
		/* TO BE COMPLETED */
	}

	/* Methods */
	/**
	 * @see pracHDVELH.NodeMultiple#getData()
	 */
	public String getData() {
		/* TO BE COMPLETED */
	}

	/**
	 * @see pracHDVELH.NodeMultiple#setData(Object)
	 * @param data
	 */
	public void setData(String data) {
		/* TO BE COMPLETED */
	}

	/**
	 * @see pracHDVELH.NodeMultiple#getDaughter(int)
	 */
	@Override
	public Event getDaughter(int i) {
		/* TO BE COMPLETED */
	}

	/**
	 * @see pracHDVELH.NodeMultiple#setDaughter(NodeMultiple, int)
	 * @param daughter
	 * @param i
	 */
	public void setDaughter(Event daughter, int i) {
		/* TO BE COMPLETED */

	}

	/**
	 * @return the gui
	 */
	public GUIManager getGui() {
		return this.gui;
	}

	/**
	 * @param gui the gui to set
	 */
	public void setGui(GUIManager gui) {
		/* TO BE COMPLETED */
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/* Methods */
	/* TO BE COMPLETED */
	public Event run() {
		gui.outputln(this.getData());
		gui.output(PROMPT_ANSWER);
		playerAnswer = reader.next();
		chosenPath = interpretAnswer();
		return getDaughter(chosenPath;)
	}

}

// eof