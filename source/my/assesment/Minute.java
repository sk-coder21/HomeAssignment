package my.assesment;

public class Minute {
	public static void main(String[]args){
	int minuteInput=3456789;
	int minute=60;
	int day=24*minute;
	int years=day*365;
	int result=minuteInput/years;
	int year6=3153600;
	int remainingMinute=minuteInput-year6;
	int remainingDays=remainingMinute/day;
	System.out.println(minuteInput + " minute is approximately:"+ (result) +" years "+ + remainingDays +" days ");//variable+string+variable
	

}
}