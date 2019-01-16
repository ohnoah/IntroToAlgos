public class InsertionSort {
    public static int[] insert(int element, int[] array) {
        int[] returnArr = new int[array.length + 1];
        for(int i = 0; i< array.length; i++){
            //we find insert position if we have passed our spot in the order
            if(element <= array[i]){

                returnArr[i] = element;
                for(int j = i +1; j<array.length+1; j++){
                    returnArr[j] = array[j-1];
                }
                break;
            }
            //otherwise copy elements into return array
            else{
                returnArr[i] = array[i];
            }
        }
        return returnArr;
    }

    public static void insertionSort(int[] array){
        for(int i = 1; i<array.length; i++){
            int insertVal = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > insertVal){

                array[j + 1] = array[j];
                j = j -1;
            }

            array[j+1] = insertVal;
        }
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] testArr = new int[]{1,1,2,3,-123,12,123,935,123,51923102,12323,5,-123,-123,-155,-53123,31513,613435,135,13,6,134,1,4,1-23-123,5,0,0,0,0,123,412123,512,31513515,23351,232,32};
        InsertionSort.insertionSort(testArr);
        for (int k:testArr) {
            System.out.println(k);
        }
        System.out.println((System.nanoTime() - start)/Math.pow(10,9));
    }


}
