import java.util.*;
public class string {
    public static void main(String[] args) {
    /*    Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st name :-");
        String name =sc.nextLine();
        System.out.print("Enter 2nd name :-");
        String newName =sc.nextLine();
      if(name == newName)
      {
          System.out.println("Both name are same as shown below :-");

      }

      else {
          System.out.println("The given names are different.");
      }
        System.out.println(name+","+ newName+" "+"<--see here");


     */




       /* System.out.print("Enter your First name :-");
        String firstname = sc.nextLine();
        System.out.print("Enter your last name :-");
        String lastname = sc.nextLine();
        System.out.println("Your name is"+" "+firstname+""+lastname);

        */
        String name = "       RuBy Panddye        ";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println("pendulam".startsWith("pen"));
        System.out.println("pendulam".startsWith("fugg"));
        System.out.println("Clock".endsWith("ock"));
        System.out.println("Clock".endsWith("ppk"));
        System.out.println("Clock".equals("clock"));
        System.out.println("Clock".equals("Clock"));
        System.out.println("Clock".equalsIgnoreCase("CLOck"));


        String ncar = "I am the lazy boy and I am lazy in class";
        String far = ncar.replace("lazy", "java");
        System.out.println(ncar.contains("boy"));
        System.out.println(ncar.contains("buggy"));
        String substring = ncar.substring(4);
        String sunstring = ncar.substring(3, 8);
        System.out.println(substring);
        String words[] = ncar.split(" ");
        for(String word:words)
        {
            System.out.println(word);
        }
    }
}
