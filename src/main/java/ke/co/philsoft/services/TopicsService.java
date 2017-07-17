package ke.co.philsoft.services;

import ke.co.philsoft.models.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Phillip Mwaniki on 17-Jul-17.
 */
@Service
public class TopicsService {

    private List<Topic> topics() {
        return Arrays.asList(
                new Topic("spring", "Spring Framework", "lorem"),
                new Topic("java", "Core Java", "lorem2"),
                new Topic("javascript", "Javascript", "lorem3")
        );
    }

   public List<Topic> getAllTopics() {
        return topics();
   }

   public Topic getTopic(String id) {
       return topics().stream().filter(t -> t.getId().equals(id)).findFirst().get();
   }

}
