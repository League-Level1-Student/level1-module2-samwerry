package _07_tea_party;

public class TeaParty {
	 public String welcome(String name, boolean isWoman, boolean isKnighted) {
		 String meet = "Hello ";
			 
		 if(isWoman) {
			 
			 if(isKnighted) {
				meet+="Lady ";
			 }
			 else {
				 meet+= "Ms. ";
			 }
			 
		 }
		 else {
			 
			 if(isKnighted) {
				 meet+="Sir ";
			 }
			 
			 else {
				 meet+="Mr. ";
			 }
		 }
		 meet+=name;
		 
	        return meet;
	        
	 	}
}
