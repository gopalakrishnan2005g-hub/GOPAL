import java.util.Scanner;
public class Main{
    public static void main(String[]args){
Scanner sc = new Scanner(System.in);
String a = sc.nextLine();
String rev = " ";

for(int i = a.length()-1;i>=0;i--){
    rev += a.charAt(i);

}
if(a.equals(rev)){
    System.out.println("palindrome");
}
else{
    System.out.println("not a palindrome");
}
    }
}