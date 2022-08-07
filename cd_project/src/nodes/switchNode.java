package nodes;

import java.io.IOException;

import javax.script.ScriptException;

public class switchNode extends treeNode{
	String v;
	String el="";
	public switchNode(String g) {v=g;}
	public void set(String q) {el=q;}
public Object execute() throws ScriptException, IOException {
	((calNode)childreen.get(0)).execute();
	if(el=="") {
	for(int i=1;i<childreen.size();i++) {
		((caseNode)childreen.get(i)).set(v);
		if((((caseNode)childreen.get(i)).execute())==true)break;
	}}
	else {
		boolean r=false;
		for(int i=1;i<childreen.size()-1;i++) {
			((caseNode)childreen.get(i)).set(v);
			if((((caseNode)childreen.get(i)).execute())==true) {r=true;break;}
		}
		if(!r) {((statmentNode)childreen.get(childreen.size()-1)).execute();}
	}
	return null;
}
}
