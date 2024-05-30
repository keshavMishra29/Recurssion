/*
* Keypad combination
You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone. The following list is the key to characters map

0 -> .;
1 -> abc
2 -> def
3 -> ghi
4 -> jkl
5 -> mno
6 -> pqrs
7 -> tu
8 -> vwx
9 -> yz
Complete the body of printKPC function - without changing signature - to print the list of all words that could be produced by the keys in str.

Use sample input and output to take idea about output

Input Format
Input consists of one line.

First line contains a string str.

Output Format
Words that can be produced by pressed keys indictated by str in order hinted by Sample output

Example 1
Input

78
Output

tv
tw
tx
uv
uw
ux
Explanation

These are the strings that can be formed.

tv, tw, tx, uv, uw, ux

Example 2
Input

1
Output

a
b
c
Explanation

These are the strings that can be formed.

a, b, c

Constraints
0 <= str.length <= 10

str contains numbers only
* */
import java.io.*;
import java.util.*;

public class printKPC {
    static void helper(String ques, String ans){
        String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        for(char chcode: codes[ch - 48].toCharArray()){
            helper(roq, ans + chcode);
        }
    }
    static void printKeyPad(String ques) {
        //Write your code here
        helper(ques, " ");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        printKeyPad(str);
    }
}
