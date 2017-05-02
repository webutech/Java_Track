package myenum;

public enum Color {
	RED,GREEN,BLUE;
	
	public String toString() {
		return name()+":"+ordinal();
	}
}
