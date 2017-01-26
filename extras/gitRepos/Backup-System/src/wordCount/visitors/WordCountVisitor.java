package wordCount.visitors;

import wordCount.dsForStrings.BST;
import wordCount.dsForStrings.BstNode;
import wordCount.util.Results;

public class WordCountVisitor implements Visitor {
	

	Results res;
	public static int chars,distinctWords,totalWords;
	BST bst;
	/**
	 * 
	 * @param resIn
	 * @param bstIn
	 */
	public WordCountVisitor(Results resIn,BST bstIn)
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
		
		
		bst.dfs(node);
		res.writeSchedulesToFile();
			
		
		
	}
  
}
