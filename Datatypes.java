
    import java.util.Scanner;
public class Datatypes {
    public static void main(String[] args){
    Scanner scanner=new Scanner (System.in);
    System.out.println("start giving inputs");
    int num =scanner.nextInt();
    double num1 =scanner.nextDouble();
    float num2 =scanner.nextFloat();
    long num3=scanner.nextLong();
    System.out.println("enter the char");
    char character=scanner.next().charAt(0);
    System.out.println("enter name");
    String name=scanner.next();
    System.out.println(num);
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(character);
    System.out.println(name);
    scanner.close();
    }    
}


