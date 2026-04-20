 public class StringB{
public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Karshkr");
    System.out.println(sb);
    // System.out.println(sb.charAt(0));

     // set char at index 0
    // sb.setCharAt(0,'U');
    // System.out.println(sb);

    //insert func 
    sb.insert(2, "F");
    System.out.println(sb);

    //delete
    sb.delete(4,6);
    System.out.println(sb);

    sb.append("k");
    sb.append("r");
    System.out.println(sb.length());
}
 }