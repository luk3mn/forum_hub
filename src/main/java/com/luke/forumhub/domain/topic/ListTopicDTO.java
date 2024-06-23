package com.luke.forumhub.domain.topic;

import com.luke.forumhub.domain.user.User;

public record ListTopicDTO(
        Long id,
        String title,
        String message,
        Long author_id
) {
    public ListTopicDTO(Topic topic) {
        this(topic.getId(), topic.getTitle(), topic.getMessage(), topic.getAuthor().getId());
    }
}
