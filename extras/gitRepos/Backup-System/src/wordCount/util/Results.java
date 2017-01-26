package wordCount.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import wordCount.dsForStrings.BstNode;
import wordCount.visitors.WordCountVisitor;

public class Results implements FileDisplayInterface {

	String foutput;
	PrintStream writer;
	PrintWriter output ;
	String tempstr="";
	StringBuffer strbuf=new StringBuffer("");
	
	public Results()
	{
		
	}
		
	/**
	 * 
	 * @param outputIn
	 */
	public Results(String outputIn)
	{
		this.foutput=outputIn;
		if(Logger.DebugLevel.CONSTRUCTOR != null)
		{
			if(Logger.getDebugValue()==Logger.DebugLevel.CONSTRUCTOR)
			System.out.println("Results Constructor is called");
		}
	}

	
	@Override
	public void writeSchedulesToFile() {
		// TODO Auto-generated method stub
		//write output
		
		try {
			writer = new PrintStream(foutput);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
			System.exit(1);
		}
					
			writer.println("Total Words: "+WordCountVisitor.totalWords);
			writer.println("Distinct Words: "+WordCountVisitor.distinctWords);
			writer.println("Characters: "+WordCountVisitor.chars);
			
		
		 writer.flush();
		    writer.close(); 
		
		
	}
	
	
   /**
    * 
    * @param node
    */
	
	public void printFile(BstNode node) {
		
		 /* File file = new File(fname);
		   FileWriter writer = null;
		try {
			writer = new FileWriter(file, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    output = new PrintWriter(writer);
		     //output.print(strBuf); */
		 
		    traverse(node);
		    
		     // output.close();
	
	}
	
	/**
	 * 
	 * @param node
	 */
	public void traverse(BstNode node)
	{
		
			//strbuf.append(node.getString());	
			//strbuf.append(node.getString()+" : " + node.getCount());
			System.out.println(node.getString()+" : " + node.getCount());
			//output.println(strbuf);
			//output.println();
		
		
		if(node.getleftNode()!=null)
			traverse(node.getleftNode());
		
		if(node.getrightNode()!=null)
			traverse(node.getrightNode());
			
		
	}
	
	
	
	
	
	
	
	
	
	
}//class ends