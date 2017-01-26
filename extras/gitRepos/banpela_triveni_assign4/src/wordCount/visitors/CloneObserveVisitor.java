package wordCount.visitors;

import wordCount.dsForStrings.BST;
import wordCount.dsForStrings.BstNode;

public class CloneObserveVisitor implements Visitor {

	BST bst;
	/**
	 * 
	 * @param bstIn
	 */
	public CloneObserveVisitor(BST bstIn)
	{
		bst=bstIn;
	}
	@Override
	/**
	 * @param node
	 */
	public void visit(BstNode node) {
		// TODO Auto-generated method stub
		
		
		
		bst.preOrder(node);
		
	}
	
	

}
