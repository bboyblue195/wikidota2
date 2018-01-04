package lib;

public class FormatDate {
	public String formatDate(String date){
		String dateformat ="";
		String[]alstr = date.split("");
		String datef ="";
		String hh="";
		for(int i=0; i<10;i++){
			datef +=alstr[i];
		}
		String [] aldatef = datef.split("") ;
		for(int i=11; i<alstr.length;i++){
			hh +=alstr[i];
		}
		String t="";
		for(int i=aldatef.length-1; i>=0 ; i--){
				if("/".equals(aldatef[i])){
					String reverse = new StringBuffer(t).
					reverse().toString();
					dateformat= dateformat+ reverse+"/";
					t="";
				}else{
					t+=aldatef[i];
				}
		}
		String reverse = new StringBuffer(t).
		reverse().toString();
		dateformat = dateformat+reverse+" "+hh;
		return dateformat;
	}
	
}
