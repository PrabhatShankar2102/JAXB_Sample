package instanceModel;

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
@XmlRootElement(name = "Instances")
public class Instances {
	@XmlElement(name = "Instance")
	private List<Instance> instanceList = new ArrayList<Instance>();

	public List<Instance> getInstanceList() {
		return instanceList;
	}

	public void setInstanceList(List<Instance> instanceList) {
		this.instanceList = instanceList;
	}
}
