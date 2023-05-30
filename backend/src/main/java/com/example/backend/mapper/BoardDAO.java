package com.example.backend.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.backend.vo.BoardDataVO;

@Mapper
public interface BoardDAO {
    public List<BoardDataVO> selectListBoard(HashMap<String,Object> searchText);
    public BoardDataVO selectBoardById(BoardDataVO dataVO);
}
