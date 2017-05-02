import myenum.Color;

public class EnumTest {

	public static void main(String[] args) {
		Color[] colors=Color.values();
		for (Color color : colors) {
			System.out.println(color);
		}
	}
}
