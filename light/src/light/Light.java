package light;
// 어서와 자바는 처음이지 예제 문제 light.java p.65
public class Light {
	public static void main(String arg[]) {
		long lightspeed;
		long distance;
		
		lightspeed = 300000;
		distance = lightspeed * 365L * 24 * 60 * 60;

		System.out.println("빛이 1년 동안 가는 거리: " + distance + "km.");
	}
}
