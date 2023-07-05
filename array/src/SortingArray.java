public class SortingArray {
    //Naive Method
//    static boolean inSorted(int arr[]){
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[j]<arr[i]){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
    //Efficient Method
    static boolean inSorted(int arr[]){
        for (int i=1;i<arr.length;i++){
            if (arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9};
        System.out.println(inSorted(arr));
    }
}
