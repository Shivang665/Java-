import java.util.*;
public class if_else {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
       /*
        if(a % 2 == 0)
        {
            System.out.println("a is the even");
        }
        else
        {
            System.out.println("a is odd number");
        }

     */
        if(a==b)
        {
            System.out.println("a is equal to b");
        }
        else if(a > b)
        {
            System.out.println("a is greater then b");
        }
        else
        {
            System.out.println("b is greater then a");
        }


    }

}
