package com.oop;
/*  Overloading...
 *  -----------
 *  - Method resolution always take cares by Compiler.
 *  - Child has more priority than parent.
 *  - Primitives can promote automatically. 
 *  - Inside a class two methods with same method signature is not 
 *    allowed.
 */
public class Parent {
	 
	 public void method1(int i) {
		 System.out.println("int - arg");
	 }
	 public void method1(double d) {
		 System.out.println("double - arg");
	 }
	 public void method1(float f) {
		 System.out.println("float - arg");
	 }
	 
	 public final void getObj(String s) {
		 System.out.println("String - arg");
	 }
	 public final void getObj(Object o) {
		 System.out.println("Object - arg");
	 }
//	 public final void getObj(StringBuffer sb) {
//		 System.out.println("StringBuffer - arg");
//	 }
	 
	 public static void main(String[] args) {
		 Parent parent = new Parent();
		 byte b = 100; short s = 200; char ch = 'Z';int i = 999;
		 parent.method1(i); // you can pass above three types has parameters.
		 long l = 4532242413332l; float f = 0.0f; double d = 999.999;
		 parent.method1(d); // you can pass above all seven types has parameters
		 parent.method1(f);
		 
		 parent.getObj(null); // child preference.
		 
	}
}