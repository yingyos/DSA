package DS;
import DS.Array.Unsorted.Unsorted;
public class Main {    public static void main(String args[]){
        int arr[]  = new int[5];
        int new_arr[] = new int[5];
        int n = 5;
        int last = 1;
        arr[0] = 3;
        arr[1] = 1;
        int key = -5;
        int ikey = 10;
        int p = 1; //position want to insert
      
        System.out.println("Hello world 65410000 Yingyos Sriboonruang");
        //insert at tail
        System.out.println("Insertion at tial" );
        last=Unsorted.insert2tail(arr,key,last,n);
        System.out.println("last1 is"+last);
        //print result
        for(int i=0;i<=n-1;i++)
           System.out.println(arr[i]);
        System.out.println("" );


        //insert at everyWhere
        System.out.println("Insertion everyWhere");
        last = Unsorted.insert(arr, ikey, last, n, p);
        System.out.println("last2 is"+last);
        for(int i=0;i<=n-1;i++)
           System.out.println(arr[i]);
        System.out.println("" );


        System.out.println("Search "+ key +" in arr found at "
        + String.valueOf(Unsorted.search(arr, key, last, n)));
        System.out.println("");

        System.out.println("last is " + last);
        System.out.println("arr[last] is " + arr[last]);
        last = Unsorted.deleteattail(arr, last);
        System.out.println("last after delete is " + last);
        System.out.println("arr[last] is " + arr[last]);
        System.out.println("");

        System.out.println("last is " + last);
        System.out.println("arr[last] is " + arr[last]);
        System.out.println("");

        for(int i=0;i<=n-1;i++)
            System.out.println("arr[last] is " + arr[i]); 
        last = Unsorted.delete(arr, key, last, n, p);
        System.out.println("last after delete is " + last);
        for(int i=0;i<=n-1;i++)
            System.out.println("arr[last] is " + arr[i]);        
    }
}
