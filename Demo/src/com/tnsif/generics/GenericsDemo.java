package com.tnsif.generics;

public class GenericsDemo {
	public static void main(String[] args) {
		Integer[] intArray = { 100, 200, 300, 400, 500 };
		Float[] floatArray = { 10.50f, 20.50f, 30.50f };
		String[] strArray = { "Apple", "Banana", "Cherry" };
		
		MyGenericClass<Integer> iobj = new MyGenericClass<Integer>(intArray);
		MyGenericClass<String> sobj = new MyGenericClass<String>(strArray);
		MyGenericClass<Float> fobj=new MyGenericClass<Float>(floatArray);
		
		iobj.printValues();
		System.out.println("Max value : " + iobj.max());
		System.out.println("Min value : " + iobj.min());
		System.out.println("-------------------------------");
		sobj.printValues();
		System.out.println("Max value : " + sobj.max());
		System.out.println("Min value : " + sobj.min());
		System.out.println("-------------------------------");
		fobj.printValues();
		System.out.println("Max value : " + fobj.max());
		System.out.println("Min value : " + fobj.min());
		System.out.println("-------------------------------");
		
		
		/*
		 * // Generic Method Util.printArray(intArray); Util.printArray(strArray);
		 * Util.printArray(floatArray);
		 * 
		 * // Unbounded Wildcard usage List<Integer> intList = Arrays.asList(intArray);
		 * List<Float> floatList = Arrays.asList(floatArray); List<String> strList =
		 * Arrays.asList(strArray);
		 * 
		 * Util.processElements(intList); Util.processElements(floatList);
		 * Util.processElements(strList);
		 * 
		 * //Upper Bounded Wildcard usage Util.processNumbers(intList);
		 * Util.processNumbers(floatList); // Util.processNumbers(strList); // Compile
		 * error: List<String> cannot be converted to List<? extends Number>
		 * 
		 * //Lower Bounded Wildcard usage intList=new ArrayList();
		 * Util.addIntegers(intList);
		 * 
		 * List<Number> numList=new ArrayList(); Util.addIntegers(numList); //
		 * Util.addIntegers(floatList); // Compile error: List<Float> cannot be
		 * converted to List<? super Integer> // Util.addIntegers(strList); // Compile
		 * error: List<String> cannot be converted to List<? super Integer>
		 */	
		}
}






/*
 * //Generic Interface interface Container<T> { void add(T item);
 * 
 * T get(int index); }
 * 
 * //Generic Class implementing the Generic Interface class Box<T> implements
 * Container<T> { private List<T> items = new ArrayList<>();
 * 
 * @Override public void add(T item) { items.add(item); }
 * 
 * @Override public T get(int index) { return items.get(index); } }
 */