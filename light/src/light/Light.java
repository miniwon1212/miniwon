package light;

public class Light {
	public static void main(String arg[]) {
		long lightspeed;
		long distance;
		
		lightspeed = 300000;
		distance = lightspeed * 365L * 24 * 60 * 60;
		
		System.out.println("���� 1�� ���� ���� �Ÿ�: " + distance + "km.");
	}
}
