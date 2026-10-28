class Solution {

    // arr = [1];
    // arr = [-1]
    // 2,4,5,3,1,2    2 1 2 

    //         2
    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        int n = arr.length;
        int max = arr[n - 1];
        int oldNext = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (oldNext >= max) {
                max = oldNext;
            }
            oldNext = arr[i];
            arr[i] = max;
        }
        arr[n - 1] = -1;
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}