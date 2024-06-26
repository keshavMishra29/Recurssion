/*
Print all subsequences of a string
Given a string, we have to find out all subsequences of it. A String is a subsequence of a given String, that is generated by deleting some character of a given string without changing its order.

Follow up:

Can you come up with an alogrithm that don't have index as parameter in its recursive function?

Input Format
First line contains a string str.

Output Format
Print all subsequences of a str.

Example 1
Input

abc
Output:

abc ab ac a bc b c
Example 2
Input

abcd
Output:

abcd abc abd ab acd ac ad a bcd bc bd b cd c d
Constraints
0<=lenght(str)<=10
* */

import java.util.*;
import java.util.Scanner;

public class printSubsequence{

    static void helper(String s, String ans, int si){
        if(si == s.length()){
            System.out.print(ans + " ");
            return;
        }

        //pick
        helper(s, ans + s.charAt(si), si + 1);

        //not pick
        helper(s, ans , si + 1);
    }
    static void printSubsequences(String s) {
        //Write your code here
        helper(s, "", 0);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSubsequences(s);
    }
}