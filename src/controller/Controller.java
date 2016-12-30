package controller;

/**
 * @author Prabhat Shankar
 */
import java.io.File;

import javax.xml.bind.JAXBException;

public class Controller {
	public static void main(String[] args) throws Exception {
		try {

			Handler.unmarshaller(new File("ontology.xml"));

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
