import java.util.*;
public class Functions {
    public static void printMyAge(int age)
    {
        System.out.println(age);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        printMyAge(age);
    }
}