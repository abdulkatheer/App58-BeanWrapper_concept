package org.katheer.test;

import org.katheer.bean.Student;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        BeanWrapper beanWrapper = new BeanWrapperImpl(Student.class);
        //Setting properties of bean one by one
        beanWrapper.setPropertyValue("id", 101);
        beanWrapper.setPropertyValue("name", "Abdul Katheer");
        beanWrapper.setPropertyValue("addr", "Bangalore");

        //Getting property values
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Student Name    : " + beanWrapper.getPropertyValue("name"));
        System.out.println("Student ID      : " + beanWrapper.getPropertyValue("id"));
        System.out.println("Student Addr    : " + beanWrapper.getPropertyValue("addr"));
        System.out.println();

        //Setting properties all at once using map
        Map values = new HashMap();
        values.put("name", "Abdul");
        values.put("id", 102);
        values.put("addr", "Chennai");
        beanWrapper.setPropertyValues(values);

        //Getting bean instance
        Student student = (Student) beanWrapper.getWrappedInstance();
        student.getStudentDetails();
        System.out.println();

        //Checking whether a property is readable
        System.out.println("IsReadable");
        System.out.println("-----------");
        System.out.println("name    : " + beanWrapper.isReadableProperty(
                "name"));
        System.out.println("id      : " + beanWrapper.isReadableProperty(
                "id"));
        System.out.println("addr    : " + beanWrapper.isReadableProperty(
                "addr"));
        System.out.println();

        //Checking whether a property is writable
        System.out.println("IsWritable");
        System.out.println("-----------");
        System.out.println("name    : " + beanWrapper.isWritableProperty(
                "name"));
        System.out.println("id      : " + beanWrapper.isWritableProperty(
                "id"));
        System.out.println("addr    : " + beanWrapper.isWritableProperty(
                "addr"));
        System.out.println();

        //copying one bean to another
        Student student1 = new Student();
        BeanUtils.copyProperties("student", "student1");
        student.getStudentDetails();
        System.out.println();
        student1.getStudentDetails();
    }
}
