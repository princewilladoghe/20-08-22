package com.company;
//new project to determine minimum and maximum value of an unsorted
//list of integer by using collection
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    public static Integer findMin(List<Integer>list) {
        if (list == null || list.size() == 0) {
            return Integer.MAX_VALUE;
        }
        List<Integer> sortedlist = new ArrayList<>(list);
        Collections.sort(sortedlist);
        return sortedlist.get(0);
    }
        public static Integer findMax(List<Integer>list){
            if (list==null||list.size()==0) {
                return Integer.MIN_VALUE;
            }
                List<Integer>sortedlist=new ArrayList<>(list);
                Collections.sort(sortedlist);
                return sortedlist.get(sortedlist.size()-1);
            }

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(55);
        list.add(20);
        list.add(33);
        list.add(44);
        System.out.println("Min:" + findMin(list));
        System.out.println("Max:" + findMax(list));
    }
}
