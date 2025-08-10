package com.wipro.personpost.repository;
import com.wipro.personpost.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PostRepository extends JpaRepository<Post, Long>{

}
