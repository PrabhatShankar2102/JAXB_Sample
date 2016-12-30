package controller;

/**
 * @author Prabhat Shankar
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Handler {

	public static void unmarshaller(File xmlFile) throws JAXBException {
		Ontology ontology = new Ontology();
		JAXBContext context = JAXBContext.newInstance(Ontology.class);
		Unmarshaller unmarshall = context.createUnmarshaller();
		ontology = (Ontology) unmarshall.unmarshal(xmlFile);

		Map<String, List<String>> finalMap = new HashMap<String, List<String>>();

		int conceptSize = ontology.getConcepts().getConceptList().size();

		int instanceSize = ontology.getInstances().getInstanceList().size();

		for (int i = 1; i < conceptSize; i++) {
			List<String> list = new ArrayList<String>();
			int ConceptReferenceListSize = ontology.getConcepts()
					.getConceptList().get(i).getDirectSuperConceptsList()
					.getConceptReferenceList().size();
			for (int j = 0; j < ConceptReferenceListSize; j++) {
				list.add(ontology.getConcepts().getConceptList().get(i)
						.getDirectSuperConceptsList().getConceptReferenceList()
						.get(j).getName());
			}
			Collections.sort(list);
			finalMap.put(ontology.getConcepts().getConceptList().get(i)
					.getName(), list);

		}
		for (int i = 1; i < instanceSize; i++) {
			List<String> list = new ArrayList<String>();
			int ConceptReferenceListSize = ontology.getInstances()
					.getInstanceList().get(i).getDirectSuperConceptsList()
					.getConceptReferenceList().size();
			for (int j = 0; j < ConceptReferenceListSize; j++) {
				list.add(ontology.getInstances().getInstanceList().get(i)
						.getDirectSuperConceptsList().getConceptReferenceList()
						.get(j).getName());
			}
			Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
			finalMap.put(ontology.getInstances().getInstanceList().get(i)
					.getName(), list);
		}

		Map<String, List<String>> finalMapp = new TreeMap<String, List<String>>(
				finalMap);
		for (Map.Entry<String, List<String>> entry : finalMapp.entrySet()) {
			String key = entry.getKey();
			List<String> value = entry.getValue();

			System.out.println(key + "(" + value + ")");
		}

	}
}
