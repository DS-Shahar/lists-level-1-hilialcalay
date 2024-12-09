class Main {
  package olimpics;
import java.util.*;
public class list {
	public static Scanner reader=new Scanner(System.in);
	public static Node h1(int [] a) {
		Node<Integer> first=new Node<>(0);
		Node<Integer> current=first;
		Node<Integer> n;
		for(int i=0;i<a.length;i++) {
			n=new Node<>(a[i]);
				current.setNext(n);
				current=n;
			}
			return first.getNext();
			}
	public static void h2_1(Node<Integer> list) {
		Node<Integer>curr=list;
		while(curr!=null) {
			System.out.println(curr.getValue());
			curr=curr.getNext();
		}
	}
	public static void h2_2(Node<Integer>list) {
		Node<Integer>curr=list;
		if(curr==null){
			return;
		}
		System.out.println(curr.getValue());
		h2_2(curr.getNext());
	}
	public static void h2_3(Node<Integer>list) {
		if(list==null) {
			System.out.println(list.getValue());
			return;
		}
		h2_3(list.getNext());
		System.out.println(list.getValue());
	}
	public static Node h3() {
		Node<Integer> first=new Node<>(0);
		Node<Integer> current=first;
		System.out.println("enter num");
		int n=reader.nextInt();
		Node<Integer>next;
		while(n!=-1) {
			next=new Node<>(n);
			current.setNext(next);
			current=next;
			System.out.println("enter num");
			n=reader.nextInt();
		}
		return first.getNext();
	}
	public static void h4(Node<Integer> list) {
		Node<Integer>curr=list;
		while(curr!=null) {
			if(curr.getValue()%2==0) {
				System.out.println(curr.getValue());
			}
			curr=curr.getNext();
		}
	}
	public static boolean h5(Node<Integer> list1, int n) {
		Node<Integer>curr=list1;
		while(curr!=null) {
			if(curr.getValue()==n) {
				return true;
			}
			curr=curr.getNext();
		}
	}
	
}



  }
}
