package qa.kira.dev.controllercontroller.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Topiccontrolesr {
	
	@Autowired(required = true)
	private TopicService topicservice;
	
	
	@RequestMapping("/topic")
	public List<Topic> getAllTopics() {
		return topicservice.getAllTopics();	
	}
	
	@RequestMapping("/topic/")
	public Topic getSelectedTopic(@RequestParam (value="id")String id) {
		return topicservice.getSelectedTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/topic" )
	public void addtopic(@RequestBody Topic requestbody) {
		topicservice.addtopic(requestbody);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT, value="/topic/{id}" )
	public void updtaetopic(@RequestBody Topic requestbody,@PathVariable String id) {
		topicservice.updatetopic(id,requestbody);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/topic/{id}" )
	public void Deletetopic(@PathVariable String id) {
		topicservice.deletetopic(id);
	}
	
	
	

}
