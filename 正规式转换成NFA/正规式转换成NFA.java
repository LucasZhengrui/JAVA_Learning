	private static void judgeBracket(String inputR) {
		String t = inputR;	
	    for(int i = 0;i < inputR.length();i++) {
	    	if(leftsum > 0) {
		        char ch = inputR.charAt(i);
		        switch (ch)
		        {
		            case '(':
		            {
		            	buffstack1.push(i);
		                break;
		            }
		            case ')':
		            {
		            	ts = 0;
		            	if(i != inputR.length()-1) {
		            		char ch2 = inputR.charAt(i+1);
		        	        if(ch2 == '*') {
		        	        	char ch3 = (char) buffstack3.peek();
		        	        	String str3 = ch3 + "*";
		        	        	buffstack3.pop();
		        	        	buffstack3.push(str3);
		        	        	ts = 1;
		        	        }
		            	}
		            	int startId = (int) buffstack1.pop();
		            	int endId = i;
		            	String str = "";
		            	for(int j = startId+1;j < endId;j++) {
		        	        char ch1 = t.charAt(j);
		        	        buffstack3.pop();
		        	        str += ch1;
		        	        
		            	}
		            	if(ts == 1) {
		            		str = "(" + str +")*";
		            		buffstack2.push(str);
		            	}
		            	else if(str.indexOf("|")!=-1) {
		            		buffstack2.push(str);
		            	}
		            	else {
		            		for(int j = endId-1;j > 0;j--) {
			        	        char ch1 = t.charAt(j);
			        	        buffstack2.push(ch1);
		            		}
		            	}
		            	leftsum--;
		            	String t1 = "";
		            	for(int j = 0;j < startId;j++) {
		        	        char ch1 = t.charAt(j);
		        	        t1 += ch1;
		            	}
		            	int t2 = 1;
		            	for(int j = endId+1;j < t.length();j++) {
		        	        char ch1 = t.charAt(j);
		        	        if(ch1 == '*' && t2 ==1) {
		        	        	t2 = 0;
		        	        }
		        	        t1 += ch1;
		            	}
		            	t = t1;
		            	if(t != "") {
		            		judgeBracket(t);
		            	}
		            	else {
		            		break;
		            	}
		            	break;
		            }
		            default:
		            {
		            	buffstack3.push(ch);
		                break;
		            }
		        }
	    	}
		}
	}

	private static void judgeStar() {
		Object[] result = buffstack2.toArray();
	    for(int i = 0;i < result.length-1; i++) {
	    	
	    	String str = "";
	    	str += result[i];
	    	starsum = 0;
	    	for(int k = 0;k < str.length();k++) {
		        char ch = str.charAt(k);
		        if(ch == '*') {
		        	starsum++;
		        }
	    	}
	    	if(str.indexOf("*")!=-1) { 		
            	if(str.indexOf(")")!=-1) {
        	        buffstack3.push(str);
            	}
            	else {
	    		String str1 = "";
	    		for(int j = 0;j < str.length();j++) {
	    			char ch = str.charAt(j);
	    			if(ch != '*') {
	    				buffstack3.push(ch);
	    				str1 = ch + "";
	    			}
	    			else {
	    				starsum--;
	    				buffstack3.pop();
	    				str1 += ch;
	    				buffstack3.push(str1);
	    				str1 = "";
	    			}
	    		}
	    		buffstack2.pop();
	    		}
	    	}
	    	else {
	    		buffstack2.pop();
	    		buffstack3.push(str);
	    	}
	    }
	}
