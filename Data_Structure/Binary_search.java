package Data_Structure;

public class Binary_search {
        public static void main(String[] args) {
            int []num = {6,4,22,8,79};
            int target=22;
            int result;
            result = binary_search(num,target);
            System.out.println("Your number must present in index :-  "+result);
        }
        public static int binary_search(int []num , int target){
            int left=0;
            int right = num.length - 1;
            while(left <= right){
                int mid = (left + right)/2;
                if(num[mid]== target){
                    return mid;
                }
                else if(num[mid]<target){
                    left = mid +1;
                }
                else{
                    right = mid -1;
                }
            }
            return target;
        }
    }


