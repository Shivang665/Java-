import java.util.*;
public class methods_to_write_parameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        greet  obj = new greet();
        obj.man();
        obj.man("Sam");
        obj.man(sc.nextLine(),3);
        obj.man("Rohit",5);
    }
    static class greet{
        void man(){
            System.out.println("Hello !!! how are you doing");
        }
        void man(String name){
            System.out.println("Hey"+" "+name+" "+"what are you doing");
        }

        void man(String name,int count){
            for(int i=0;i<count;i++)
            {
                System.out.println("Hello "+name);
            }
        }
    }
}
