// import java.util.*;
// public class pattern {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int size = sc.nextInt();
//     for(int i = 0 ; i < size ; i++) {
//       for(int j = 0 ; j < size ; j++) System.out.print("*");
//       System.out.println();
//     }
//     sc.close();
//   }
// }
import java.util.*;
public class moul
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
// 		System.out.println("Hello World");
         int n = in.nextInt();
         int arr[] = new int[n];
         for(int i=0;i<n;i++){
             arr[i] = in.nextInt();
         }
        int c =0;
         int sum =0;
         for(int i=0;i<n;i++){
               c=0;
            for(int j=1;j<=i*i ;j++){  // until square of each element just for optimization
            if(arr[i]>1){
                if(arr[i]%j == 0){
                    c++;
                }
            }
            }
            
            if(c<=2){
                sum += i;
            }
            }
         
         System.out.print(sum);
         in.close();
	}
}