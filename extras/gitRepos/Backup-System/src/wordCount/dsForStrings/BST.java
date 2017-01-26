package wordCount.dsForStrings;

import wordCount.util.Results;
import wordCount.visitors.WordCountVisitor;

public class BST {
	
	public BstNode bckuproot;
	
	/**
	 * 
	 * @param node
	 */
	public void dfs(BstNode node)
	{
		//System.out.println(node.getString()+" : " + node.getCount());
		
		WordCountVisitor.chars=WordCountVisitor.chars+node.getString().length()*node.getCount();
		++WordCountVisitor.distinctWords;
		WordCountVisitor.totalWords=WordCountVisitor.totalWords+node.getCount();
		
		
		if(node.getleftNode()!=null)
			dfs(node.getleftNode());
		
		if(node.getrightNode()!=null)
			dfs(node.getrightNode());
			
		
	}
	
	//cloneNode
	/**
	 * 
	 * @param root
	 */
	public void preOrder(BstNode root)
	{
		//System.out.println(root.getString());
		BstNode temp;
		if(root !=null)
		{
			temp=(BstNode)root.clone();
			cloneNode(temp);
			root.registerObserver(temp);
		}
		
		if(root.getleftNode()!=null)
			preOrder(root.getleftNode());
		
		if(root.getrightNode()!=null)
			preOrder(root.getrightNode());
			
	}
	
	
	//modify count 
	/**
	 * 
	 * @param root
	 */
	public void modifyRoot(BstNode root)
	{
		//System.out.println(root.getString());
	
		if(root !=null)
		{
			root.update(root.getCount()+1);
			root.notifyObservers();
			
		}
		
		if(root.getleftNode()!=null)
			modifyRoot(root.getleftNode());
		
		if(root.getrightNode()!=null)
			modifyRoot(root.getrightNode());
			
	}
	
  /**
   * 
   * @param res
   * @param node
   */
	public void writeNode(Results res,BstNode node)
	{
		System.out.println("****mainRoot file*****");
		res.printFile(node);
		System.out.println("****Bckuproot file****");
		res.printFile(bckuproot);
		
	}
	
	/**
	 * 
	 * @param node
	 */
	public void cloneNode(BstNode node)
	{
		bckuproot=insertClone(bckuproot,node);
	}
	
	/**
	 * 
	 * @param node
	 * @param child
	 * @return
	 */
	public BstNode insertClone(BstNode node, BstNode child)
	{
		if(node==null)
			node=child;
		else
		{
			int cmp = child.getString().compareTo(node.getString());
			if(cmp<0)
				node.leftNode=insertClone(node.leftNode,child);
			else if(cmp>0)
				node.rightNode=insertClone(node.rightNode,child);
				
		}
		
		return node;
	}

}
