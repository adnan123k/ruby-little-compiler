package nodes;

import java.io.IOException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class calNode extends treeNode{
	String value="";
public int kind;
	public Object execute() throws ScriptException, IOException{
		
	try {	
		int currentkind=((doublenode)childreen.get(0)).kind;

if(((doublenode)childreen.get(0)).q==57) {
	((doublenode)childreen.get(0)).execute();
currentkind=treeNode.types.get(((doublenode)childreen.get(0)).varname);

	
}
	if(	currentkind==-1) {

		return false;
	}
	if(currentkind==36) {
		((doublenode)childreen.get(0)).execute();
		currentkind=((doublenode)childreen.get(0)).kind;

	}
	 if(currentkind==62) {
	
		String temp="";
		for(int i=0;i<childreen.size();i++) {
			if(((doublenode)childreen.get(i)).kind==33) {
				((doublenode)childreen.get(i)).execute();
			

			}
			if(((doublenode)childreen.get(i)).kind==-1)return false;
			String temp2[]=temp.split("\\#\\{");
			while(temp2.length>1) {
				String temp3[]=temp2[1].split("\\}");
				if(treeNode.vars.containsKey(temp3[0])) {
				
				temp=	temp2[0]+treeNode.vars.get(temp3[0])+temp.substring(temp.indexOf('}')+1, temp.length());	
				}
				else {
					temp=	temp2[0]+""+temp.substring(temp.indexOf('}')+1, temp.length());
					
				}
				temp2=temp.split("\\#\\{");
			}
			
		String o=	(String)((doublenode)childreen.get(i)).execute();

		if( o=="-"||o=="*"|| o=="/" ||o=="%/") {
	
			
						return false;
		}if(o!="+")
			temp=temp+o;
		temp2=temp.split("\\#\\{");
		while(temp2.length>1) {
			String temp3[]=temp2[1].split("\\}");
			if(treeNode.vars.containsKey(temp3[0])) {
			
			temp=	temp2[0]+treeNode.vars.get(temp3[0])+temp.substring(temp.indexOf('}')+1, temp.length());	
			}
			else {
				temp=	temp2[0]+""+temp.substring(temp.indexOf('}')+1, temp.length());
				
			}
			temp2=temp.split("\\#\\{");
		}

		}

	value=temp.replaceAll("\"", "");
		kind=62;
	
		return temp.replaceAll("\"", "");
		
	}
	else if(currentkind==37 ||currentkind==38) {
		if(childreen.size()>1) {

			return false;
		}
		if(currentkind==37) {
			kind=37;
			value="true";
	return true;}
		if(currentkind==38) {
			kind=38;
			value="false";
	return false;}
	}
	else if(currentkind==61) {
		kind=61;
		String temp="";
		for(int i=0;i<childreen.size();i++) {
			if(((doublenode)childreen.get(i)).kind==36) {
				((doublenode)childreen.get(i)).execute();
			

			}
			if(((doublenode)childreen.get(i)).kind==-1)return false;
			if(((doublenode)childreen.get(i)).kind==62 || ((doublenode)childreen.get(i)).kind==37 ||  ((doublenode)childreen.get(i)).kind==38  )return false;
		
			temp=temp+(String)((doublenode)childreen.get(i)).execute();}
		
		
value=Double.toString(eval(temp));
	
	return eval(temp);
	}
	else {
		String temp="";
		int highestkind=60;

		for(int i=0;i<childreen.size();i++) {
			if(((doublenode)childreen.get(i)).kind==36) {
				((doublenode)childreen.get(i)).execute();
			

			}
			if(((doublenode)childreen.get(i)).kind==-1)return false;
			if(((doublenode)childreen.get(i)).kind==62 || ((doublenode)childreen.get(i)).kind==38 ||  ((doublenode)childreen.get(i)).kind==37  )return false;
			if(((doublenode)childreen.get(i)).kind==61 && ((doublenode)childreen.get(i)).value!="+" && ((doublenode)childreen.get(i)).value!="*" && ((doublenode)childreen.get(i)).value!="/" && ((doublenode)childreen.get(i)).value!="-" && ((doublenode)childreen.get(i)).value!="%") {
				
				highestkind=61;}
			temp=temp+(String)((doublenode)childreen.get(i)).execute();}

		kind=highestkind;

		if(kind==60) {
			value=Integer.toString(((int)eval(temp)));
		
		return (int)eval(temp);}
		else {
			value=Double.toString(eval(temp));
			return eval(temp);}}}catch(Exception e) {}
		return true;
	}
	
	public Object execut(String n) throws ScriptException, IOException{
		
	try {	
		int currentkind=((doublenode)childreen.get(0)).kind;

if(((doublenode)childreen.get(0)).q==57) {
	((doublenode)childreen.get(0)).execute();
currentkind=treeNode.types.get(((doublenode)childreen.get(0)).varname);

	
}
	if(	currentkind==-1) {

		return false;
	}
	if(currentkind==36) {
		((doublenode)childreen.get(0)).execute();
		currentkind=((doublenode)childreen.get(0)).kind;

	}
	 if(currentkind==62) {
	
		String temp=n;
		for(int i=0;i<childreen.size();i++) {
			if(((doublenode)childreen.get(i)).kind==33) {
				((doublenode)childreen.get(i)).execute();
			

			}
			if(((doublenode)childreen.get(i)).kind==-1)return false;
			
			String temp2[]=temp.split("\\#\\{");
			while(temp2.length>1) {
				String temp3[]=temp2[1].split("\\}");
				if(treeNode.vars.containsKey(temp3[0])) {
				
				temp=	temp2[0]+treeNode.vars.get(temp3[0])+temp.substring(temp.indexOf('}')+1, temp.length());	
				}
				else {
					temp=	temp2[0]+""+temp.substring(temp.indexOf('}')+1, temp.length());
					
				}
				temp2=temp.split("\\#\\{");
			}
		String o=	(String)((doublenode)childreen.get(i)).execute();

		if( o=="-"||o=="*"|| o=="/" ||o=="%/") {
	
			
						return false;
		}if(o!="+")
			temp=temp+o;
		 temp2=temp.split("\\#\\{");
		while(temp2.length>1) {
			String temp3[]=temp2[1].split("\\}");
			if(treeNode.vars.containsKey(temp3[0])) {
			
			temp=	temp2[0]+treeNode.vars.get(temp3[0])+temp.substring(temp.indexOf('}')+1, temp.length());	
			}
			else {
				temp=	temp2[0]+""+temp.substring(temp.indexOf('}')+1, temp.length());
				
			}
			temp2=temp.split("\\#\\{");
		}

		}

	value=temp.replaceAll("\"", "");
		kind=62;
	
		return temp.replaceAll("\"", "");
		
	}
	else if(currentkind==37 ||currentkind==38) {
		if(childreen.size()>1) {

			return false;
		}
		if(currentkind==37) {
			kind=37;
			value="true";
	return true;}
		if(currentkind==38) {
			kind=38;
			value="false";
	return false;}
	}
	else if(currentkind==61) {
		kind=61;
		String temp=n;
		for(int i=0;i<childreen.size();i++) {
			if(((doublenode)childreen.get(i)).kind==36) {
				((doublenode)childreen.get(i)).execute();
			

			}
			if(((doublenode)childreen.get(i)).kind==-1)return false;
			if(((doublenode)childreen.get(i)).kind==62 || ((doublenode)childreen.get(i)).kind==37 ||  ((doublenode)childreen.get(i)).kind==38  )return false;
		
			temp=temp+(String)((doublenode)childreen.get(i)).execute();}
		

value=Double.toString(eval(temp));
	
	return eval(temp);
	}
	else {
	
		String temp=n;
	
		int highestkind=60;

		for(int i=0;i<childreen.size();i++) {
			if(((doublenode)childreen.get(i)).kind==36) {
				((doublenode)childreen.get(i)).execute();
			

			}
			if(((doublenode)childreen.get(i)).kind==-1)return false;
			if(((doublenode)childreen.get(i)).kind==62 || ((doublenode)childreen.get(i)).kind==38 ||  ((doublenode)childreen.get(i)).kind==37  )return false;
		if(((doublenode)childreen.get(i)).kind==61 && ((doublenode)childreen.get(i)).value!="+" && ((doublenode)childreen.get(i)).value!="*" && ((doublenode)childreen.get(i)).value!="/" && ((doublenode)childreen.get(i)).value!="-" && ((doublenode)childreen.get(i)).value!="%") {
			
			highestkind=61;}
			temp=temp+(String)((doublenode)childreen.get(i)).execute();}
	
		kind=highestkind;

		if(kind==60) {

			value=Integer.toString(((int)eval(temp)));
		
		return (int)eval(temp);}
		else {
			value=Double.toString(eval(temp));
			return eval(temp);}}}catch(Exception e) {}
		return true;
	}
	
	public static double eval(final String str) {
	    return new Object() {
	        int pos = -1, ch;

	        void nextChar() {
	            ch = (++pos < str.length()) ? str.charAt(pos) : -1;
	        }

	        boolean eat(int charToEat) {
	            while (ch == ' ') nextChar();
	            if (ch == charToEat) {
	                nextChar();
	                return true;
	            }
	            return false;
	        }

	        double parse() {
	            nextChar();
	            double x = parseExpression();
	            if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
	            return x;
	        }

	        // Grammar:
	        // expression = term | expression `+` term | expression `-` term
	        // term = factor | term `*` factor | term `/` factor
	        // factor = `+` factor | `-` factor | `(` expression `)`
	        //        | number | functionName factor | factor `^` factor

	        double parseExpression() {
	            double x = parseTerm();
	            for (;;) {
	                if      (eat('+')) x += parseTerm(); // addition
	                else if (eat('-')) x -= parseTerm(); // subtraction
	                else return x;
	            }
	        }

	        double parseTerm() {
	            double x = parseFactor();
	            for (;;) {
	                if      (eat('*')) x *= parseFactor(); // multiplication
	                else if (eat('/')) x /= parseFactor(); // division
	                else return x;
	            }
	        }

	        double parseFactor() {
	            if (eat('+')) return parseFactor(); // unary plus
	            if (eat('-')) return -parseFactor(); // unary minus

	            double x;
	            int startPos = this.pos;
	            if (eat('(')) { // parentheses
	                x = parseExpression();
	                eat(')');
	            } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
	                while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
	                x = Double.parseDouble(str.substring(startPos, this.pos));
	            } else if (ch >= 'a' && ch <= 'z') { // functions
	                while (ch >= 'a' && ch <= 'z') nextChar();
	                String func = str.substring(startPos, this.pos);
	                x = parseFactor();
	                if (func.equals("sqrt")) x = Math.sqrt(x);
	                else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
	                else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
	                else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
	                else throw new RuntimeException("Unknown function: " + func);
	            } else {
	                throw new RuntimeException("Unexpected: " + (char)ch);
	            }

	            if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

	            return x;
	        }
	    }.parse();
	}
}



