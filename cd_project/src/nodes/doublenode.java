package nodes;
import java.io.*;
import java.util.regex.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptEngine;
public class doublenode extends treeNode {
String value;
public int kind;
public int q;
String varname;
public doublenode(String value,int kind ){
	this.kind=kind;
	this.value=value;
	varname=value;
	q=kind;
}
	
	public Object execute() throws ScriptException, IOException {
		// TODO Auto-generated method stub
if(q==57) {
	
	if(treeNode.vars.containsKey(varname)) {
	
		kind=treeNode.types.get(varname);
		value=treeNode.vars.get(varname);
	}
	else kind=-1;
}
		if(kind==36) {
			InputStreamReader temp=new 	InputStreamReader(System.in);
			BufferedReader temp2=new BufferedReader(temp);
			value=temp2.readLine();
}
			 if(value=="") {
				kind=-1;
			}
			else if(value.charAt(0)=='\"' && value.charAt(value.length()-1)=='\"') {
				kind=62;
			}
			else if(value.charAt(0)=='\'' && value.charAt(value.length()-1)=='\'') {
				kind=62;
			}
			else if(value.toLowerCase()=="true") {
				kind=37;
			}else if(value.toLowerCase()=="false") {
				kind=38;
			}else{
				boolean p=true;
				double te;
				if(p) {
					try {
						te=Integer.parseInt(value);
						kind=60;
					}catch(Exception e) {
						p=false;
					}
				}if(!p) {
					kind=61;
				}
			}
			
		

			
		
		return value;
	}

}
