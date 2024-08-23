package crane;

public class Main {
	private double x;
	private double y;
	private double encoderCountPerMeter = 10;  // 10 회전당 1미터

	public Main(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void updatePosition(int encoderCounts, double angleDegrees) {
		double distance = encoderCounts / encoderCountPerMeter;
		double angleRadians = Math.toRadians(angleDegrees);

		// 새로운 좌표 계산
		this.x += distance * Math.cos(angleRadians);
		this.y += distance * Math.sin(angleRadians);
	}

	@Override
	public String toString() {
		return String.format("Crane's current position: (%.2f, %.2f)", x, y);
	}

	public static void main(String[] args) {
		Main crane = new Main(0, 0);
		crane.updatePosition(50, 30);
		System.out.println(crane);
	}
}
