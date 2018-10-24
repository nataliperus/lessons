public class DaysToWeekend {
    public String getDaysToEndOfWeek(int day) {
        String rezult = "";
        final String[] dayList = {"Воскресенье", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота"};
        for (int k = day; k < dayList.length; k++) {
            rezult += dayList[k] + " , ";
        }
        rezult += dayList[0];
        return rezult;
    }
}
