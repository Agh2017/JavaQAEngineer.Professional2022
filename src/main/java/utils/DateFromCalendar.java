package utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateFromCalendar {

  private int month;
  private int day;
  private int year = 0;

  public DateFromCalendar(int month, int day) {
    this.month = month;
    this.day = day;
  }

  public DateFromCalendar(int month, int day, int year) {
    this.month = month - 1;
    this.day = day;
    this.year = year;
  }

  public LocalDate getDate() {

    Calendar now = GregorianCalendar.getInstance();

    int currentMonth = now.get(Calendar.MONTH);
    if (year == 0) {
      year = now.get(Calendar.YEAR);
      if (month < currentMonth) year = year + 1;
    }

    Calendar calendar = new GregorianCalendar(year, month, day);
    Date date = calendar.getTime();
    SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
    String inActiveDate = newFormat.format(date);

    return LocalDate.parse(inActiveDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
  }
}