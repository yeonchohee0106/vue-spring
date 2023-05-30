package com.example.backend.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.mapper.BoardDAO;
import com.example.backend.mapper.BoardDAOImpl;
import com.example.backend.vo.BoardDataVO;

@Service
public class BoardServiceImpl implements BoardService{

    private final BoardDAO boardDAO;

    @Autowired
    public BoardServiceImpl(BoardDAOImpl boardDAO) {
        this.boardDAO = boardDAO;
    }
    @Override
    public List<BoardDataVO> selectListBoard(HashMap<String,Object> searchText) {
        return boardDAO.selectListBoard(searchText);
    }
    @Override
    public BoardDataVO selectBoardById(BoardDataVO dataVO) {
        return boardDAO.selectBoardById(dataVO);
    }
    
}
