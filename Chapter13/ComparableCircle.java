package Chapter13;

public class ComparableCircle extends Circle 
        implements Comparable<ComparableCircle>{

            @Override 
	public int compareTo(ComparableCircle circle2) {
		if (getArea() == circle2.getArea())
			return 1; 
        else return 0;
    }
}
