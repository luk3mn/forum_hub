package com.luke.forumhub.domain.topic;

import com.luke.forumhub.domain.course.CourseRepository;
import com.luke.forumhub.domain.response.CreateTopicDetailDTO;
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

    @Autowired
    private CourseRepository courseRepository;

    public Page<ListTopicDTO> getAllTopics(Pageable pageable) {
        return topicRepository.findAll(pageable).map(ListTopicDTO::new);
    }

    public CreateTopicDetailDTO create(CreateTopicDTO dto) {
        var user = userRepository.getReferenceById(dto.authorId());
        var course = courseRepository.getReferenceById(dto.courseId());

        var newTopic = new Topic(dto.title(), dto.message(), dto.createAt(), dto.status(), user, course);
        topicRepository.save(newTopic);
//        var uri = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(user.getId()).toUri();
//        return ResponseEntity.created(uri).body(topicRepository.save(newTopic));
        return new CreateTopicDetailDTO(dto.authorId(), dto.title(), dto.message(), dto.createAt(), dto.status(), dto.authorId(), dto.courseId());
    }

    public ResponseEntity<DetailTopicDTO> getTopicById(Long id) {
        var topic = topicRepository.getReferenceById(id);
//        var topic = topicRepository.getTopicById(id);
        return ResponseEntity.ok(new DetailTopicDTO(topic));
    }

    public void remove(Long id) {
        Optional<Topic> topic = topicRepository.findById(id);

        if (topic.isPresent()) {
            topicRepository.deleteById(id);
        }
    }

    public CreateTopicDetailDTO update(Long id, CreateTopicDTO dto) {
        Optional<Topic> topic = topicRepository.findById(id);
        topic.ifPresent(value -> value.update(dto.title(), dto.message(), dto.status(), topic.get().getCourse()));

        return new CreateTopicDetailDTO(dto.authorId(), dto.title(), dto.message(), dto.createAt(), dto.status(), dto.authorId(), dto.courseId());
    }
}
