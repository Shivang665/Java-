package Data_Structure;

public class Selection_Sort {
    public static void main(String[] args) {
        int []arr = {9,6,3,7,1,2,0};
        int size = arr.length;
        int temp = 0;
        int minIndex = -1;
        System.out.println("Elements looks like this before selection sort :-");
        for (int num:arr){
            System.out.print(num+" ");
        }
        for(int i = 0;i<size - 1;i++){
            minIndex = i;
            for(int j = i+1; j<size;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        System.out.println();
        System.out.println("Elements looks like this after applying selection sort :-");
        for(int num:arr){
            System.out.print(num+" ");
        }
        }
    }

