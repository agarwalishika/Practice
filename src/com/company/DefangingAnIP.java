package com.company;

/*
https://leetcode.com/problems/defanging-an-ip-address/submissions/
 */

public class DefangingAnIP {
    public String defangIPaddr(String address) {
        for (int i = 0; i < address.length(); i+=1) {
            if (address.charAt(i) == '.') {
                String prefix = address.substring(0, i);
                String suffix = address.substring(i + 1);
                address = prefix + "[.]" + suffix;
                i += 2;
            }
        }

        return address;
    }
}
