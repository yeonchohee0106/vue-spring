package com.example.backend.service;

import java.util.HashMap;
import java.util.List;

import com.example.backend.vo.BoardDataVO;

public interface BoardService {
    public List<BoardDataVO> selectListBoard(HashMap<String, Object> searchText);
    public BoardDataVO selectBoardById(BoardDataVO dataVO);
}
