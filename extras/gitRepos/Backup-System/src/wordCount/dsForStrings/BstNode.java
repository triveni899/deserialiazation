package wordCount.dsForStrings;

import java.util.ArrayList;

import wordCount.visitors.ObserverI;
import wordCount.visitors.Subject;
import wordCount.visitors.Visitor;

public class BstNode implements Cloneable,Subject,ObserverI {

	String data;
	 BstNode leftNode,rightNode;
	int count;
    ArrayList<ObserverI> observers = new ArrayList<ObserverI>();
	
	public BstNode()
	{
		
	}
	
	/**
	 * 
	 * @param str
	 */
	public BstNode(String str)
	{
		data = str;
		leftNode = rightNode = null;
		count = 1;
	}
	
	/**
	 * 
	 * @param visitor
	 */
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}
	
	
	public Object clone()
	{
		BstNode node = new BstNode();
		node.data=this.data;
		node.count=this.count;
		return node;
	}
	
	/**
	 * 
	 * @param str
	 */
	public void insert(String str)
	{	
		int cmp = str.compareTo(data);
		
		if(cmp<0)
		{
			if(leftNode==null)
				leftNode = new BstNode(str);
			else
				leftNode.insert(str);
		}
		else if(cmp>0)
		{
			if(rightNode==null)
				rightNode = new BstNode(str);
			else
				rightNode.insert(str);
		}
		else
			count++;
	}
	
	/**
	 * 
	 * @return string
	 */
	
	public String getString()
	{
		return data;
	}
	
	/**
	 * 
	 * @return BstNode
	 */
	public BstNode getleftNode()
	{
		return leftNode;
	}
	
	/**
	 * 
	 * @return BstNode
	 */
	public BstNode getrightNode()
	{
		return rightNode;
	}
	
	/**
	 * 
	 * @return int
	 */
	public int getCount()
	{
		return count;
	}
	
	/**
	 * 
	 * @param dataIn
	 */
	public void setString(String dataIn)
	{
		data=dataIn;
		leftNode = rightNode = null;
		count = 1;
	}

	@Override
	/**
	 * @param int
	 */
	public void update(int countIn) {
		// TODO Auto-generated method stub
		 count=countIn;
		
		
	}

	

	

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(ObserverI ob:observers)
		{
			//System.out.println("Notifying observers on change in count");
			ob.update(this.count);
		}
		
	}

	

	@Override
	public void registerObserver(ObserverI observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(ObserverI observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}
}
