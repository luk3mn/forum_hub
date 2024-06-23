package com.luke.forumhub.domain.topic;

import java.time.LocalDateTime;

public record DetailTopicDTO(
        Long id,
        String title,
        String message,
        LocalDateTime createdAt,
        Status status,
        Long author,
        String course,
        String response
) {
    public DetailTopicDTO(Topic topic){
        this(topic.getId(), topic.getTitle(), topic.getMessage(), topic.getCreatedAt(), topic.getStatus(), topic.getAuthor().getId(), topic.getCourse(), topic.getResponse());
    }
}
