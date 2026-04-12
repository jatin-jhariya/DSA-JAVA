package arrays;
// import java.util.*;

public class arrays1 {

    public static void updateMarks(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int largestArray(int numbers[]){
        int largest= Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>largest){
                largest= numbers[i];
            }
        }
        return largest;
    }

    public static int smallestArray(int numbers[]){
        int smallest= Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < smallest){
                smallest= numbers[i];
            }
        }
        return smallest;
    }

    public static int binarySearch(int numbers[], int key){

        int start=0;
        int end= numbers.length-1;
        int mid;

        while(start<=end){
            mid=(start+end)/2;

            if(numbers[mid] == key){
                return mid;
            } 
            else if( numbers[mid] > key){
                end= mid-1;
            } else{
                start= mid+1;
            }
        }
        return -1;
    }

    public static void arrayReverse(int numbers[]){

        int temp;
        int i=0, j=1;
        while(i<(numbers.length-j)){
            temp= numbers[i];
            numbers[i]= numbers[numbers.length-j];
            numbers[numbers.length-j]= temp;
            i++; j++;
        }
        
        for(int k=0; k < numbers.length; k++){
            System.out.print(numbers[k]+" ");
        }
    }

    public static void pairsArray(int number[]){

        int tp=0;
        for(int i=0; i< number.length; i++){
            for(int j= i+1; j<number.length; j++){
                System.out.print("("+number[i]+", "+number[j]+")"+ " ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs: "+tp);
    }

    public static void main(String args[]) {

        // int arr[]= new int[50];
        // String name[]= {"jatin", "anand", "pushpa"};

        // Scanner sc= new Scanner(System.in);
        // int marks[]= new int[50];
        // for(int i=0; i<=2; i++){
        // System.out.print("enter marks: ");
        // marks[i]= sc.nextInt();
        // }

        // System.out.println("Phy: "+marks[0]);
        // System.out.println("chem: "+marks[1]);
        // // System.out.println("math: "+marks[2]);

        // marks[2]= marks[2]+2;
        // System.out.println("math: "+marks[2]);
        // System.out.println("length of an array is: "+marks.length);
        // sc.close();

        // int marks[]= {90,91,92};
        // updateMarks(marks);

        // for(int i=0; i<marks.length; i++){
        // System.out.print(marks[i]+" ");
        // }

        // int numbers[]= {2,4,6,8,10,12,14,16};
        // int key=20;

        // int index= linearSearch(numbers, key);

        // if(index == -1){
        //     System.out.print("number is not found.");
        // } else{ 
        //     System.out.print("number is found at index no: "+index);
        // }

        // largest in an array

        // int numbers[]= {1,2,6,3,5};
        // // System.out.print("largest number is: "+largestArray(numbers));
        // System.out.print("smallest number is: "+smallestArray(numbers));

        // int numbers[]= {2,4,6,8,10,12,14};  // sorted
        // int key= 24;

        // System.out.println("number is at index number: "+binarySearch(numbers, key));

        // int numbers[]= {2,4,6,8,10};
        // arrayReverse(numbers);

        // int numbers[]= {2,4,6,8,10};
        // pairsArray(numbers);
    }
}
