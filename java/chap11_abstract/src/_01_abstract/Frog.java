package _01_abstract;


public class Frog extends Pet {
 
	 public Frog() {
	        this("개구리", "초록", "징그러움");
	    }

	    public Frog(String kind, String color, String feature) {
	        super(kind, color, feature);
	    }

	    @Override
	    public void sound() {
	        System.out.println("울음소리 : 개굴개굴");
	    }
	}