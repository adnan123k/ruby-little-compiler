package nodes;

import java.io.IOException;

import javax.script.ScriptException;

public class dowhilenode extends treeNode{
public Object execute() throws ScriptException, IOException {
	do {
		
		for(int i=0;i<childreen.size()-1;i++) {((statmentNode)childreen.get(i)).execute();}
	}while(!((condtio)childreen.get(childreen.size()-1)).execute());
	return null;
}
}
