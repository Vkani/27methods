package org.college;

public class StringTypes {
public static void main(String[] args) {
	
	//Literal String- same memory for already existing string
	String s="vinoth";
	String s1="kumar";
	String s2="vinoth kumar";
	
	int identityHashcode=System.identityHashCode(s);
	System.out.println(identityHashcode);
	
	int identityHashcode2=System.identityHashCode(s1);
	System.out.println(identityHashcode2);
	
	int identityHashcode3=System.identityHashCode(s2);
	System.out.println(identityHashcode3+"\n");
	
	//Non-literal-Different memory address for already existing string since for every new instance new object is created
	
	
	String a=new String("vinoth");
	String b=new String("kumar");
	String c=new String("vinoth kumar");
	
	int identityHashcodea=System.identityHashCode(a);
	System.out.println(identityHashcodea);
	
	int identityHashcodeb=System.identityHashCode(b);
	System.out.println(identityHashcodeb);
	
	int identityHashcodec=System.identityHashCode(c);
	System.out.println(identityHashcodec);
	
	
	String d="welcome to java class";
	String[] split = d.split("java");
	System.out.println(split);
}
}
