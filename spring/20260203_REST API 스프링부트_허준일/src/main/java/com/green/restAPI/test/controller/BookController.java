package com.green.restAPI.test.controller;

import com.green.restAPI.test.dto.BookDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
  private List<BookDTO> bookDTO;

  public BookController() {

    bookDTO = new ArrayList<>();

    bookDTO.add(new BookDTO(1, "어린왕자", "김자바", "돼지국밥", "5000"));
    bookDTO.add(new BookDTO(2, "내장국밥", "이자바", "돼지국밥", "1000"));
    bookDTO.add(new BookDTO(3, "순대국밥", "박자바", "돼지국밥", "15000"));
    bookDTO.add(new BookDTO(4, "아바이순대", "최자바", "돼지국밥", "20000"));
    bookDTO.add(new BookDTO(5, "고추국밥", "정자바", "돼지국밥", "25000"));
  }

  //모든 리스트 조회
  @GetMapping
  public List<BookDTO> getBookList() {

    return bookDTO;
  }

  //하나의 도서정보를 조회
  @GetMapping("/{detail}")
  public BookDTO getDetailBook(@PathVariable("detail") int num) {
    BookDTO a = null;
    for (BookDTO e : bookDTO) {
      if (e.getBookNum() == num) {
        a = e;
      }
    }
    return a;
  }

  //하나의 도서정보를 등록
  @PostMapping
  public void postBook(@RequestBody BookDTO get) {
    bookDTO.add(get);
  }

  //도서정보를 하나 삭제
  @DeleteMapping("/{delete}")
  public List<BookDTO> deleteBook(@PathVariable("delete") int del) {
    for (BookDTO e : bookDTO) {
      if (e.getBookNum() == del) {
        bookDTO.remove(e);
      }
    }
    return bookDTO;
  }
  //하나의 도서정보에서 도서명,저자,도서가격 수정
  @PutMapping("/{put}")
  public void updateBook(@PathVariable("put")int bookNum,@RequestBody BookDTO updtBook){
    for (BookDTO e : bookDTO){
      if (e.getBookNum() == bookNum){
        e.setPrice(updtBook.getPrice());
        e.setAuthor(updtBook.getAuthor());
        e.setTitle(updtBook.getTitle());
      }
    }
  }
}
