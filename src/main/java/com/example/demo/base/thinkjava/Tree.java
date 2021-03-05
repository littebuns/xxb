package com.example.demo;

public class Tree {

    int i;

    public Tree(int i) {
        this.i = i;
    }

    public Tree() {
    }

    public static void main(String[] args) {
        Tree tree = new Tree(6);
        System.out.println(tree.i);
    }
}
