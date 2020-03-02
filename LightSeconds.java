class LightSeconds {
	public static void main(String args[]) {
		
		long lightSecond, lightMinute, lightHour, lightDay, lightYear;
		lightSecond = 299_792_458;
		lightMinute = lightSecond * 60;
		lightHour = lightMinute * 60;
		lightDay = lightHour * 24;
		lightYear = lightDay * 365;
		
	System.out.println(lightYear);
	}
}