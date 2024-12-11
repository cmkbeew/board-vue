package com.vue.board.controller;

import com.vue.board.entity.Board;
import com.vue.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/board")
public class BoardController {

    private final BoardService postService;

    @GetMapping
    public List<Board> list() {
        List<Board> list = postService.getAllList();
        return list;
    }

    @GetMapping("/regist")
    public String registGet(Board post) {
        return "register";
    }

    @PostMapping("/regist")
    public Board registPost(Board post) {
        return postService.registPost(post);
    }
}
