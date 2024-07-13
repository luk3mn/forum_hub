package com.luke.forumhub.controller;

import com.luke.forumhub.domain.response.CreateTopicDetailDTO;
import com.luke.forumhub.domain.topic.CreateTopicDTO;
import com.luke.forumhub.domain.topic.DetailTopicDTO;
import com.luke.forumhub.domain.topic.ListTopicDTO;
import com.luke.forumhub.domain.topic.TopicService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
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

    // getting all topics
    @GetMapping
    public Page<ListTopicDTO> list(Pageable pageable) {
        return topicService.getAllTopics(pageable);
    }

    // Detailed Topic by id
    @GetMapping("/{id}")
    public ResponseEntity<DetailTopicDTO> list(@PathVariable Long id) {
        return topicService.getTopicById(id);
    }

    // creating a new topic
    @PostMapping
    @Transactional
    public ResponseEntity<CreateTopicDetailDTO> createTopic(@RequestBody @Valid CreateTopicDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(topicService.create(dto));
    }

    // Removing a topic
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deleteTopic(@PathVariable Long id) {
        topicService.remove(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity updateTopic(@PathVariable Long id, @RequestBody CreateTopicDTO dto) {
        var topic = topicService.update(id, dto);
        return ResponseEntity.ok(topic);
    }
}
