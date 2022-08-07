package nodes;

import java.io.IOException;

import javax.script.ScriptException;

public class whilenode extends treeNode{
public Object execute() throws ScriptException, IOException {
	while(((condtio)childreen.get(0)).execute()) {
for(int i=1;i<childreen.size();i++)((statmentNode)childreen.get(i)).execute();}
	return true;
}
}
