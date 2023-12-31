package com.api.own.my.rest_project.entities.dto;

import lombok.NonNull;

import java.time.LocalDate;

public class PostSend {

    private final @NonNull Long id;
    private final @NonNull String author;

    private final @NonNull String profilePic;

    private final @NonNull String picture;

    private final @NonNull String description;

    private final @NonNull LocalDate date;

    public PostSend(@NonNull Long id, @NonNull String author, @NonNull String profilePic, @NonNull String picture, @NonNull String description, @NonNull LocalDate date) {
        this.id = id;
        this.author = author;
        this.profilePic = profilePic;
        this.picture = picture;
        this.description = description;
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public String getPicture() {
        return picture;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getProfilepic() {
        return profilePic;
    }

    public Long getId() {
        return id;
    }

    public String getProfilePic() {
        return profilePic;
    }
}
