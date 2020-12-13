package com.designpattern.iteratorpattern.course;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public class CourseAggregateImpl implements ICourseAggregate {

    private List<Course> list = new ArrayList<>();

    @Override
    public boolean add(Course course) {
        return list.add(course);
    }

    @Override
    public boolean remove(Course course) {
        return list.remove(course);
    }

    @Override
    public Iterator<Course> iterator() {
        return new IteratorImpl<>(list);
    }
}
