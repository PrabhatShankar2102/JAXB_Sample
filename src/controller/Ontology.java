package controller;

/**
 * @author Prabhat Shankar
 */
import instanceModel.Instances;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import conceptModel.Concepts;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Ontology")
public class Ontology {

	@XmlElement(name = "Concepts")
	private Concepts concepts;
	@XmlElement(name = "Instances")
	private Instances instances;

	public Concepts getConcepts() {
		return concepts;
	}

	public void setConcepts(Concepts concepts) {
		this.concepts = concepts;
	}

	public Instances getInstances() {
		return instances;
	}

	public void setInstances(Instances instances) {
		this.instances = instances;
	}

}
