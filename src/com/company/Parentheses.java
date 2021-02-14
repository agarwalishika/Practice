package com.company;

public class Parentheses {
    public static Sol isValid(int[] seq, int low, int high){
        if (low >= high) {
            if (seq[low] == 0) { return new Sol(-1, false); }
            else               { return new Sol(1, true); }
        }
        int mid = (low + high) / 2;
        Sol left = isValid(seq, low, mid);
        Sol right = isValid(seq, mid+1, high);

        Sol sol;
        if (!left.isvalid) {
            sol = new Sol(Math.min(left.sum, left.sum + right.sum), false);
        } else {
            boolean isval = (left.sum + right.sum) >= 0;
            sol = new Sol(left.sum + right.sum, isval);
        }

        return sol;
    }

    public static void main(String[] args) {
        int[] seq = new int[]{1, 0, 1, 1, 1, 0, 0, 1, 0};
        int low = 0;
        int high = seq.length - 1;
        System.out.println(isValid(seq, low, high).isvalid);
        //sum has to be 0
    }
}

class Sol{
     int sum;
     boolean isvalid;

     public Sol(int sum, boolean isvalid) {
         this.sum = sum;
         this.isvalid = isvalid;
     }
}


