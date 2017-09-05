public class StringManipulator {

    public String trimAndConcat(String strA, String strB) {
      return strA.trim() + strB.trim();
    }

    public Integer getIndexOrNull(String word, char letter) {
      // Integer outInt;
      // outInt = word.indexOf(letter);
      // if (outInt == -1) {
      //   return null;
      // }
      // else {
      //   return outInt;
      // }
      int idx = word.indexOf(letter);
      return idx == -1 ? null : idx;
    }

    public Integer getIndexOrNull(String word, String subString) {
      Integer outInt;
      outInt = word.indexOf(subString.charAt(0));
      if (outInt == -1) {
        return null;
      }
      else {
        return outInt;
      }
    }

    public String concatSubstring(String strA, int startIndex, int endIndex, String strB) {
      return strA.substring(startIndex, endIndex) + strB;
    }




}
