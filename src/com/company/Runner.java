package com.company;

public class Runner {

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        {
            int arr[] = {51, 20, 3, 76, 9};

            Sorter ob = new Sorter();
            ob.sorter(arr);

            printArray(arr);
        }
    }
}
