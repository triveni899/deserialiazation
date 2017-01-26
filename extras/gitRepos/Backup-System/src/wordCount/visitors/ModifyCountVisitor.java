package wordCount.visitors;

import wordCount.dsForStrings.BST;
import wordCount.dsForStrings.BstNode;
import wordCount.util.Results;

public class ModifyCountVisitor implements Visitor {

	Results res;
	BST bst;
	/**
	 * 
	 * @param resIn
	 * @param bstIn
	 */
	public ModifyCountVisitor(Results resIn, BST bstIn)
	{
		res=resIn;
		bst=bstIn;
	}
	
	@Override
	/**
	 * @param node
	 */
	public void visit(BstNode node) {
		// TODO Auto-generated method stub
	   
		
		//modify the counts in main tree
		bst.modifyRoot(node);
		
		//to show backup is updated correctly
		//bst.writeNode(node);
		
		//if(node!=null)
		//res.printFile(node, "rootoutput.txt");
		
		//res.bckrootFile(bst.bckuproot);
		if(node!=null)
		bst.writeNode(res,node);
		
	
	 
		
	}

}
