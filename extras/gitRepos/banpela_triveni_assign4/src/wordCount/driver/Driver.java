package wordCount.driver;

import wordCount.dsForStrings.BST;
import wordCount.dsForStrings.BstNode;
import wordCount.util.FileProcessor;
import wordCount.util.Results;
import wordCount.visitors.CloneObserveVisitor;
import wordCount.visitors.ModifyCountVisitor;
import wordCount.visitors.PopulateVisitor;
import wordCount.visitors.Visitor;
import wordCount.visitors.WordCountVisitor;

public class Driver {
	
	public static void main(String[] args) {
		
		if(args.length<3)
		{
			System.out.println("Please pass 3 arguments");
			System.exit(1);
		}
		
		if(!args[2].matches("-?\\d+(\\.\\d+)?"))
		{
			System.out.println("Please pass number of iterations as numeric");
			System.exit(1);
		}
		
		int NUM_ITERATIONS = Integer.parseInt(args[2]);
		BstNode node=null;
		BST tree = new BST();
	
		long startTime = System.currentTimeMillis();
		
		for(int i=0;i<NUM_ITERATIONS;i++)
		{
			
			
		FileProcessor fp = new FileProcessor(args[0]);
		Results res = new Results(args[1]);
		Visitor populateVisit = new PopulateVisitor(fp,tree);
		WordCountVisitor wordCountVisit = new WordCountVisitor(res,tree);
		 node = new BstNode();
		
		
		
		
		node.accept(populateVisit);

		node.accept(wordCountVisit);
		
		WordCountVisitor.chars=0;
		WordCountVisitor.distinctWords=0;
		WordCountVisitor.totalWords=0;
		
		}
		
		long finishTime = System.currentTimeMillis();
		
		
		long runTime=(finishTime-startTime)/NUM_ITERATIONS;
	 	System.out.println("Total Time Value: "+runTime);
	 	
	 	
	 	CloneObserveVisitor cloneobserveVisit = new CloneObserveVisitor(tree);
	 	node.accept(cloneobserveVisit);
	 	
	 	 
	 	Results reslt = new Results();
	 	ModifyCountVisitor modifyCountVisit = new ModifyCountVisitor(reslt,tree);
	 	node.accept(modifyCountVisit);
		
		}
	
}
