import java.util.Scanner;
public class MaxMin {

	public static void main(String[] args) {
		int max=0,min=0;
   Scanner sc = new Scanner(System.in);
  System.out.println("Enter the digit how many elements do you want:");
  int size = sc.nextInt();
  int arr[] = new int[size];
  System.out.println("Enter the elements:");
  for(int i=0;i<arr.length;i++) {
	  arr[i]=sc.nextInt();
  }
  max=arr[0];
  min=arr[0];
  
  for(int i=0;i<arr.length;i++) {
	  if(arr[i]>max) {
		  max=arr[i];
	  }
  }
  for(int i=0;i<arr.length;i++) {
	  if(arr[i]<min) {
		  min=arr[i];
	  }
  }
  System.out.println("Maximum number in the arry: "+max);
  System.out.println("Minimum number in the array: "+min);
	}

}
