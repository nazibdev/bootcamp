package com.bootcamp.post.controller;

import com.bootcamp.post.dto.PostDto;
import com.bootcamp.post.model.Posts;
import com.bootcamp.post.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class PostController {

    private PostService postService;

    private PostController (PostService postService){
        this.postService = postService;
    }

    @PostMapping("posts")
    public Posts doPosts(@RequestBody PostDto postDto){
        return postService.userPostCreation(postDto);
    }

    @GetMapping("posts/{id}")
    public Posts getPostsById(@PathVariable Long id){
        return postService.getPostById(id);
    }

    @GetMapping("posts")
    public List<Posts> getAllPostsById(){
        return postService.getAllPosts();
    }

    @GetMapping("posts")
    public List<Posts> getAllPostBetween(@RequestParam String sort){
        return postService.getAllPostsForCertainTime(sort);
    }
}
