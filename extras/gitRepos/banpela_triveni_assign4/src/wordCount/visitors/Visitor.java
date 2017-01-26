package wordCount.visitors;

import wordCount.dsForStrings.BstNode;

public interface Visitor {
	public void visit(BstNode node);
	//public void visit(BstNode bst);

}
