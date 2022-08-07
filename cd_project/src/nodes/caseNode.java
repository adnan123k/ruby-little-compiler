package nodes;

import java.io.IOException;

import javax.script.ScriptException;

public class caseNode extends treeNode {
String varname;	
public void set(String n){
	varname=n;
}
public Boolean execute() throws ScriptException, IOException {
	String temp=treeNode.vars.get(varname);
	int kind=treeNode.types.get(varname);
	if(childreen.size()==2) {
		
		((calNode)childreen.get(0)).execute();
		if(((calNode)childreen.get(0)).kind==kind) {
			if(kind==62) {
				if(((String)((calNode)childreen.get(0)).execute()).compareTo(temp)==0) {
					((statmentNode)childreen.get(1)).execute();
					return true;
				}
			}
			if(kind==61) {
				if(Double.parseDouble((((calNode)childreen.get(0)).value))==Double.parseDouble(temp)) {
					((statmentNode)childreen.get(1)).execute();
					return true;
				}
			}
			if(kind==60) {
				if(Integer.parseInt((((calNode)childreen.get(0)).value))==Integer.parseInt(temp)) {
					((statmentNode)childreen.get(1)).execute();
					return true;
				}
			}
			if(kind==37 || kind==38) {
				if(kind==37) {
					if(temp=="true") {
						((statmentNode)childreen.get(1)).execute();
						return true;
					}
				}
				if(kind==38) {
					if(temp=="false") {
						((statmentNode)childreen.get(1)).execute();
						return true;
					}
				}
			}
			
		}
	}
	else if(childreen.size()==3) {
		((calNode)childreen.get(0)).execute();
		((calNode)childreen.get(1)).execute();
		if(((calNode)childreen.get(0)).kind==kind && ((calNode)childreen.get(1)).kind==kind) {
		
			if(kind==61) {
				if((Double.parseDouble((((calNode)childreen.get(0)).value))<=Double.parseDouble(temp)) && (Double.parseDouble((((calNode)childreen.get(1)).value))>=Double.parseDouble(temp))) {
					((statmentNode)childreen.get(2)).execute();
					return true;
				}
			}
			if(kind==60) {
				if((Integer.parseInt((((calNode)childreen.get(0)).value))<=Integer.parseInt(temp))&& (Integer.parseInt((((calNode)childreen.get(1)).value))>=Integer.parseInt(temp))) {
					((statmentNode)childreen.get(2)).execute();
					return true;
				}
			}
			
			
		}
	}
	return false;
}
}
