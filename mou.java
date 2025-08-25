import java.util.*;
public class mou {
  public static int prime(int num, int pos) {
    if(num == 1) return 0;
    boolean flag = true;
    for(int i = 2 ; i < Math.sqrt(num)+1 ; i++) {
        if(num % i == 0) {
          flag = false;
          break;
        }
    }
    if(flag) return pos;
    return 0;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int []arr = new int[size];
    for(int i = 0 ; i < size ; i++) {
      arr[i] = sc.nextInt();
    }
    int sum = 0;
    for(int i = 0 ; i < size ; i++) {
      sum += prime(arr[i], i);
    }
    System.out.print(sum);
    sc.close();
  }
}