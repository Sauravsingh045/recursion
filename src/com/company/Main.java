package com.company;
// to print for finite times
public class Main {
static int count=0;
    public static void main(String[] args) {
	// write your code here
        p();
    }

    public static void p() {
        count++;
        if(count<=5){
            System.out.println("Hello world");

        p(); }
    }
}
