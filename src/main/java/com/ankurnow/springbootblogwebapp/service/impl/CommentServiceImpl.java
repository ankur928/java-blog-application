package com.ankurnow.springbootblogwebapp.service.impl;

import com.ankurnow.springbootblogwebapp.dto.CommentDto;
import com.ankurnow.springbootblogwebapp.entity.Comment;
import com.ankurnow.springbootblogwebapp.entity.Post;
import com.ankurnow.springbootblogwebapp.entity.User;
import com.ankurnow.springbootblogwebapp.mapper.CommentMapper;
import com.ankurnow.springbootblogwebapp.repository.CommentRepository;
import com.ankurnow.springbootblogwebapp.repository.PostRepository;
import com.ankurnow.springbootblogwebapp.repository.UserRepository;
import com.ankurnow.springbootblogwebapp.service.CommentService;
import com.ankurnow.springbootblogwebapp.util.SecurityUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {

    private CommentRepository commentRepository;
    private PostRepository postRepository;
    private UserRepository userRepository;

    public CommentServiceImpl(CommentRepository commentRepository,
                              PostRepository postRepository,
                              UserRepository userRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void createComment(String postUrl, CommentDto commentDto) {

        Post post = postRepository.findByUrl(postUrl).get();
        Comment comment = CommentMapper.mapToComment(commentDto);
        comment.setPost(post);
        commentRepository.save(comment);
    }

    @Override
    public List<CommentDto> findAllComments() {
        List<Comment> comments = commentRepository.findAll();
        return comments.stream()
                .map(CommentMapper::mapToCommentDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteComment(Long commentId) {
        commentRepository.deleteById(commentId);
    }

    @Override
    public List<CommentDto> findCommentsByPost() {
        String email = SecurityUtils.getCurrentUser().getUsername();
        User createdBy = userRepository.findByEmail(email);
        Long userId = createdBy.getId();
        List<Comment> comments = commentRepository.findCommentsByPost(userId);
        return comments.stream()
                .map((comment) -> CommentMapper.mapToCommentDto(comment))
                .collect(Collectors.toList());
    }
}
