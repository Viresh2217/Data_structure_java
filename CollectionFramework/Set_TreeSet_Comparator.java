package CollectionFramework;

import java.util.*;

import java.util.TreeSet;
import java.util.Iterator;

class Book {
	private String book;
	private int price;
	
	Book(String book,int price){
	this.book=book;
	this.price=price;
	}
	
	public String getBook(){ return( this.book);}
	public int getPrice(){ return( this.price);}
	
	
	
	
	
}

class MyComparator implements Comparator{
	
	
	public int compare(Object obj1, Object obj2) {
		Book B1=(Book)obj1;
		Book B2=(Book)obj2;
		if(B1.getPrice() < B2.getPrice())
		{
			return(-1);
			
		}
		else {
			return(1);
		}
	}
}

public class Set_TreeSet_Comparator {

	public static void main(String[] args) {
		TreeSet<Book> t=new TreeSet<Book>(new MyComparator());
		t.add(new Book("Java", 400)); //1
		t.add(new Book("PHP", 1200)); //
		t.add(new Book("C", 500));
		
		
		Iterator itk= t.iterator();
		while(itk.hasNext())
		{
			Book ok=(Book)itk.next();
			System.out.println(ok.getBook()+"  "+ok.getPrice());
		}

	}

}
