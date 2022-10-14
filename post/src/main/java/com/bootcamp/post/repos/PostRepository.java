package com.bootcamp.post.repos;

import com.bootcamp.post.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Posts, Long> {

    //save post

    //get all post

    //get single post

    //get all post based on start and end date
//    List<Posts> findAllPostsBetweenTimeFrame(LocalDate startDate, LocalDate endDate);

    public List<Posts> findAllByOrderByIdAsc();
    public List<Posts> findAllByOrderByIdDesc();
}
