package com.epam.JAVA8.Palindromes;

import java.util.*;
import java.util.stream.IntStream;

public class Palindromes {

	public static void main(String[] args) {
		List<String> stringList=new ArrayList<String>();
		stringList.add("abca");
        stringList.add("aaaa");
        stringList.add("aba");
        stringList.add("abba");
        stringList.add("add");
        stringList=palindromes(stringList);
        for(String s:stringList)
            System.out.println(s);
	}
	static List<String> palindromes(List<String> list)
    {
		List<String> palindromeList=new ArrayList<String>();
		for(String s:list)
		{
			String pal = s.replaceAll("\\s+", "").toLowerCase();
			if( IntStream.range(0,pal.length()/2).noneMatch(j -> pal.charAt(j)!= pal.charAt(pal.length()-j-1)))
				palindromeList.add(pal);
		}
        return palindromeList;
    }
	
}