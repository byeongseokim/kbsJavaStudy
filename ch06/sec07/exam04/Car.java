package ch06.sec07.exam04;

public class Car {
			//필드 선언
		String company = "현대자동차";
		String model;
		String color;
		int maxSpeed;
		
		//생성자 선언
	    public Car() {}
	    
	    public Car(String model) {
	    	this.model = model;
	   	}
	    public Car(String model, String color) {
	        this.model = model;
	        this.color = color;
	    }
	    public Car(String model, String color, int maxSpeed) {
	    	this.model = model;
	    	this.color = color;
	    	this.maxSpeed = maxSpeed;
	    }


	}


