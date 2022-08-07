package nodes;

import java.io.IOException;

import javax.script.ScriptException;

public class ifNode extends treeNode {
String value;
public ifNode(String v) {
	value=v;
}
	public Boolean execute() throws ScriptException, IOException {
		if(value=="else") {for(int i=0;i<childreen.size();i++) {((statmentNode)childreen.get(i)).execute();}
		return true;}
		
	boolean temp=((condtio)childreen.get(0)).execute();
	if(temp)for(int i=1;i<childreen.size();i++) {((statmentNode)childreen.get(i)).execute();}
		return temp;
	}
}
