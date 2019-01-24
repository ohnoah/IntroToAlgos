import jdk.swing.interop.SwingInterOpUtils;

public class HeapSort {

    public static void heapify(int[] array, int upperBound, int root) throws IllegalArgumentException {
        //checks that valid indices are put in to method
        if(2*root + 2 >= upperBound ){
            System.out.println("STOP HERE");
        }
        else if (2*root + 1 >= array.length){
            System.out.println("NO CHILDREN");
            return;
        }
        else if(array[root] >= array[2 * root + 1] && array[root] >= array[2 * root + 2]){
            System.out.println("ALREADY FINE");
            return;
        }
        else {
            //finds the index of the largest child and switches it with the root
            int biggerIndex = (array[2 * root + 1] >= array[2 * root + 2]) ? 2 * root + 1 : 2 * root + 2;
            int temp = array[biggerIndex];
            array[biggerIndex] = array[root];
            array[root] = temp;
            HeapSort.heapify(array, upperBound, biggerIndex);
        }
    }
    

    public static void heapSort (int[] array){
        //creates a heap from the array
        for(int i = array.length/2 - 1; i>=0; i--){
            heapify(array, array.length, i);
        }
        System.out.println("INITIAL HEAP");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<Math.pow(2,i)&&j+Math.pow(2,i)<array.length;j++){
                System.out.print(array[j+(int)Math.pow(2,i)-1]+" ");

            }
            System.out.println();
        }
        System.out.println("DONE");

        //extracts item and builds sorted from top array on largest indices gradually
        for(int k = array.length; k>1; k--){
            //swaps largest item to end
            int temp = array[0];
            array[0] = array[k-1];
            array[k-1] = temp;

            //then restore max-heap condition by calling heapify
            HeapSort.heapify(array, k-1,0 );

            for(int i=0;i<k-1;i++){
                for(int j=0;j<Math.pow(2,i)&&j+Math.pow(2,i)<k-1;j++){
                    System.out.print(array[j+(int)Math.pow(2,i)-1]+" ");

                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {

        int[] testArr = new int[]{1,1,2,3,-123,12,123,935,123,51923102,12323,5,-123,-123,-155,-53123,31513,613435,135,13,6,134,1,4,1-23-123,5,0,0,0,0,123,412123,512,31513515,23351,232,32};
        System.out.println("SORTING TIME");
        HeapSort.heapSort(testArr);
        for (int k:testArr) {
            System.out.println(k);
        }
    }
}

