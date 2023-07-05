public class FrequenciesOfArrayElement {
    static void printfreq(int[] arr)
    {
        int freq =1;
        int i = 1;
        while(i<arr.length)
        {
            while(i<arr.length && arr[i] == arr[i-1])
            {
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+freq);
            i++;
            freq = 1;
        }
        if(arr.length == 1|| arr[arr.length-1] != arr[arr.length-2])
        {
            System.out.println(arr[arr.length-1]+" "+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,10,10,30,30,40};
        printfreq(arr);

    }
}
