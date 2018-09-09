package xuzhu.stringbuffer;

public class StringBuffer1 {
  public static void main(String[] args) {
	  StringBuffer sb = new StringBuffer("");
	  sb.append("abcd");
	  sb.deleteCharAt(sb.length()-1);
	  System.out.println(sb);
}
}
