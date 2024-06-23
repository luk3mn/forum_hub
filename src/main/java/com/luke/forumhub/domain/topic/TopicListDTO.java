package com.luke.forumhub.domain.topic;

import com.luke.forumhub.domain.user.User;

public record TopicListDTO(
        Long id,
        String title,
        String message,
        User author
) {
    public TopicListDTO(Topic topic) {
        this(topic.getId(), topic.getTitle(), topic.getMessage(), topic.getAuthor());
    }
}
