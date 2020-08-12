package code.LeetCode.question1_100.question77;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    private ArrayList<List<Integer>> res;

    private void backTrack(int n, int k, int start, LinkedList<Integer> p){
        if(p.size() == k){
            res.add((List<Integer>)p.clone());
            return;
        }
        for (int i = start; i <= n; i++) {
            p.addLast(i);
            backTrack(n,k,i+1,p);
            p.removeLast();
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<List<Integer>>();
        if(n <= 0 || k <= 0 || k > n)
            return res;
        LinkedList<Integer> p = new LinkedList<Integer>();
        backTrack(n,k,1,p);
        return res;
    }
    private static void printList(List<Integer> list){
        for(Integer e: list)
            System.out.print(e + " ");
        System.out.println();
    }
    public static void main(String[] args) {

        List<List<Integer>> res = (new Solution()).combine(4, 2);
        for(List<Integer> list: res)
            printList(list);
    }
}
