package de.charginov.leetcode;

public class DivisibleAndNonDivisibleSumsDifference {

    public static void main(String[] args) {
        System.out.println(differenceOfSums(10,3));
    }

    public static int differenceOfSums(int n, int m) {
        return (1 + n) * n / 2 - (1 + n / m) * (n / m) * m;
    }
}
