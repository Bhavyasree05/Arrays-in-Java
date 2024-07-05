import java.util.*;
public class Test1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int first=arr[0],second=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first)
              first=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>second&&arr[i]!=first)
              second=arr[i];
        }
        if(n<2){
            System.out.println("-1");
        }
        else{
            System.out.println(first*second);
        }
    }
}
