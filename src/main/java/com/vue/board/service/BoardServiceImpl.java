package com.vue.board.service;

import com.vue.board.entity.Board;
import com.vue.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository postRepository;

    @Override
    public List<Board> getAllList() {
        return postRepository.findAll();
    }

    @Override
    public Board registPost(Board post) {
        return postRepository.save(post);
    }
}
