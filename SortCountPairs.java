public class SortCountPairs {

    static void Sort(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
    }

    public static int SortCountPairs(int[] array){
        int[] pairsFound = new int[0];
        Sort(array);
        for(int i = 0; i < array.length - 1;i++){
            if(array[i] == array[i + 1]){
                boolean needToAdd = true;
                for (int k=0; k<pairsFound.length; k++) {

                    if (pairsFound[k] == array[i]) {
                        needToAdd = false;
                    }

                }

                if (needToAdd) {
                    int[] newpairsfound = new int[pairsFound.length + 1];
                    for(int index = 0; index < pairsFound.length; index++){
                        newpairsfound[index] = pairsFound[index];
                    }
                    newpairsfound[newpairsfound.length - 1] = array[i];
                    pairsFound = newpairsfound;
                }
            }
        }
        return pairsFound.length;

    }
}

