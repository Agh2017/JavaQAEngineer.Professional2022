package utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateFromCalendar {

  private final int month;
  private final int day;

  public DateFromCalendar(int month, int day) {
    this.month = month;
    this.day = day;
  }
  private int getMonth() {
    return month;
  }

  private int getDay() {
    return day;
  }

  public LocalDate getDate() {

    Calendar now = Calendar.getInstance();
    int currentMonth = now.get(Calendar.MONTH);
    int year = now.get(Calendar.YEAR);
    if (getMonth() < currentMonth) year = year+1;

    Calendar calendar = new GregorianCalendar(year, getMonth(), getDay());
    Date date = calendar.getTime();
    SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
    String inActiveDate = newFormat.format(date);
    return LocalDate.parse(inActiveDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
  }
}
