package com.luke.forumhub.domain.topic;

import com.luke.forumhub.domain.response.ResponseDTO;

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
        List<ResponseDTO> response
) {
    public DetailTopicDTO(Topic topic){
        this(
                topic.getId(),
                topic.getTitle(),
                topic.getMessage(),
                topic.getCreatedAt(),
                topic.getStatus(),
                topic.getAuthor().getId(),
                topic.getCourse().getId(),
                topic.getResponse().stream().map(
                        r -> new ResponseDTO(
                                r.getId(),
                                r.getMessage(),
                                r.getTopic().getId(),
                                r.getCreatedAt(),
                                r.getAuthor().getId(),
                                r.getSolution())
                        ).toList());
    }
}
