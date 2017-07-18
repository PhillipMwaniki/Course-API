package ke.co.philsoft.controllers;

import ke.co.philsoft.models.Topic;
import ke.co.philsoft.services.TopicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Phillip Mwaniki on 17-Jul-17.
 */
@RestController
public class TopicsController {

    @Autowired
    private TopicsService topicsService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicsService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {

        return topicsService.getTopic(id);
    }

    @RequestMapping(value = "/topics", method= RequestMethod.POST)
    public List<Topic> addTopic(@RequestBody Topic topic) {

        topicsService.addTopic(topic);
        return topicsService.getAllTopics();
    }

    /**
     *
     * @param topic
     * @param id
     * @return
     */
    @RequestMapping(value = "/topics/{id}", method= RequestMethod.PUT)
    public List<Topic> update(@RequestBody Topic topic, @PathVariable String id) {

        topicsService.update(id, topic);
        return topicsService.getAllTopics();
    }

    @RequestMapping(value = "/topics/{id}", method= RequestMethod.DELETE)
    public List<Topic> delete(@PathVariable String id) {

        topicsService.delete(id);
        return topicsService.getAllTopics();
    }
}
