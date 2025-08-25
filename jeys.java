import java.util.*;
public class jeys {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /* print n rows with order columns like 1 2 3 
    int n = sc.nextInt();
    for(int i = 1 ; i <= n ; i++) {
      for(int j = 1 ; j <= i ; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
      */
    /* print n * n 111 222 333
    int n = sc.nextInt();
    for(int i = 1 ; i <= n ; i++) {
      for(int j = 1 ; j <= n ; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
      */
    /* print 1 to given number with triangle shape
    int n = sc.nextInt();
    int print = 1;
    for(int i = 1 ; i <= n ; i++) {
      for(int j = 1 ; j<= i ; j++) {
        System.out.print(print++ + " ");
      }
      System.out.println();
    }
      */
    /*  print triangle with starting 1 to upto column length
     int n = sc.nextInt();
    for(int i = 1 ; i <= n ; i++) {
      for(int j = 1 ; j<= i ; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    */
    /*
    int n = sc.nextInt();
    for(int i = 1 ; i <= n ; i++) {
      int num = 0;
      if(i % 2 == 1) num = 1;
      for(int j = 1 ; j <= i ; j++) {
        System.out.print(num + " ");
        if(num == 0) num = 1;
        else num = 0;
      }
      System.out.println();
    }
    */
    /*  diamond
    int size = sc.nextInt();
    for(int i = 0 ; i < size ; i++) {
      for(int s = size-1 ; s > i ; s--) {
        System.out.print(" ");
      }
      for(int j = 0 ; j < (i*2) + 1 ; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i = size - 2 ; i >= 0 ; i--) {
      for(int s = size - 2 ; s >= i ; s--) {
        System.out.print(" ");
      }
      for(int j = 0 ; j < (i*2) + 1 ; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    */
    int n = sc.nextInt();
    for(int i = 0 ; i < n ; i++) {
        for(int s = 0 ; s < n-i ; s++) {
          System.out.print(" ");
        }
        for(int j = 0 ; j < (i*2) + 1 ; j++) {
          System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
  }
}
