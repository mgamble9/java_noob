import java.util.*;

public class HashmatiqueTest {
    public static void main(String[] args) {

      HashMap<String, String> trackList = new HashMap<>();
      trackList.put("Eye For An Eye", "sample lyric1");
      trackList.put("Bumba", "sample lyric2");
      trackList.put("Bumbklatt", "sample lyric3");
      trackList.put("Umbabarauma", "sample lyric4");

      System.out.println("Lyrics of Bumba: " + trackList.get("Bumba"));

      for (String value : trackList.keySet()) {
        System.out.println(value + " : " + trackList.get(value));
      }




    }
}
