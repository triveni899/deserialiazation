package wordCount.visitors;

import wordCount.dsForStrings.BST;
import wordCount.dsForStrings.BstNode;
import wordCount.util.FileProcessor;

public class PopulateVisitor implements Visitor{
	
	FileProcessor fp;
	BST tree;
	/**
	 * 
	 * @param fpIn
	 * @param treeIn
	 */
	public PopulateVisitor(FileProcessor fpIn,BST treeIn)
	{
		fp=fpIn;
		tree=treeIn;
	}
	@Override
	public void visit(BstNode bst) {
		// TODO Auto-generated method stub
		
		BstNode root = bst; // = new BstNode();
		
		String row = fp.readLine();
		String[] strings=null;
		
		if(row != null)
		{
			strings = row.split(" ");
		}
			
		int i = strings.length-1;
		
		while(i>=0)
		{
			if(root.getString()==null)
			{
				root.setString(strings[i]);
			}
			else
			{
				root.insert(strings[i]);
			}
			
			--i;
		}
		
		row=fp.readLine();
		while(row!=null)
		{
			strings=row.split(" +");
			i=strings.length-1;
			while(i>=0)
			{
				if(strings[i].length()>0)
				root.insert(strings[i]);
				i--;
			}
			
			row=fp.readLine();
		}
		
		
	}
	
	

}
