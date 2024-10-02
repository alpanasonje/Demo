package com.tnsif.generics;

//A generic interface with bounded type parameter.
interface Myinterface<T extends Comparable<T>> {
	T min();

	T max();
}

// A generic class with bounded type parameter.
public class MyGenericClass<T extends Comparable<T>> implements Myinterface<T>
{
	T[] values;

	MyGenericClass(T[] values)
	   {
	       this.values = values;
	   }
    public T min() {
		T v = values[0];
		for (int i = 0; i < values.length; i++) {
			if (values[i].compareTo(v) < 0)
				v = values[i];
		}
		return v;
	}

	public T max() {
		T v = values[0];
		for (int i = 0; i < values.length; i++) {
			if (values[i].compareTo(v) > 0)
				v = values[i];
		}
		return v;
	}
	public void printValues()
	{
		for(T ele: values)
			System.out.print(ele+"\t");
		System.out.println();
	}
}

