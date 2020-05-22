package com.ayer.webBlog.repo;

import com.ayer.webBlog.models.Post;
import org.springframework.data.repository.CrudRepository;
// Короч - интерфейс для манипуляций данными в модели пост
public interface PostRepository extends CrudRepository<Post, Long> {

}
