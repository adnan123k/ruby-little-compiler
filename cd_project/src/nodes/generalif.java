package nodes;

import java.io.IOException;

import javax.script.ScriptException;

public class generalif extends treeNode {


	public Object execute() throws ScriptException, IOException {
		// TODO Auto-generated method stub
		boolean temp=false; 
		if(((ifNode)childreen.get(childreen.size()-1)).value=="else") {for(int i=0;i<childreen.size()-1;i++) {
			if(((ifNode)childreen.get(i)).value=="elsif"&&temp==true)break;
			else
			temp=((ifNode)childreen.get(i)).execute();
			
		}
		if(!temp) {
			((ifNode)childreen.get(childreen.size()-1)).execute();
		}
		}
		else {
		for(int i=0;i<childreen.size();i++) {
			if(((ifNode)childreen.get(i)).value=="elsif"&&temp==true)break;
			else
			temp=((ifNode)childreen.get(i)).execute();
			
		}}
		return null;
	}

}
