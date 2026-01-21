package com.green.rest_study;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/emp")
public class EmpController {

  private List<Emp> empList;

  public EmpController(){

    empList = new ArrayList<>();

    empList.add(new Emp(1,"김","a","1000","대리"));
    empList.add(new Emp(2,"이","b","2000","신입"));
    empList.add(new Emp(3,"박","c","3000","과장"));
    empList.add(new Emp(4,"최","d","4000","차장"));
    empList.add(new Emp(5,"권","e","5000","사장"));
  }
  @GetMapping
  public List<Emp> getEmpList(){
    System.out.println("전체 조회");
    return empList;
  }
  @GetMapping("/{num}")
  public Emp getEmp(@PathVariable("num") int num){

    Emp result = null;
    for (Emp e : empList){
      if (e.getEmpNum() == num){
        result = e;
      }
    }
    return result;
  }
  @PostMapping
  public void setEmp(@RequestBody Emp emp){
    empList.add(emp);
  }

  @DeleteMapping("/{num}")
  public List<Emp> setEmpDel(@PathVariable("num")int emp){

    for (int i = 0; i<empList.size();i++){
      if (empList.get(i).getEmpNum() == emp){
        empList.remove(emp);
      }
    }

    return empList;
  }
  @PutMapping("/{num}")
  public void updateEmp(@PathVariable("num")int num,@RequestBody Emp emp){
    System.out.println(emp);
    for (Emp e : empList){
      if(e.getEmpNum() == num){
        e.setEmpPart(emp.getEmpPart());
        e.setEmpSale((emp.getEmpSale()));

      }
    }
  }
}
