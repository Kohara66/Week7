package com.happy;

public class ITECCourseManager {

    public static void main(String args[]) {

        ITECCourse maintenanceCourse =
                new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);

        //Add some students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse =
                new ITECCourse("Data Communications", 1425, 30);

        //Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();



    }

}

