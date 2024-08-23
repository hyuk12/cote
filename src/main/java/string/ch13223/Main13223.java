package string.ch13223;

import java.util.Scanner;

public class Main13223 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String currentTime = sc.next();
		String alarmTime = sc.next();

		String[] currentTimeArr = currentTime.split(":");
		String[] alarmTimeArr = alarmTime.split(":");

		int currentHour = Integer.parseInt(currentTimeArr[0]);
		int currentMinute = Integer.parseInt(currentTimeArr[1]);
		int currentSecond = Integer.parseInt(currentTimeArr[2]);

		int alarmHour = Integer.parseInt(alarmTimeArr[0]);
		int alarmMinute = Integer.parseInt(alarmTimeArr[1]);
		int alarmSecond = Integer.parseInt(alarmTimeArr[2]);

		int currentTotalSecond = currentHour * 3600 + currentMinute * 60 + currentSecond;
		int alarmTotalSecond = alarmHour * 3600 + alarmMinute * 60 + alarmSecond;
		int result = alarmTotalSecond - currentTotalSecond;

		if (result <= 0) {
			result += 24 * 3600;
		}

		int resultHour = result / 3600;
		int resultMinute = (result % 3600) / 60;
		int resultSecond = result % 60;

		System.out.printf("%02d:%02d:%02d", resultHour, resultMinute, resultSecond);
	}
}
