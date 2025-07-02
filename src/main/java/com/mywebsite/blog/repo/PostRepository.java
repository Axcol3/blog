package com.mywebsite.blog.repo;

import com.mywebsite.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
