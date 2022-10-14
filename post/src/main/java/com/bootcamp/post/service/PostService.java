package com.bootcamp.post.service;

import com.bootcamp.post.dto.PostDto;
import com.bootcamp.post.model.Posts;
import com.bootcamp.post.repos.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Posts userPostCreation(PostDto postDto){
        Posts posts = new Posts();

        posts.setMessage(postDto.getMessage());
        posts.setTimeStamp(postDto.getTimeStamp());
        return postRepository.save(posts);
    }

    public Posts getPostById(Long id){
        return postRepository.findById(id).get();
    }

    public List<Posts> getAllPosts(){
        return postRepository.findAll();
    }

    public List<Posts> getAllPostsForCertainTime(String sort){

        List<Posts> postsList = new ArrayList<>();

        if (sort.equalsIgnoreCase("asc")){
            postsList.addAll(postRepository.findAll(Sort.by(Direction.ASC, "timeStamp")));
        }

        if (sort.equalsIgnoreCase("desc")){
            postsList.addAll(postRepository.findAll(Sort.by(Sort.Direction.DESC, "timeStamp")));
        }

        return postsList;
    }





}
