public class practice{
  public static void main(String[] args) {
String s1 = new String();
// // System.out.println(s1);
String s2 = new String();
System.out.println(s1=s2);
System.out.println(System.identityHashCode(s1));
System.out.println(System.identityHashCode(s2));


String s3 = new String("hello");
String s4 = new String("hello");
System.out.println(System.identityHashCode(s3));
System.out.println(System.identityHashCode(s4));



// System.out.println();
  }
}