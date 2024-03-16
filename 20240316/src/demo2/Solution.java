package demo2;

import java.util.*;
public class Solution {
    public static void merge(int A[], int m, int B[], int n) {
        int[] ret = new int[m+n];
        int i = 0;
        int j = 0;
        int count = 0;
        while (i<m && j<n) {
            if (A[i] <= B[j]) {
                ret[count] = A[i];
                i++;
            } else {
                ret[count] = B[j];
                j++;
            }
            count++;
        }
        if (i<m) {
            while (i<m) {
                ret[count] = A[i];
                i++;
                count++;
            }
        }
        if (j<n) {
            while (j<n) {
                ret[count] = B[j];
                j++;
                count++;
            }
        }
        System.arraycopy(ret, 0, A, 0, A.length);
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 6};
        int[] B = {2, 5, 6};
        merge(A, 5, B,3);
    }
}