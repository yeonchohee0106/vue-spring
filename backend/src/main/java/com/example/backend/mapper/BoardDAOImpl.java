package com.example.backend.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.backend.vo.BoardDataVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
    
    private final SqlSession sqlSession;
    private static final String Namespace = "com.example.backend.mapper.BoardDAO";
    
    @Autowired
    public BoardDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<BoardDataVO> selectListBoard(HashMap<String, Object> searchText) {

        return sqlSession.selectList(Namespace + ".selectListBoard", searchText);
    }

    @Override
    public BoardDataVO selectBoardById(BoardDataVO dataVO) {
        return sqlSession.selectOne(Namespace + ".selectBoardById", dataVO);
    }
}
