package com.designpattern.iteratorpattern.course;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public interface ICourseAggregate {

    boolean add(Course course);

    boolean remove(Course course);

    Iterator<Course> iterator();
}
