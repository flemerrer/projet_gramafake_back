package com.api.own.my.rest_project.controllers;

import com.api.own.my.rest_project.entities.Comment;
import com.api.own.my.rest_project.entities.Post;
import com.api.own.my.rest_project.entities.dto.CommentSend;
import com.api.own.my.rest_project.entities.dto.NewPost;
import com.api.own.my.rest_project.entities.dto.PostSend;
import com.api.own.my.rest_project.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/all")
    public List<PostSend> fetchAll(){
        return postService.getAll();

    }

    @GetMapping("/{id}")
    public Post fetchOne(@PathVariable Long id){
        return postService.getOne(id);
    }

    @GetMapping("/{id}/comments")
    public List<CommentSend> fetchComments(@PathVariable Long id){
        return postService.getPostComments(id);
    }

    @PostMapping("/create")
    public ResponseEntity createPost(@RequestParam String username, @RequestBody NewPost newPost){

        postService.create(username, newPost);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteOne(@PathVariable Long id){
        postService.delete(id);
        return ResponseEntity.notFound().build();
    }

}

