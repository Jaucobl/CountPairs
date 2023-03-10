
public class CountPairs {



    public static int countPairs(int[] a) {

        int[] pairsFound = new int[0];

        // Get the ith item in the list
        for (int i = 0; i < a.length; i++) {

            // Search for a pair in list from i+1 to N (End of the list)
            for (int j=i+1; j<a.length; j++) {

                // If array[i] equals any other item to arr[N] True:
                if (a[i] == a[j]) {

                    boolean needToAdd = true;

                    for (int k=0; k<pairsFound.length; k++) {

                        if (pairsFound[k] == a[i]) {
                            needToAdd = false;
                        }

                    }

                    if (needToAdd) {
                        int[] newpairsfound = new int[pairsFound.length + 1];
                        for(int index = 0; index < pairsFound.length; index++){
                            newpairsfound[index] = pairsFound[index];
                        }
                        newpairsfound[newpairsfound.length - 1] = a[i];
                        pairsFound = newpairsfound;
                    }
                    //Then look in the pairs list. If not in the pairs list -> add it to the paris list
                }

            }

        }
        return pairsFound.length;


    }


    public static void main(String[] args) {

        int[] a1 = {1, 3, 1}; // 1 pairs

        int[] a2 = {1, 2, 3, 1, 1, 3}; // 2 pairs

        int[] a3 = {1, 1, 2, 2, 3, 3}; // 3 pairs


        System.out.println("An array of size " + a1.length + " has " + countPairs(a1) + " pairs");
        System.out.println("An array of size " + a2.length + " has " + countPairs(a2) + " pairs");
        System.out.println("An array of size " + a3.length + " has " + countPairs(a3) + " pairs");

    }


}