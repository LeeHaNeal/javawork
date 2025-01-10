package _05_ex;


public class Dog extends Pet {
    
	 public Dog() {
	        this("비글", "흰색", "지랄견");
	    }

	    public Dog(String kind, String color, String feature) {
	        super(kind, color, feature);
	    }

	    @Override
	    public void sound() {
	        System.out.println("울음소리 : 멍멍");
	    }
	}
