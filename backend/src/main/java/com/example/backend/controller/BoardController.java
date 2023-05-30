package com.example.backend.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.service.BoardService;
import com.example.backend.service.BoardServiceImpl;
import com.example.backend.vo.BoardDataVO;

@RestController
public class BoardController {
    
    private final BoardService boardService;

    public BoardController(BoardServiceImpl boardService) {
        this.boardService = boardService;
    }
    @GetMapping("/api/board")
    public HashMap<String, Object> getBoardData() {
        HashMap<String, Object> apiData = new HashMap<String, Object>();
        
        List<HashMap<String, Object>> boardList = new ArrayList<>();
        
        HashMap<String, Object> board = new HashMap<String, Object>();
        board.put("id", 1);
        board.put("title", "첫번째 제목입니다.");
        board.put("content", "첫번째 내용입니다.");
        board.put("registerName", "첫번째작성자");
        boardList.add(0, board);
        
        board = new HashMap<String, Object>();
        board.put("id", 2);
        board.put("title", "두번째 제목입니다.");
        board.put("content", "두번쨰 내용입니다.");
        board.put("registerName", "두번째작성자");
        boardList.add(1, board);
        
        apiData.put("list", boardList);

        // List<String> items = new ArrayList<>();
        // items.add("1");
        // items.add("2");
        // items.add("3");
        return apiData;
    } 

    @GetMapping("/api/board/list")
    public HashMap<String, Object> getListBoard(@RequestParam HashMap<String, Object> param) {
        HashMap<String, Object> rtnData = new HashMap<String, Object>();

        String searchId = param.get("searchId") != null ? param.get("searchId").toString() : null;
        String searchTitle = param.get("searchTitle") != null ? param.get("searchTitle").toString() : null;
        HashMap<String,Object> dataParam = new HashMap<>();
        dataParam.put("searchId", searchId);
        dataParam.put("searchTitle", searchTitle);
        
        List<BoardDataVO> boardList = boardService.selectListBoard(dataParam);
        rtnData.put("boardList", boardList);
        return rtnData;
    }

    @GetMapping("/api/board/view")
    public HashMap<String, Object> getBoardById(@RequestParam HashMap<String, Object> param) {
        HashMap<String, Object> rtnData = new HashMap<String, Object>();
        String id = param.get("id") != null ? param.get("id").toString() : null;
        BoardDataVO dataParam = new  BoardDataVO();
        dataParam.setId(id);
        BoardDataVO dataVO = boardService.selectBoardById(dataParam);
        rtnData.put("board", dataVO);
        return rtnData;
    }
}
