public class SmartPhoneTest {
  public static void main(String[] args) {
    SmartPhone p1 = new SmartPhone();
    //p1 객체의 데이터를 수정
    p1.brand = "삼성";
    p1.modelName = "s10";
    p1.color = "white";
    p1.price = 1000;
    p1.phoneNumber = "010-2232-2323";
    //p1 객체의 모든 정보를 출력
    System.out.println(p1.brand);
    System.out.println(p1.modelName);
    System.out.println(p1.color);
    System.out.println(p1.phoneNumber);
    System.out.println(p1.price);

    System.out.println();

    SmartPhone p2 = new SmartPhone();
    p2.printAllData();
    p2.setBrand("apple");
    p2.setModelName("pro max");
    p2.color("black");
    p2.price(2000);
    p2.phoneNumber("010-3333-4444");
    p2.printAllData();
  }
}
