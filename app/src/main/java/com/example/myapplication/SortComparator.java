package com.example.myapplication;

import java.util.Comparator;

public class SortComparator implements Comparator<ListItem> {
    @Override
    public int compare(ListItem o1, ListItem o2) {
        if(o1.getListId()-o2.getListId() == 0){
            return o1.getName().compareTo(o2.getName());
        }else{
            return o1.getListId()-o2.getListId();
        }
    }
}