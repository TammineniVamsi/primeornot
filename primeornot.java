import java.util.*;
public class numberisprimeornot{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println(("enter n value"));
    int n=sc.nextInt();
    int count=1;
    for(int i=2;i<n;i++){
        if(n%i==0){
            count++;
        }
    }
    if(count==1){
        System.out.println("number is prime");
    }
    else{
        System.out.println("number is not prime");
    }
   }
}
