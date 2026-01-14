public class Song {
  String title;
  String artist;
  String album;
  int year;
  String[] composer = new String[3];

  public void setSong(String xtitle, String xartist, String xalbum,int xyear, String[] xcomposer){
    title = xtitle;
    artist = xartist;
    album = xalbum;
    year = xyear;
    composer = xcomposer;
  }

  public void printAlldata(){
    System.out.println("title" + title);
    System.out.println("artist " + artist);
    System.out.println("album " + album);
    System.out.println("year " + year);
    System.out.print("composer ");

    for(int i = 0; i< composer.length;i++){
      System.out.print (composer[i]+" ");

    }
  }

}
