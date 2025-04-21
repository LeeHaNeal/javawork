package _05_ex;


public class Cat extends Pet {
    
	
	    public Cat() {
	        this("고양이", "검정", "귀여움"); 
	    }

	   
	    public Cat(String kind, String color, String feature) {
	        super(kind, color, feature); 
	    }

	   
	    @Override
	    public void sound() {
	        System.out.println("울음소리 : 야옹");
	    }
	}