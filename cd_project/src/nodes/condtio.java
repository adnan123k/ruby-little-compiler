package nodes;

import java.io.IOException;

import javax.script.ScriptException;

public class condtio extends treeNode{
	String operation="";
	public condtio(){}
	public void set(String op) {operation=op;}
public Boolean execute() throws ScriptException, IOException {
	if(childreen.size()==1) {
		((calNode)childreen.get(0)).execute();
	int temp=	((calNode)childreen.get(0)).kind;
	
	if(temp==37){
		return true;	
		}
	if(temp==38){
		return false;	
		}
		
	}
	String temp=((doublenode)childreen.get(1)).value;

	 ((calNode)childreen.get(0)).execute();
	
if(operation=="") {	 
	 ((calNode)childreen.get(2)).execute();
if(((calNode)childreen.get(0)).kind==60 && ((calNode)childreen.get(2)).kind==60)	 {
switch (temp) {
case "==":{
return	Integer.parseInt( ((calNode)childreen.get(0)).value)==Integer.parseInt( ((calNode)childreen.get(2)).value);
	}
case ">=":
	
	return Integer.parseInt( ((calNode)childreen.get(0)).value)>=Integer.parseInt(((calNode)childreen.get(2)).value);
case "!=":return Integer.parseInt( ((calNode)childreen.get(0)).value)!=Integer.parseInt(((calNode)childreen.get(2)).value);
case "<=":return Integer.parseInt( ((calNode)childreen.get(0)).value)<=Integer.parseInt(((calNode)childreen.get(2)).value);
case ">":return Integer.parseInt( ((calNode)childreen.get(0)).value)>Integer.parseInt(((calNode)childreen.get(2)).value);
case "<":return Integer.parseInt( ((calNode)childreen.get(0)).value)<Integer.parseInt(((calNode)childreen.get(2)).value);

default:break;
}}
if(((calNode)childreen.get(0)).kind==62 && ((calNode)childreen.get(2)).kind==62)	 {
switch (temp) {
case "==":{
if(((String)((calNode)childreen.get(0)).value).compareTo((String)((calNode)childreen.get(2)).value)==0)return true;
return	false;
	}
case "!=":{if(((String)((calNode)childreen.get(0)).value).compareTo((String)((calNode)childreen.get(2)).value)==0)return false;
return	true;}



default:{
	return false;
	}
}}
if(((calNode)childreen.get(0)).kind==61 && ((calNode)childreen.get(2)).kind==61)	 {
switch (temp) {
case "==":{
return	Double.parseDouble(((calNode)childreen.get(0)).value)==Double.parseDouble(((calNode)childreen.get(2)).value);
	}
case ">=":return Double.parseDouble( ((calNode)childreen.get(0)).value)>=Double.parseDouble(((calNode)childreen.get(2)).value);
case "!=":return Double.parseDouble( ((calNode)childreen.get(0)).value)!=Double.parseDouble(((calNode)childreen.get(2)).value);
case "<=":return Double.parseDouble( ((calNode)childreen.get(0)).value)<=Double.parseDouble(((calNode)childreen.get(2)).value);
case ">":return Double.parseDouble( ((calNode)childreen.get(0)).value)>Double.parseDouble(((calNode)childreen.get(2)).value);
case "<":return Double.parseDouble( ((calNode)childreen.get(0)).value)<Double.parseDouble(((calNode)childreen.get(2)).value);



default:{
	return false;
	}
}}
if((((calNode)childreen.get(0)).kind==37||((calNode)childreen.get(0)).kind==38) && (((calNode)childreen.get(2)).kind==37||((calNode)childreen.get(2)).kind==38))	 {
switch (temp) {
case "==":{
return	((calNode)childreen.get(0)).value==((calNode)childreen.get(2)).value;
	}
case "!=":return  ((calNode)childreen.get(0)).value!=((calNode)childreen.get(2)).value;



default:{
	return false;
	}
}}
}
else {
	if(childreen.size()==2) {
		
		if(operation=="and") {
			return ((boolean)((calNode)childreen.get(0)).execute())&& 	((condtio)childreen.get(1)).execute();
		}else {return ((boolean)((calNode)childreen.get(0)).execute())||	((condtio)childreen.get(1)).execute();
		}
	}else {
		 ((calNode)childreen.get(2)).execute();

		 if(((calNode)childreen.get(0)).kind==60 && ((calNode)childreen.get(2)).kind==60)	 {
	
		 switch (temp) {
		 case "==":{
			
			 if(operation=="and")
		 return	(Integer.parseInt(((calNode)childreen.get(0)).value)==Integer.parseInt(((calNode)childreen.get(2)).value)) && ((condtio)childreen.get(3)).execute();
			 else {return	(Integer.parseInt(((calNode)childreen.get(0)).value)==Integer.parseInt(((calNode)childreen.get(2)).value)) || ((condtio)childreen.get(3)).execute();
				}
		 	}
		 case ">=":
			 if(operation=="and")
		 	return (Integer.parseInt( ((calNode)childreen.get(0)).value)>=Integer.parseInt(((calNode)childreen.get(2)).value))&& ((condtio)childreen.get(3)).execute();
			 else {return (Integer.parseInt( ((calNode)childreen.get(0)).value)>=Integer.parseInt(((calNode)childreen.get(2)).value))|| ((condtio)childreen.get(3)).execute();
				}
		 case "!=": if(operation=="and")return (Integer.parseInt( ((calNode)childreen.get(0)).value)!=Integer.parseInt(((calNode)childreen.get(2)).value))&& ((condtio)childreen.get(3)).execute();
		 else {return (Integer.parseInt( ((calNode)childreen.get(0)).value)!=Integer.parseInt(((calNode)childreen.get(2)).value))|| ((condtio)childreen.get(3)).execute();
			}
		 case "<=": if(operation=="and")return (Integer.parseInt( ((calNode)childreen.get(0)).value)<=Integer.parseInt(((calNode)childreen.get(2)).value))&& ((condtio)childreen.get(3)).execute();
		 else {return(Integer.parseInt( ((calNode)childreen.get(0)).value)<=Integer.parseInt(((calNode)childreen.get(2)).value))|| ((condtio)childreen.get(3)).execute();
		 }
		 case ">":if(operation=="and")return (Integer.parseInt( ((calNode)childreen.get(0)).value)>Integer.parseInt(((calNode)childreen.get(2)).value))&& ((condtio)childreen.get(3)).execute();
		 else return (Integer.parseInt( ((calNode)childreen.get(0)).value)>Integer.parseInt(((calNode)childreen.get(2)).value))|| ((condtio)childreen.get(3)).execute();
			
		 case "<":if(operation=="and")return (Integer.parseInt( ((calNode)childreen.get(0)).value)<Integer.parseInt(((calNode)childreen.get(2)).value))&& ((condtio)childreen.get(3)).execute();
		 else return (Integer.parseInt( ((calNode)childreen.get(0)).value)<Integer.parseInt(((calNode)childreen.get(2)).value))|| ((condtio)childreen.get(3)).execute();
			

		 default:break;
		 }}
		 if(((calNode)childreen.get(0)).kind==62 && ((calNode)childreen.get(2)).kind==62)	 {
		 switch (temp) {
		 case "==":{
			 if(operation=="and") {
		 if((((String)((calNode)childreen.get(0)).value).compareTo((String)((calNode)childreen.get(2)).value)==0) && ((condtio)childreen.get(3)).execute() )return true;
		 return	false;}else {
			 if((((String)((calNode)childreen.get(0)).value).compareTo((String)((calNode)childreen.get(2)).value)==0) || ((condtio)childreen.get(3)).execute() )return true;
			 return	false;
		 }
		 	}
		 case "!=":{ if(operation=="and") {
			 if((((String)((calNode)childreen.get(0)).value).compareTo((String)((calNode)childreen.get(2)).value)!=0) && ((condtio)childreen.get(3)).execute() )return true;
			 return	false;}else {
				 if((((String)((calNode)childreen.get(0)).value).compareTo((String)((calNode)childreen.get(2)).value)!=0) || ((condtio)childreen.get(3)).execute() )return true;
				 return	false;
			 }}



		 default:{
		 	return false;
		 	}
		 }}
		 if(((calNode)childreen.get(0)).kind==61 && ((calNode)childreen.get(2)).kind==61)	 {
		 switch (temp) {
		 case "==":{
			 if(operation=="and") return	(Double.parseDouble(((calNode)childreen.get(0)).value)==Double.parseDouble(((calNode)childreen.get(2)).value))&& ((condtio)childreen.get(3)).execute();
			 else	return	(Double.parseDouble(((calNode)childreen.get(0)).value)==Double.parseDouble(((calNode)childreen.get(2)).value))|| ((condtio)childreen.get(3)).execute();
				
		 }
		 case ">=":if(operation=="and")return (Double.parseDouble( ((calNode)childreen.get(0)).value)>=Double.parseDouble(((calNode)childreen.get(2)).value))&& ((condtio)childreen.get(3)).execute();
		 else return (Double.parseDouble( ((calNode)childreen.get(0)).value)>=Double.parseDouble(((calNode)childreen.get(2)).value))|| ((condtio)childreen.get(2)).execute();
			
		 case "!=":if(operation=="and")return (Double.parseDouble( ((calNode)childreen.get(0)).value)!=Double.parseDouble(((calNode)childreen.get(2)).value))&& ((condtio)childreen.get(3)).execute();
		 else return (Double.parseDouble( ((calNode)childreen.get(0)).value)!=Double.parseDouble(((calNode)childreen.get(2)).value))|| ((condtio)childreen.get(2)).execute();
			
		 case "<=":if(operation=="and")return (Double.parseDouble( ((calNode)childreen.get(0)).value)<=Double.parseDouble(((calNode)childreen.get(2)).value))&& ((condtio)childreen.get(3)).execute();
		 else return (Double.parseDouble( ((calNode)childreen.get(0)).value)<=Double.parseDouble(((calNode)childreen.get(2)).value))|| ((condtio)childreen.get(3)).execute();
			
		 case ">":if(operation=="and")return ( Double.parseDouble( ((calNode)childreen.get(0)).value)>Double.parseDouble(((calNode)childreen.get(2)).value))&& ((condtio)childreen.get(3)).execute();
		 else return ( Double.parseDouble( ((calNode)childreen.get(0)).value)>Double.parseDouble(((calNode)childreen.get(2)).value))|| ((condtio)childreen.get(3)).execute();
			
		 case "<":if(operation=="and")return ( Double.parseDouble( ((calNode)childreen.get(0)).value)<Double.parseDouble(((calNode)childreen.get(2)).value))&& ((condtio)childreen.get(3)).execute();

		 else return ( Double.parseDouble( ((calNode)childreen.get(0)).value)<Double.parseDouble(((calNode)childreen.get(2)).value))|| ((condtio)childreen.get(3)).execute();

			

		 default:{
		 	return false;
		 	}
		 }}
		 if((((calNode)childreen.get(0)).kind==37||((calNode)childreen.get(0)).kind==38) && (((calNode)childreen.get(2)).kind==37||((calNode)childreen.get(2)).kind==38))	 {
		 switch (temp) {
		 case "==":{
			 if(operation=="and") 
		 return	(((calNode)childreen.get(0)).value==((calNode)childreen.get(2)).value)&& ((condtio)childreen.get(3)).execute();
			 else return	(((calNode)childreen.get(0)).value==((calNode)childreen.get(2)).value)|| ((condtio)childreen.get(3)).execute();
				
				
		 	}
		 case "!=": if(operation=="and") 
			 return	(((calNode)childreen.get(0)).value!=((calNode)childreen.get(2)).value)&& ((condtio)childreen.get(3)).execute();
		 else return	(((calNode)childreen.get(0)).value!=((calNode)childreen.get(2)).value)|| ((condtio)childreen.get(3)).execute();
			



		 default:{
		 	return false;
		 	}
		 }}
	}
}
	return false;
}
}
