package com.curd.demo.payload;

import lombok.Data;

import java.util.Set;
@Data
public class PostDto {

    private long id;
    private String title;

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setComments(Set<CommentDto> comments) {
        this.comments = comments;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getContent() {
        return content;
    }

    public Set<CommentDto> getComments() {
        return comments;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    private String description;
    private String content;
    private Set<CommentDto> comments;
    private Long categoryId;
}
