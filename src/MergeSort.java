public class MergeSort {

    public static void mergeSort(int[] array, int p, int r){
        if(p<r){
            int q = (int) Math.floor(((double) p+ (double) r)/2);
            MergeSort.mergeSort(array, p, q);
            MergeSort.mergeSort(array, q+1,r);
            MergeSort.merge(array, p,q,r);
        }
    }
    public static void merge(int[] A,int p,int q,int r){
        for(int i = q+1; i<A.length; i++) {
            int insertVal = A[i];
            int j = i - 1;
            while (j >= 0 &&  A[j] > insertVal) {
                A[j+1] = A[j];
                j--;
            }
            System.out.println(j);
            A[j+1] = insertVal;
        }
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] testArr = new int[]{1,1,2,3,-123,12,123,935,123,51923102,12323,5,-123,-123,-155,-53123,31513,613435,135,13,6,134,1,4,1-23-123,5,0,0,0,0,123,412123,512,31513515,23351,232,32};
        MergeSort.mergeSort(testArr, 0,testArr.length-1);
        for (int k:testArr) {
            System.out.println(k);
        }
        System.out.println((System.nanoTime() - start)/Math.pow(10,9));
    }

}
