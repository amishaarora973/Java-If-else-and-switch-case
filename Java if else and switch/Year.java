import java.util.*;
public class Year{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of days");
int a = sc.nextInt();
if(a>=365){
   int x= a/365;
   System.out.println(" no of year is " + x);
}
int rem=a%365;
if(rem>=30){
   int y=rem/30;
   System.out.println("days is" + y);
}
int rem1=rem%30;
if(rem1>=7){
  int z=rem1/7;
  System.out.println("weeks is" + z);
}
int rem2=rem1%7;
if(rem2!=0){
  
   System.out.println("Day is" +rem2);
}
}
}
