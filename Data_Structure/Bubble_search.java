package Data_Structure;

public class Bubble_search {
    public static void main(String[] args) {

        int arr[]={9,4,6,2,1,5};
        int size = arr.length;
        int temp=0;
        System.out.println("Elements before sorted :-");
        for(int num:arr){
            System.out.print(num+" ");
        }
        for(int i = 0;i<size;i++){
            for(int j=0;j<size - 1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }   System.out.println(" ");
        System.out.println("Your elements after get sorted :-");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}