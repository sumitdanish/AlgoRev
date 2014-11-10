package com.algo.ds.practice;

import java.io.File;
import java.util.Scanner;

public class CopyLinkListUsingRandomPointer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try
		{
			Scanner sc = new Scanner(new File("link.txt"));
		    String[] a = sc.next().split(",");
		    Node list = null;
		    CreateLinkList cl = new CreateLinkList();
		    for(String s : a)
		    {
			     //cl.createList(Integer.parseInt(s));
		    	list=cl.createListRecur(Integer.parseInt(s),list);
		    }
		    CopyLinkListUsingRandomPointer co = new CopyLinkListUsingRandomPointer();
		    cl.print(list);
		    System.out.println("___________________________________________");
		    Node li=co.getCopyOfList(list);
		    cl.print(li);
		    
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

	
	
	private Node getCopyOfList(Node list)
	{
		try
		{
			Node n = list;
			while(n!=null)
			{
				Node copy = new Node(n.getData());
				copy.setNextNode(n.getNextNode());
				n.setNextNode(copy);
				n=copy.getNextNode();
			}
//			n=list;
//			while(n!=null)
//			{
//				if(n.getRandomNode()!=null)
//				{
//					n.getNextNode().setRandomNode(n.ge)
//				}
//			}
			return list;
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	
	
	
}
