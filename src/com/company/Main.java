package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(S(3));

        System.out.println(f(4));
    }

    //Example 2:
    static long S(int n) {
        if (n == 1) //base case, will stop at 1
            return 1;
        else
            return S(n - 1) + n; //recursion towards base case
    }

    //Example 3: We are making a non-recursive version of the program in the handout;
    //this is so that we don't recall functions
    static int f (int N) {
        if (N == 0)
            return 1;
        if (N == 1)
            return 2;
        else {
            int nCurrent = 1;
            int fCurrent = 2;
            int fPrev = 1;

            while (nCurrent < N) {
                int fNext = 2 * fCurrent + fPrev - 1;
                fPrev = fCurrent;
                fCurrent = fNext;
                nCurrent++;
            }
            return fCurrent;
        }

    }
}
