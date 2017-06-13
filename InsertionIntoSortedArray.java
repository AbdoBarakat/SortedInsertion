package insertion.sorted;

public class InsertionSorted {

    public static void main(String[] args) {

        int[] arr = new int[100];
        int nElements = 0;
        int j;

        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 77;
        arr[5] = 88;
        arr[6] = 99;
        nElements = 7;

        for (j = 0; j < nElements; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
    
        int e_add = 33;
        j = nElements - 1;
        while (arr[j] > e_add) {
            arr[j+1] = arr[j];
            j--;
        }
    arr[j+1] = e_add;
    nElements++;
    for (j=0; j<nElements; j++) {
        System.out.print(arr[j] + " ");
    }
        System.out.println("");
    }
    
}
