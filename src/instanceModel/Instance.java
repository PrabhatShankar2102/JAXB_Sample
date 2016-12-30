package instanceModel;

/**
 * @author Prabhat Shankar
 */
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Instance")
public class Instance {

	@XmlAttribute(name = "name")
	private String name;
	@XmlElement(name = "DirectSuperConcepts")
	DirectSuperConcepts directSuperConceptsList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DirectSuperConcepts getDirectSuperConceptsList() {
		return directSuperConceptsList;
	}

	public void setDirectSuperConceptsList(
			DirectSuperConcepts directSuperConceptsList) {
		this.directSuperConceptsList = directSuperConceptsList;
	}

}
