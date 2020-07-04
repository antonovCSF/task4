package com.company;

import java.util.Stack;

public class Main {
    public static void sort(int a[], int n) {
        int mid, left, right, l, r, k;
        Stack<Integer> stack = new Stack<>();
        stack.push(n-1);
        stack.push(0);
        System.out.println(stack);
        while (stack.size() > 0) {
            left = stack.pop();
            right = stack.pop();
            mid = a[(left + right) / 2];
            System.out.println(mid);
            l = left;
            r = right;

            while (l < r) {
                while (a[l] < mid) l++;
                while (mid < a[r]) r--;
                if (l <= r) {
                    k = a[l];
                    a[l] = a[r];
                    a[r] = k;
                    l++;
                    r--;
                    System.out.println(stack);
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    System.out.println();
                }
            }
            if (left < r) {
                stack.push(r);
                stack.push(left);
                System.out.println(stack);
            }
            if (l < right) {
                stack.push(right);
                stack.push(l);
                System.out.println(stack);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{33,1,32,79,21,5,63,96,13,99,11,9,70,19,26};
        int n = a.length;
        System.out.println("До сортировки:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        sort(a, n);
        System.out.println("После сортировки:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}