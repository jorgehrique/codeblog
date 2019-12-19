package com.spring.codeblog.service.impl;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.PostRepository;
import com.spring.codeblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        Optional<Post> post = postRepository.findById(id);
        return post.isPresent() ? post.get() : new Post();
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }
}
