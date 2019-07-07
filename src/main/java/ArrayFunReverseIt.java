public class ArrayFunReverseIt {
    public static void main(String[] args)
    {

        int [] array = {1, 2, 3, 4, 5};
        System.out.println("The initial array is:");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

        reverse(array, array.length);

    }
    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        //prints reversed array
        System.out.println("The reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }
}