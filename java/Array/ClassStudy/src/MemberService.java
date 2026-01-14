public class MemberService {
  private String id;
  private String pw;

  //매개변수로 전달된 id = "hong" ,pw = "12345" 일 때 true 리턴
  public boolean login(String id,String pw){
    return id.equals("hong") && pw.equals("12345");
  }
  public void logout(String id){
    System.out.println("로그아웃 되었습니다");
  }
}

