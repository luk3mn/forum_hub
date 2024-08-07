package com.luke.forumhub.domain.topic;

import com.luke.forumhub.domain.course.Course;
import com.luke.forumhub.domain.response.Response;
import com.luke.forumhub.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Table(name = "topics")
@Entity(name = "Topic")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String message;
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private User author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "topic")
    private List<Response> response;
//    private String response;


    public Topic(String title, String message, LocalDateTime createdAt, Status status, User author, Course course) {
        this.title = title;
        this.message = message;
        this.createdAt = createdAt;
        this.status = status;
        this.author = author;
        this.course = course;
    }

    public void update(String title, String message, Status status, Course course) {
        this.title = title;
        this.message = message;
        this.status = status;
        this.course = course;
    }
}
