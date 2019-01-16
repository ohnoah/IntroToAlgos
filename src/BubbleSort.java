public class BubbleSort {


    public static void bubbleSort(int[] array){

        for(int i = 0; i<array.length; i++){
            for(int j = array.length - 1; j>i;j--){
                if(array[j] < array[j-1]){
                    //swaps the two adjacent if we want to bubble down i.e. the element in our hand is smaller
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
                }
            }
        }

    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] testArr = new int[]{1,1,2,3,-123,12,123,935,123,51923102,12323,5,-123,-123,-155,-53123,31513,613435,135,13,6,134,1,4,1-23-123,5,0,0,0,0,123,412123,512,31513515,23351,232,32};
        BubbleSort.bubbleSort(testArr);
        for (int k:testArr) {
            System.out.println(k);
        }
        System.out.println((System.nanoTime() - start)/Math.pow(10,9));
    }

    }

