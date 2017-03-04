import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchSample {

   private static String REGEX = "b";
   private static String INPUT = "aabfooaabfooabfoobaafooa";
   private static String REPLACE = "-";
   public static void main(String[] args) {

      Pattern p = Pattern.compile(REGEX);
      
      // get a matcher object
      Matcher m = p.matcher(INPUT);
      StringBuffer sb = new StringBuffer();
      String sb1 = null ;
      while(m.find()) {
         m.appendReplacement(sb, REPLACE);
         sb1 =m.replaceAll(REPLACE);
      }
     // m.appendTail(sb);
      System.out.println(sb.toString());
      System.out.println(sb1.toString());
   }
}