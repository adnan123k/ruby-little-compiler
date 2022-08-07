package nodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.script.ScriptException;
public abstract class treeNode {
ArrayList<treeNode> childreen=new ArrayList<treeNode>();
public int kind;
static HashMap<String, String> vars = new HashMap<String, String>();
static HashMap<String, Integer> types = new HashMap<String, Integer>();
public void addchild(treeNode child) {
	childreen.add(child);
}
public abstract Object execute() throws ScriptException, IOException ;
public void add(treeNode n) {
	childreen.add(n);
}
}
