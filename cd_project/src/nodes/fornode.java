package nodes;

import java.io.IOException;

import javax.script.ScriptException;

public class fornode extends treeNode {
String lowerBound,upperBound,varname;
int lkind,ukind;
public fornode(String lb,String ub,int lk,int uk,String v ) {
	lowerBound=lb;
	upperBound=ub;
	lkind=lk;
	ukind=uk;
	varname=v;
	
	
}
public Object execute() throws ScriptException, IOException {
	if(lkind==60&& ukind==60) {
		
		treeNode.vars.put(varname, lowerBound);
		treeNode.types.put(varname, lkind);
		while (Integer.parseInt(treeNode.vars.get(varname))<=Integer.parseInt(upperBound)){
			((statmentNode)childreen.get(0)).execute();
			if(treeNode.types.get(varname)!=60)break;
		int temp=	Integer.parseInt(treeNode.vars.get(varname))+1;
		
		treeNode.vars.remove(varname);
		treeNode.vars.put(varname,Integer.toString(temp) );

		}
		treeNode.vars.remove(varname);
		treeNode.types.remove(varname);
	}else if(lkind==60) {
		if(	treeNode.vars.containsKey(upperBound)&&	treeNode.types.get(upperBound)==60) {
		treeNode.vars.put(varname, lowerBound);
		treeNode.types.put(varname, 60);
		while (Integer.parseInt(treeNode.vars.get(varname))<=Integer.parseInt(treeNode.vars.get(upperBound))){
			((statmentNode)childreen.get(0)).execute();
			if(treeNode.types.get(varname)!=60)break;
		int temp=	Integer.parseInt(treeNode.vars.get(varname))+1;
		treeNode.vars.remove(varname);
		treeNode.vars.put(varname,Integer.toString(temp) );
		}
		treeNode.vars.remove(varname);
		treeNode.types.remove(varname);}
	}else if(ukind==60) {
		if(	treeNode.vars.containsKey(lowerBound)&&	treeNode.types.get(lowerBound)==60) {
		treeNode.vars.put(varname, treeNode.vars.get(lowerBound));
		treeNode.types.put(varname, 60);
		while (Integer.parseInt(treeNode.vars.get(varname))<=Integer.parseInt(upperBound)){
			((statmentNode)childreen.get(0)).execute();
			if(treeNode.types.get(varname)!=60)break;
		int temp=	Integer.parseInt(treeNode.vars.get(varname))+1;
		treeNode.vars.remove(varname);
		treeNode.vars.put(varname,Integer.toString(temp) );
		}
		treeNode.vars.remove(varname);
		treeNode.types.remove(varname);}
	}else {	if(	treeNode.vars.containsKey(lowerBound)&&	treeNode.types.get(lowerBound)==60 && treeNode.vars.containsKey(upperBound)&&	treeNode.types.get(upperBound)==60) {
		treeNode.vars.put(varname, treeNode.vars.get(lowerBound));
		treeNode.types.put(varname, 60);
		while (Integer.parseInt(treeNode.vars.get(varname))<=Integer.parseInt(treeNode.vars.get(upperBound))){
			((statmentNode)childreen.get(0)).execute();
			if(treeNode.types.get(varname)!=60)break;
		int temp=	Integer.parseInt(treeNode.vars.get(varname))+1;
		treeNode.vars.remove(varname);
		treeNode.vars.put(varname,Integer.toString(temp) );
		}
		treeNode.vars.remove(varname);
		treeNode.types.remove(varname);}}
	
	return null;
}
}
