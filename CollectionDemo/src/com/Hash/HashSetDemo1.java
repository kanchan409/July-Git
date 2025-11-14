package com.Hash;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo1
{
        public static void main(String[] args)
        {
            HashSet set=new HashSet<>();

            set.add("Khushi");
            set.add("Kanchan");
            set.add("Virat");
            set.add("Karpe");

            System.out.println("Before sorting:- "+set);
            TreeSet treeSet=new TreeSet<>(set);
            System.out.println("After Sorting:- "+treeSet);
        }
    }

