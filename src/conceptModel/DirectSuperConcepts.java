package conceptModel;

/**
 * @author Prabhat Shankar
 */
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DirectSuperConcepts")
public class DirectSuperConcepts {

	@XmlElement(name = "ConceptReference")
	private List<ConceptReference> conceptReferenceList = new ArrayList<ConceptReference>();

	public List<ConceptReference> getConceptReferenceList() {
		return conceptReferenceList;
	}

	public void setConceptReferenceList(
			List<ConceptReference> conceptReferenceList) {
		this.conceptReferenceList = conceptReferenceList;
	}

}
