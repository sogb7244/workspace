package static_study;

public class Tv {
  int price;
  double inch;
  static int channel;

  public void turnOn(){
    System.out.println("Tv를 켭니다");
    storeLike();
  }

  public void storeLike(){
    System.out.println("Tv 끄기 전에 즐겨찾기 정보를 저장합니다");
  }
  //static이 붙어 있는 메서드 안에서는 static이 없는 메서드 호출 불가
  public static void setChannelInfo(){
    System.out.println("전원이 들어오기 전 채널 정보를 받아옵니다");

  }

}
