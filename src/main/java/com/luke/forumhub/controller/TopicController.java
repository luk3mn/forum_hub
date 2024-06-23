package com.luke.forumhub.controller;

import com.luke.forumhub.domain.topic.Topic;
import com.luke.forumhub.domain.topic.TopicCreateDTO;
import com.luke.forumhub.domain.topic.TopicListDTO;
import com.luke.forumhub.domain.topic.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicController {

    @Autowired
    private TopicRepository topicRepository;

    @GetMapping
    public Page<TopicListDTO> list(Pageable pageable) {
        return topicRepository.findAll(pageable).map(TopicListDTO::new);
    }

    @PostMapping
    public void createTopic(@RequestBody TopicCreateDTO data) {
        topicRepository.save(new Topic(data));
//        System.out.println(topicCreateDTO);
    }

}
