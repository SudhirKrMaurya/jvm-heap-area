import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Runtime r=Runtime.getRuntime();
		System.out.println("Max memory==>"+r.maxMemory());
		System.out.println("Total Memory===>"+r.totalMemory());
		System.out.println("Free memory==>"+r.freeMemory());
		System.out.println("Consumed Memory==>"+(r.totalMemory()-r.freeMemory()));
	}
}
