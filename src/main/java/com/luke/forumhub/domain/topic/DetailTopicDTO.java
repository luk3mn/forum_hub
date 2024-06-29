package com.luke.forumhub.domain.topic;

import com.luke.forumhub.domain.course.Course;

import java.time.LocalDateTime;

public record DetailTopicDTO(
        Long id,
        String title,
        String message,
        LocalDateTime createdAt,
        Status status,
        Long author,
        Long course,
        String response
) {
    public DetailTopicDTO(Topic topic){
        this(topic.getId(), topic.getTitle(), topic.getMessage(), topic.getCreatedAt(), topic.getStatus(), topic.getAuthor().getId(), topic.getCourse().getId(), topic.getResponse());
    }
}
