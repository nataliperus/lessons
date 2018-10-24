import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {0,2,5,220,221,77,500,13,300,6,500,7};
        int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        DaysToWeekend daysToWeekend = new DaysToWeekend();
        System.out.println("Count of numbers is in a range = "+ MyMath.myMath(2,222,numbers));
        if (day==Calendar.SATURDAY){
            System.out.println("Последний день");
        }
        else {
            System.out.println("До конца недели осталось: "+ daysToWeekend.getDaysToEndOfWeek(day));
        }
    }
}
