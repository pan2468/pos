package com.cafe.pos.service;

import com.cafe.pos.entity.Board;
import com.cafe.pos.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public List<Board> boardList(){

        return boardRepository.findAll();
    }

    public Board save(Board board){

        return boardRepository.save(board);
    }

    /* 조회수 증가 */
    @Transactional
    public int updateView(Long id) {
        return boardRepository.updateView(id);
    }


}