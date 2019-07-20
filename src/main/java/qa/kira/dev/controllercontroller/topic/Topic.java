package qa.kira.dev.controllercontroller.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
public class Topic {
	
	@Id
	private String id;
	private String name;
	private String discription;
	
	public Topic(@JsonProperty ("id" ) String id, 
			@JsonProperty ("name" ) String name, 
			@JsonProperty ("discription" ) String discription) {
		super();
		this.id = id;
		this.name = name;
		this.discription = discription;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	};
	
	
}
