package com.luke.forumhub.domain.topic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    @Query("SELECT t FROM Topic t JOIN t.response r WHERE t.id = :id")
    Topic getTopicById(Long id);
}
