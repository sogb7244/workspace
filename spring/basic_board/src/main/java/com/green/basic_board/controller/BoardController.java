package com.green.basic_board.controller;

import com.green.basic_board.dto.BoardDTO;
import com.green.basic_board.mapper.BoardMapper;
import com.green.basic_board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BoardController {
  private BoardService boardService;

  @Autowired
  public BoardController(BoardService boardService){
    this.boardService = boardService;
  }

  @GetMapping("/test1")
  public String test1(){

   String result =  boardService.runTest1();
   return result;
  }
@GetMapping("/test2")
  public List<Integer> test2(){

    List<Integer> result = boardService.runTest2();
    return result;
}
//url : localhost:8080/test3/3
@GetMapping("/test3/{boardNum}")
  public BoardDTO test3(@PathVariable("boardNum")int boardNum ){

    BoardDTO result = boardService.runTest3(boardNum);
    return result;
}
@GetMapping("/test4")
  public List<BoardDTO> test4(){
    BoardDTO dto = new BoardDTO();
    dto.setBoardNum(1);
    dto.setReadCnt(10);
   List<BoardDTO> result = boardService.runTest4(dto);
   return result;
}
@PostMapping("/test5")
public void regBoard(@RequestBody BoardDTO boardDTO){
  System.out.println(boardDTO);
  boardService.regBoard(boardDTO);
}
@DeleteMapping("/test6/{boardNum}")
public int regDelete(@PathVariable("boardNum")int boardNum){
    int result = boardService.regDelete(boardNum);
    return result;
}
@PutMapping("/test7/{boardNum}")
public void regUpdate(@PathVariable("boardNum")int boardNum,@RequestBody BoardDTO boardDTO){
  boardDTO.setBoardNum(boardNum);
  boardService.regUpdate(boardDTO);
}

}
