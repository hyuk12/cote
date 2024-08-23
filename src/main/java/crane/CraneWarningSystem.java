package crane;

public class CraneWarningSystem {

	private double craneX;  // 크레인 중심의 x 좌표
	private double craneY;  // 크레인 중심의 y 좌표
	private double jibLength;  // 지브의 길이 (반지름)

	public CraneWarningSystem(double craneX, double craneY, double jibLength) {
		this.craneX = craneX;
		this.craneY = craneY;
		this.jibLength = jibLength;
	}

	public String checkProximity(double objectX, double objectY) {
		double distance = Math.sqrt(Math.pow(objectX - craneX, 2) + Math.pow(objectY - craneY, 2));

		if (distance <= jibLength + 1) {
			return "High alert! Object within 1 meter of crane's sweep!";
		} else if (distance <= jibLength + 2) {
			return "Medium alert! Object within 2 meters of crane's sweep.";
		} else if (distance <= jibLength + 3) {
			return "Low alert! Object within 3 meters of crane's sweep.";
		} else {
			return "No immediate danger. Object is safely outside the crane's sweep.";
		}
	}

	public static void main(String[] args) {
		CraneWarningSystem crane = new CraneWarningSystem(0, 0, 10);  // 크레인 중심 (0,0), 지브 길이 10m
		System.out.println(crane.checkProximity(12, 0));  // 물체의 위치 (12,0)
		System.out.println(crane.checkProximity(13, 0));  // 물체의 위치 (13,0)
		System.out.println(crane.checkProximity(14, 0));  // 물체의 위치 (14,0)
	}
}
