
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList <Integer> al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter how many numbers : ");
        n=sc.nextInt();
        System.out.println("enter" +n+" numbers");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            al.add(x);        
        }
        System.out.println("enter which no. to remove ");
        int num=sc.nextInt();
        
        //remove element
        al.remove(Integer.valueOf(num));
        System.out.println(al);

        //sort list\
        // al.sort(null);
        // System.out.println(al);
        Collections.sort(al);
        for(Object s:al){
            System.out.println(s);
        }
     }    

}
