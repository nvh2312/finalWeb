/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author pv
 */
public class Courses {

    private int courseId;
    private String courseName;
    private String courseImage;
    private int fee;
    private int courseDuration;
    private String teacherName;
    private String courseDescription;
    private int category;

    public Courses() {
    }

    public Courses(int courseId, String courseName, String courseImage, int fee, int courseDuration, String teacherName, String courseDescription, int category) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseImage = courseImage;
        this.fee = fee;
        this.courseDuration = courseDuration;
        this.teacherName = teacherName;
        this.courseDescription = courseDescription;
        this.category = category;
    }
        public Courses( String courseName, String courseImage, int fee, int courseDuration, String teacherName, String courseDescription, int category) {
        this.courseName = courseName;
        this.courseImage = courseImage;
        this.fee = fee;
        this.courseDuration = courseDuration;
        this.teacherName = teacherName;
        this.courseDescription = courseDescription;
        this.category = category;
    }
    

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getCourseImage() {
        return courseImage;
    }

    public void setCourseImage(String courseImage) {
        this.courseImage = courseImage;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    @Override
    public String toString() {
        return "Courses{" + "courseId=" + courseId + ", courseName=" + courseName + ", courseImage=" + courseImage + ", fee=" + fee + ", courseDuration=" + courseDuration + ", teacherName=" + teacherName + ", courseDescription=" + courseDescription + ", category=" + category + '}';
    }
      
}
