package ke.co.philsoft.controllers;

import ke.co.philsoft.models.Topic;
import ke.co.philsoft.services.TopicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
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
}
