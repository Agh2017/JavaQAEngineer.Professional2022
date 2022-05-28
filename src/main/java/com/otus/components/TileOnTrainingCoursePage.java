package com.otus.components;

public class TileOnTrainingCoursePage {

  private final String nameCourse;
  private final int priceCourse;

  public TileOnTrainingCoursePage(String nameCourse, int priceCourse) {
    this.nameCourse = nameCourse;
    this.priceCourse = priceCourse;
  }

  public String getNameCourse() {
    return nameCourse;
  }

  public int getPriceCourse() {
    return priceCourse;
  }
}
