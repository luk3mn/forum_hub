package com.luke.forumhub.domain.topic;

import com.luke.forumhub.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    @Autowired
    private UserRepository userRepository;

    public Page<ListTopicDTO> getAllTopics(Pageable pageable) {
        return topicRepository.findAll(pageable).map(ListTopicDTO::new);
    }

    public DetailTopicDTO create(CreateTopicDTO dto) {
        var user = userRepository.getReferenceById(dto.authorId());
        var newTopic = new Topic(null, dto.title(), dto.message(), dto.createAt(), dto.status(), user, dto.course(), dto.response());
        topicRepository.save(newTopic);
//        var uri = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(user.getId()).toUri();
//        return ResponseEntity.created(uri).body(topicRepository.save(newTopic));
        return new DetailTopicDTO(dto.authorId(), dto.title(), dto.message(), dto.createAt(), dto.status(), dto.authorId(), dto.course(), dto.response());
    }

    public ResponseEntity<DetailTopicDTO> getTopicById(Long id) {
        var topic = topicRepository.getReferenceById(id);
        return ResponseEntity.ok(new DetailTopicDTO(topic));
    }

    public void remove(Long id) {
        Optional<Topic> topic = topicRepository.findById(id);

        if (topic.isPresent()) {
            topicRepository.deleteById(id);
        }
    }

    public DetailTopicDTO update(Long id, CreateTopicDTO dto) {
        Optional<Topic> topic = topicRepository.findById(id);
        topic.ifPresent(value -> value.update(dto));

        return new DetailTopicDTO(dto.authorId(), dto.title(), dto.message(), dto.createAt(), dto.status(), dto.authorId(), dto.course(), dto.response());
    }
}
