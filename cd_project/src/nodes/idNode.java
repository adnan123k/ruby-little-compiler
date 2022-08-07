package nodes;

import java.io.IOException;

import javax.script.ScriptException;

public class idNode extends treeNode{
String name,op;
int kind;
public idNode(String name,String op,int kind) {
	
	this.name=name;
	this.kind=kind;
	this.op=op;
}
public Object execute() throws ScriptException, IOException {
	if(op=="=") {
		if(kind==37 ) {
			treeNode.vars.put(name, "true");
			treeNode.types.put(name, kind);
		}else if(kind==38) {
			treeNode.vars.put(name, "false");
			treeNode.types.put(name, kind);
		}
		else {
	((calNode)childreen.get(0)).execute();
			if(((calNode)childreen.get(0)).kind!=-1) {
			treeNode.vars.put(name,((calNode)childreen.get(0)).execute().toString());

			treeNode.types.put(name,((calNode)childreen.get(0)).kind);	}
		
		}
		
		
	}else {
	if(treeNode.vars.containsKey(name)) {
		
		((calNode)childreen.get(0)).execute();
		
		if(((calNode)childreen.get(0)).kind==treeNode.types.get(name)) {

			if(treeNode.types.get(name)==62 && op=="+=") {
			
				String temp=((calNode)childreen.get(0)).execut(treeNode.vars.get(name)).toString();
	
				treeNode.vars.remove(name);
				treeNode.vars.put(name,temp);
				treeNode.types.put(name,62);
			
			
				
			}else if(treeNode.types.get(name)==61){
			
				switch (op) {
				case "+=":{
					double temp=Double.parseDouble(((calNode)childreen.get(0)).execut(treeNode.vars.get(name)+"+").toString());
					treeNode.vars.remove(name);
					treeNode.vars.put(name,Double.toString(temp));
					treeNode.types.put(name,61);
					break;}
				case "-=":{	double temp=Double.parseDouble(((calNode)childreen.get(0)).execut(treeNode.vars.get(name)+"-").toString());
				treeNode.vars.remove(name);
				treeNode.vars.put(name,Double.toString(temp));
				treeNode.types.put(name,61);
				break;}
				case "*=":{	double temp=Double.parseDouble(((calNode)childreen.get(0)).execut(treeNode.vars.get(name)+"*").toString());
				treeNode.vars.remove(name);
				treeNode.vars.put(name,Double.toString(temp));
				treeNode.types.put(name,61);
				break;}
				case "/=":{	double temp=Double.parseDouble(((calNode)childreen.get(0)).execut(treeNode.vars.get(name)+"/").toString());
				treeNode.vars.remove(name);
				treeNode.vars.put(name,Double.toString(temp));
				treeNode.types.put(name,61);
				break;}
				case "%=":{	double temp=Double.parseDouble(((calNode)childreen.get(0)).execut(treeNode.vars.get(name)+"%").toString());
				treeNode.vars.remove(name);
				treeNode.vars.put(name,Double.toString(temp));
				treeNode.types.put(name,61);
				break;}
				}
			}else {
		
				switch (op) {
				case "+=":{
				
					int temp=(int)((calNode)childreen.get(0)).execut(treeNode.vars.get(name)+"+");
					treeNode.vars.remove(name);
					treeNode.vars.put(name,Integer.toString(temp));
					
					treeNode.types.put(name,60);
					break;}
				case "-=":{	int temp=Integer.parseInt(((calNode)childreen.get(0)).execut(treeNode.vars.get(name)+"-").toString());
				treeNode.vars.remove(name);
				treeNode.vars.put(name,Integer.toString(temp));
				treeNode.types.put(name,60);
				break;}
				case "*=":{	try{int temp=Integer.parseInt(((calNode)childreen.get(0)).execut(treeNode.vars.get(name)+"*").toString());
				treeNode.vars.remove(name);
				treeNode.vars.put(name,Integer.toString(temp));
				treeNode.types.put(name,60);}catch(Exception e) {System.out.println(e.getLocalizedMessage());}
				break;}
				case "/=":{	int temp=Integer.parseInt(((calNode)childreen.get(0)).execut(treeNode.vars.get(name)+"/").toString());
				treeNode.vars.remove(name);
				treeNode.vars.put(name,Integer.toString(temp));
				treeNode.types.put(name,60);
				break;}
				case "%=":{	int temp=Integer.parseInt(((calNode)childreen.get(0)).execut(treeNode.vars.get(name)+"%").toString());
				treeNode.vars.remove(name);
				treeNode.vars.put(name,Integer.toString(temp));
				treeNode.types.put(name,60);
				break;}
				}
			}
		}
	}	
	}
	return null;
}
}
