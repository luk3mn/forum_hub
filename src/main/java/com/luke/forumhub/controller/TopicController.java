package com.luke.forumhub.controller;

import com.luke.forumhub.domain.topic.CreateTopicDTO;
import com.luke.forumhub.domain.topic.DetailTopicDTO;
import com.luke.forumhub.domain.topic.ListTopicDTO;
import com.luke.forumhub.domain.topic.TopicService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping
    public Page<ListTopicDTO> list(Pageable pageable) {
        return topicService.getAllTopics(pageable);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetailTopicDTO> list(@PathVariable Long id) {
        return topicService.getTopicById(id);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<DetailTopicDTO> createTopic(@RequestBody CreateTopicDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(topicService.createNewTopic(dto));
    }

}
