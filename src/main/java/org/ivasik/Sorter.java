package org.ivasik;

public class Sorter {
    public static <T extends Comparable<T>> void Sort (T[] A, int p,int r) {
        if (A == null) throw new NullPointerException("Pointer to an array is null.");
        if (p > r) throw new IllegalArgumentException("Error when setting boundaries.");
        if (r-p > 1) {     // If there is more than one element in the array.
            int q = (p+r)/2;
            Sort(A,p,q);
            Sort(A,q,r);
            Merge(A,p,q,r);
        }
    }

    private static <T extends Comparable<T>> void Merge(T[] A, int p, int q, int r) {
        Object[] buf = new Object[r - p];
        int bufPos = 0;
        int leftPos = p;
        int rightPos = q;

        while (leftPos < q && rightPos < r) {
            if (A[leftPos].compareTo(A[rightPos]) < 0) {
                buf[bufPos++] = A[leftPos++];
            } else {
                buf[bufPos++] = A[rightPos++];
            }
        }
        if (leftPos == q) {
            r = rightPos;
        } else if (rightPos == r) {
            r -= q-leftPos;
            Copy(A, leftPos,A ,r , q-leftPos);
        }
        Copy(buf, 0,A ,p , r-p);
    }

    private static void Copy( Object[] src, int srcPos, Object[] trgt, int trgtPos, int len) {
        for(int i = 0; i<len; i++) {
            trgt[trgtPos+i] = src[srcPos+i];
        }
    }
}