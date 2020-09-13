class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		this(0, 0, 0);
	}
	public Time(int h, int m, int s) {
		setTime(h, m, s);
	}
	public void setTime(int h, int m, int s) {
		hour = ((h >= 0 && h < 24) ? h : 0);
		minute = ((m >= 0 && m < 60) ? m : 0);
		second = ((s >= 0 && s < 60) ? s : 0);
	}
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}

public class TimeTest {
	public static void main(String[] args) {
		Time time = new Time();
		System.out.println(time);
		Time time2 = new Time(13, 27, 06);
		System.out.println(time2);
		Time time3 = new Time(99, 66, 77);
		System.out.println(time3);
	}
}