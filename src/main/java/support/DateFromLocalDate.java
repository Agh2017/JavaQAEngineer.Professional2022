package support;

import java.time.LocalDate;

public class DateFromLocalDate {

  private int month;
  private int day;
  private int year = 0;

  public DateFromLocalDate(int month, int day) {
    this.month = month;
    this.day = day;
  }

  public DateFromLocalDate(int month, int day, int year) {
    this.month = month-1;
    this.day = day;
    this.year = year;
  }

  public LocalDate getDate() {

    LocalDate now = LocalDate.now();

    int currentMonth = now.getMonthValue();
    if (year==0) {
      year = now.getYear();
      if (month < currentMonth) year = year+1;
    }
    return LocalDate.of(year, month+1, day);
  }
}
