package com.example.btntest;

public class Globals {
	public static Globals instance = null;
	private String list_1;
	private String list_2;
	
	/* page_twenty_eight */
	private String list_3;
	private String list_4;
	
	/* page_thiry */
	private String thirty_personName1;
	private String thirty_personName2;
	private String thirty_personName3;
	private String thirty_personNumber1;
	private String thirty_personNumber2;
	private String thirty_personNumber3;
	
	private String Do1;
	private String Do2;
	
	private String thirty_five_personName1;
	private String thirty_five_personName2;
	private String thirty_five_personName3;
	private String thirty_five_personNumber1;
	private String thirty_five_personNumber2;
	private String thirty_five_personNumber3;

	public void setDo1(String Do1){
		
		this.Do1 = Do1;
		
	}
	public void setDo2(String Do2){
		
		this.Do2 = Do2;
		
	}
	
	public String getDo1(){
		return this.Do1;
	}
	
	public String getDo2(){
		return this.Do2;
	}
	
	public void setList_1(String str) {
		this.list_1 = str;
	}

	public void setList_2(String str) {
		this.list_2 = str;
	}
	
	public void setList_3(String str) {			// page_twenty_eight
		this.list_3 = str;
	}
	
	public void setList_4(String str) {			// page_twenty_eight
		this.list_4 = str;
	}

	public String getList_1() {
		return this.list_1;
	}

	public String getList_2() {
		return this.list_2;
	}
	
	public String getList_3() {					// page_twenty_eight
		return this.list_3;
	}
	
	public String getList_4() {					// page_twenty_eight
		return this.list_4;
	}
	
	public void setPersonName2(String name1, String name2, String name3){
		
		this.thirty_five_personName1 = name1;
		this.thirty_five_personName2 = name2;
		this.thirty_five_personName3 = name3;
		
	}
	
	public void setPersonNumber2(String number1, String number2, String number3){
		
		this.thirty_five_personNumber1 = number1;
		this.thirty_five_personNumber2 = number2;
		this.thirty_five_personNumber3 = number3;
	}
	
	public String getPersonName1_1(){
		
		return thirty_five_personName1;
		
	}
	
	public String getPersonName2_2(){
		
		return thirty_five_personName2;
		
	}
	
	public String getPersonName3_3(){
		
		return thirty_five_personName3;
		
	}
	
	public String getPersonNumber1_1(){
		
		return thirty_five_personNumber1;
	}
	
	public String getPersonNumber2_2(){
		
		return thirty_five_personNumber2;
	}
	
	public String getPersonNumber3_3(){
		
		return thirty_five_personNumber3;
	}
	
	public void setPersonName(String name1, String name2, String name3){
		
		this.thirty_personName1 = name1;
		this.thirty_personName2 = name2;
		this.thirty_personName3 = name3;
		
	}
	
	public void setPersonNumber(String number1, String number2, String number3){
		
		this.thirty_personNumber1 = number1;
		this.thirty_personNumber2 = number2;
		this.thirty_personNumber3 = number3;
	}
	
	public String getPersonName1(){
		
		thirty_personName1 += " ";
		thirty_personName1 += thirty_personNumber1;
		
		return this.thirty_personName1;
	}
	
	public String getPersonName2(){
		
		thirty_personName2 += " ";
		thirty_personName2 += thirty_personNumber2;
		
		return this.thirty_personName2;
	}
	
	public String getPersonName3(){
		
		thirty_personName3 += " ";
		thirty_personName3 += thirty_personNumber3;
		
		return this.thirty_personName3;
	}

	public static synchronized Globals getInstance() {
		if (null == instance) {
			instance = new Globals();
		}
		return instance;
	}

}
