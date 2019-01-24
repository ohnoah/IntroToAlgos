public class SelectionSort{
    public static void selectionSort(int[] array){

        for(int i = 0; i<array.length; i++){
            int j = i;
            int iMin = i;
            while(j<array.length){
                if(array[j] < array[iMin]) {
                    iMin = j;
                }
                j++;
            }
            int temp = array[iMin];
            array[iMin] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{1,1,2,3,-123,12,123,935,123,51923102,12323,5,-123,-123,-155,-53123,31513,613435,135,13,6,134,1,4,1-23-123,5,0,0,0,0,123,412123,512,31513515,23351,232,32};
        SelectionSort.selectionSort(testArr);
        for (int k:testArr) {
            System.out.println(k);
        }
    }
}