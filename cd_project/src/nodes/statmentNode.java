package nodes;
import java.io.IOException;
import java.util.ArrayList;

import javax.script.ScriptException;
public class statmentNode extends treeNode{
ArrayList<String> childreentype=new ArrayList<String>();
public void addtype(String n) {
	childreentype.add(n);
}
	public Object execute() throws ScriptException, IOException {

		for(int i=0;i<childreen.size();i++) {
			
			String temp=childreentype.get(i);
			switch(temp){
			case "print":{
			try {
			((printNode)childreen.get(i)).execute();}catch(Exception e) {System.out.print(e);}
				break;
			}
			case "while":{
				((whilenode)childreen.get(i)).execute();
				break;
			}
			case "if":{
				((generalif)childreen.get(i)).execute();
				break;
			}
			case "dowhile":{
				((dowhilenode)childreen.get(i)).execute();
				break;
			}
			case "id":{
				((idNode)childreen.get(i)).execute();
				break;
			}
			case "for":{
				((fornode)childreen.get(i)).execute();
				break;
			}
			default:((switchNode)childreen.get(i)).execute();
			}
		}
		return true;
	}
}
