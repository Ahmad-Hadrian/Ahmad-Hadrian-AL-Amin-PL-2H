package arrays;

public class multidimensionalaray1 {
    public static void main(String[] args) {
        int arr[ ] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = i;
        }
        int res = arr[0] + arr[2];
        System.out.println(res);
    }
}

