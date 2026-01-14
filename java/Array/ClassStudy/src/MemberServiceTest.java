import test1_4.Member;

public class MemberServiceTest {
  public static void main(String[] args) {
    MemberService m1 = new MemberService();

    boolean result = m1.login("hong","12345");

   if (result){
     System.out.println("로그인됨");
     m1.logout("hong");
   }
   else{
     System.out.println("id또는 pw 잘못입력");
   }

  }
}
