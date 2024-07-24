package DS.Array.Unsorted;

public interface Unsorted {
    public static int insert2tail(int[] arr,
            int key, int last, int size) {
        arr[last + 1] = key;
        last = last + 1;

        return last;
    }

    public static int insert(int[] arr,
            int ikey, int last, int size, int p) {
        int k = last;
        arr[k + 1] = arr[k];
        for (k = last; k >= p; k--) {
            if (k == p)
                arr[k] = ikey;
            else
                arr[k] = arr[k - 1];
        }
        return last + 1;
    }

    public static int search(int[] arr,
            int key, int last, int size) {
        int i;
        for (i = 0; i <= last; i++) {
            if(arr[i]==key)
                break;
        }
        return i;
    }

    public static int deleteattail(int[] arr,
            int last) {
        arr[last]=0;
        return last-1;
    }

    public static int delete(int[] arr,
            int key, int last, int size,int p) {

        for (int i = p; i <= last; i++) {            
            arr[i] = arr[i+1];
        }
        arr[last]=0;
        return last - 1;
    }
}
