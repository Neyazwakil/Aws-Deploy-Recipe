package com.neyaz.Recipemanagement.Repository;

import com.neyaz.Recipemanagement.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment,Long> {
    List<Comment> findByRecipeCommentRecipeId(Long recipeid);
}
