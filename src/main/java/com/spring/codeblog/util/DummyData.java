package com.spring.codeblog.util;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    private PostService postService;

    //@PostConstruct
    public void savePosts(){
        List<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setAutor("Bruno Alexandre");
        post1.setData(LocalDate.now());
        post1.setTitulo("Docker");
        post1.setTexto("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        Post post2 = new Post();
        post2.setAutor("Michelli Brito");
        post2.setData(LocalDate.now());
        post2.setTitulo("API REST");
        post2.setTexto("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        posts.add(post1);
        posts.add(post2);

        posts.forEach(postService::save);
        postService.findAll().forEach(System.out::println);
    }

}
