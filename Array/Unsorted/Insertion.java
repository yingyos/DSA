package Array.Unsorted;


public interface Insertion {
    public static int insert2tail(int[] arr, int key, int last, int size){
        arr[last+1]=key;
        last=last+1;

        return last;
    }
}
