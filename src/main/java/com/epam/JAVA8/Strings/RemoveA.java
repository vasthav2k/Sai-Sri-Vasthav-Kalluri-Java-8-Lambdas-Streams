package com.epam.JAVA8.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveA{
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ash");
		list.add("cab");
        list.add("abc");
        list.add("abbdf");
        list.add("add");
        list=search(list);
        for(String s:list)
            System.out.println(s);
    }
    static List<String> search(List<String> list)
    {
        return list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
    }


}
