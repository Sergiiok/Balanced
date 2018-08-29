package model;

import java.util.Stack;

public class Balanced {
	
	
	
	
	public String isBalacend(String p) {
		boolean balanced=false;
		
		Stack pi= new Stack();
		
		if(p!=null) {
		for (int i = 0; i < p.length(); i++) {
			
			char s=p.charAt(i);
			if(s=='{') {
				pi.push(p.charAt(i));
			}else if(s=='['){
				pi.push(p.charAt(i));
			}else if(s=='('){
				pi.push(p.charAt(i));
			}
			
		if(!pi.isEmpty()) {	
			
		if((s=='}')) {
			
			if((char)pi.pop()=='{') {
				balanced=true;
			}}else if(s==']') {
				if((char)pi.pop()=='[') {
					balanced=true;
				}
			}else if(s==')') {
				if((char)pi.pop()=='(') {
					balanced=true;
				}
			}
			
		}
		
		
		
		}
		
			
		}	
		if(pi.isEmpty()) {
			return ""+ balanced ;
		}else {
			return ""+ false ;
		}
			
		
		
		
	
	}

}
