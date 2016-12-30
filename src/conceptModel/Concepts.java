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
@XmlRootElement(name = "Concepts")
public class Concepts {
	@XmlElement(name = "Concept")
	private List<Concept> conceptList = new ArrayList<Concept>();

	public List<Concept> getConceptList() {
		return conceptList;
	}

	public void setConceptList(List<Concept> conceptList) {
		this.conceptList = conceptList;
	}
}
