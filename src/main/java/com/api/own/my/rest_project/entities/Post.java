package com.api.own.my.rest_project.entities;

import com.api.own.my.rest_project.entities.dto.PostSend;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String picture;

    private String description;

    private LocalDate date;

    @ManyToOne
    User user;

    @OneToMany
    List<Comment> commentList;

    public Post(String picture, String description, User user) {
        this.picture = picture;
        this.description = description;
        this.user = user;
    }

    public PostSend toDto() {
        PostSend postDTO = new PostSend(this.id, this.user.getUsername(), this.user.getProfilePic(), this.getPicture(), this.getDescription(), this.getDate());
        return postDTO;
    }
}
