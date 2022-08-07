package nodes;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import java.io.IOException;

import javax.script.ScriptEngine;
public class printNode extends treeNode{
	public printNode() {
		
	}
public Object execute() throws ScriptException, IOException {
	
	System.out.println(((calNode)childreen.get(0)).execute());

	return true;
}
}
