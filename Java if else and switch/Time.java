import java.util.*;
public class Time{
 public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter time in hour");
   int a =sc.nextInt();
   System.out.println("Enter time in min");
   int b= sc.nextInt();
   if(a<12){
        System.out.println(a +"."+b+"AM");

  }
   else{
      if(a==12){
        System.out.println(a+"."+b+"PM")
    }
   else
       }