package com.epam.JAVA8.StreamAverage;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class StreamAverage
{
	IntStream stream;

	public StreamAverage()
	{
		super();
		this.stream = IntStream.of(7,7,3,8,0,1,3,5);
	}
	
	public void calcAverage()
	{

        OptionalDouble obj=stream.average();
        if(obj.isPresent())
        {
            System.out.println(obj.getAsDouble());
        }
        else
        {
            System.out.println(-1);
        }

	}
}
