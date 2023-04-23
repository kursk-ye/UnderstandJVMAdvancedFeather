package com.kursk;

public class ReuseSlot {
    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024]; // 64MB
        }
        int a = 0;
        System.gc();
    }
}
