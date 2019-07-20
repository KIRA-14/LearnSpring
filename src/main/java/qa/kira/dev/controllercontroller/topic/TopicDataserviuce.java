package qa.kira.dev.controllercontroller.topic;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;


@Configuration
public interface TopicDataserviuce extends CrudRepository<Topic,String>{

}
