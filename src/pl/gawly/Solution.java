package pl.gawly;

public class Solution {

    public int solution(int[] A) {
        double lowestAv = (A[0] + A[1]) / 2.0;
        int indexOfLowestAv = 0;

        for (int i = 0; i < A.length - 2; i++) {
            if (( A[i] + A[i+1]) / 2.0 < lowestAv) {
                lowestAv = ( A[i] + A[i+1]) / 2.0;
                indexOfLowestAv = i;
            }
            if (( A[i] + A[i+1] + A[i+2]) / 3.0 < lowestAv) {
                lowestAv = ( A[i] + A[i+1] + A[i+2]) / 3.0;
                indexOfLowestAv = i;
            }
        }
        //last 2-element slide
        if (( A[A.length-2] + A[A.length-1]) / 2.0 < lowestAv) {
            indexOfLowestAv = A.length-2;
        }

        return indexOfLowestAv;
    }
}
