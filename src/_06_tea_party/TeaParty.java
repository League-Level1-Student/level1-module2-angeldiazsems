package _06_tea_party;

import javax.swing.JOptionPane;

public class TeaParty {
	
	public String welcome(String name, boolean isWoman, boolean isKnighted) {

	if(isWoman) {
		return "Hello Ms. "+name;
	}
	if(isWoman && isKnighted) {
			return  "Hello Lady "+name;
		
	}
	
	if(!isWoman) {
		return "Hello Mr. "+name;
	}
	if(!isWoman && isKnighted) {
			return  "Hello Sir "+name;
		
	}
	
	
	
	
	return null;

	
	}

}

