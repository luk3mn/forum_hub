package com.luke.forumhub.domain.topic;

import com.luke.forumhub.domain.response.Response;

import java.time.LocalDateTime;
import java.util.List;

public record DetailTopicDTO(
        Long id,
        String title,
        String message,
        LocalDateTime createdAt,
        Status status,
        Long author,
        Long course,
        List<Response> response
) {
    public DetailTopicDTO(Topic topic){
        this(topic.getId(), topic.getTitle(), topic.getMessage(), topic.getCreatedAt(), topic.getStatus(), topic.getAuthor().getId(), topic.getCourse().getId(), topic.getResponse());
    }
}
