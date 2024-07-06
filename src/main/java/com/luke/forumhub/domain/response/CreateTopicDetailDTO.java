package com.luke.forumhub.domain.response;

import com.luke.forumhub.domain.topic.Status;
import com.luke.forumhub.domain.topic.Topic;

import java.time.LocalDateTime;

public record CreateTopicDetailDTO(
        Long id,
        String title,
        String message,
        LocalDateTime createdAt,
        Status status,
        Long author,
        Long course
) {
    public CreateTopicDetailDTO(Topic topic){
        this(topic.getId(), topic.getTitle(), topic.getMessage(), topic.getCreatedAt(), topic.getStatus(), topic.getAuthor().getId(), topic.getCourse().getId());
    }
}
