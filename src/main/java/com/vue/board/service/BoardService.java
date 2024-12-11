package com.vue.board.service;

import com.vue.board.entity.Board;

import java.util.List;

public interface BoardService {

    List<Board> getAllList();

    Board registPost(Board post);
}
