package com.company;

import java.util.ArrayList;

public class OneDRangeQuery {
    private ArrayList<Integer> nums = new ArrayList<>();

    void insert(int v) {
        int low = 0;
        int high = nums.size();

        if (low == high) {
            nums.add(v);
            return;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums.get(mid) > v) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        nums.add(low, v);
    }

    int rank(int v) {
        return search(v, 0, nums.size());
    }

    private int search(int v, int low, int high) {
        int mid = low + (high - low) / 2;
        int cmp = nums.get(mid) - v;
        if (cmp == 0) {
            return mid;
        } else if (cmp > 0) {
            return search(v, low, mid);
        } else {
            return search(v, mid + 1, high);
        }
    }
}

class Tester{
    public static void main(String[] args) {
        OneDRangeQuery object = new OneDRangeQuery();
        int[] arr = {6, 3, 12, 2, 4, 9, 13, 1, 5, 7, 10, 15, 8, 11, 14};

        for (int i = 0; i < arr.length; i++) {
            object.insert(arr[i]);
        }
    }
}













/*

    private Node head;


    void sdfinsert(int v) {
        if (head == null) {
            head = new Node(v);
            return;
        }

        wertgfd(head, v);
    }

    private void wertgfd(Node n, int v) {
        int cmp = n.getVal() - v;
        if (cmp < 0) {
            if (n.getLeft() == null) {
                n.setLeft(new Node(v));
                return;
            } else {
                wertgfd(n.getLeft(), v);
            }
        } else {
            if (n.getRight() == null) {
                n.setRight(new Node(v));
            } else {
                wertgfd(n.getRight(), v);
                return;
            }
        }
    }

    private int rank(Node n){
        return 0;
    }
}

class Node{
    private int val;
    private Node left;
    private Node right;

    Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }

    public int getVal() {
        return val;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}*/