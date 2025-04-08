package com.curd.demo.service;


import com.curd.demo.Repository.CategoryRepository;
import com.curd.demo.Repository.PostRepository;
import com.curd.demo.entity.Post;
import com.curd.demo.exception.ResourceNotFoundException;
import com.curd.demo.model.Category;
import com.curd.demo.payload.PostDto;
import org.modelmapper.ModelMapper;



public class PostServiceImpl implements PostService {
    private PostRepository postRepository;
    private ModelMapper mapper;
    private CategoryRepository categoryRepository;

    @Override
    public PostDto createPost(PostDto postDto) {
        Category category = categoryRepository.findById(postDto.getCategoryId())
                .orElseThrow(() -> new ResourceNotFoundException("Shyamal", new Throwable("Not Found")));
        // convert DTO to entity
        Post post = mapToEntity(postDto);
        //post.setCategory(category);
        Post newPost = postRepository.save(post);

        // convert entity to DTO
        PostDto postResponse = mapToDTO(newPost);
        return postResponse;
        // return postDto;
        //return null;
    }

    private PostDto mapToDTO(Post post) {
        PostDto postDto = mapper.map(post, PostDto.class);
//        PostDto postDto = new PostDto();
//        postDto.setId(post.getId());
//        postDto.setTitle(post.getTitle());
//        postDto.setDescription(post.getDescription());
//        postDto.setContent(post.getContent());
        return postDto;
    }

    private Post mapToEntity(PostDto postDto) {
        Post post = mapper.map(postDto, Post.class);
//        Post post = new Post();
//        post.setTitle(postDto.getTitle());
//        post.setDescription(postDto.getDescription());
//        post.setContent(postDto.getContent());
        return post;
    }
}
