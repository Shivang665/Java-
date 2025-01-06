package Data_Structure;
public class Linear_search {
    public static void main(String[] args) {


        int num[] = {5, 2, 3, 11, 15};

        int target = 15;
        int result;
        result = linearSearch(num, target);
        System.out.println("The element must found on index" +" "+result);
    }

    public static int linearSearch(int num[], int target) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                return num[i];
            }
        }

        return target;
    }
}