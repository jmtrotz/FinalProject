package objectMapping;

// Generated Nov 4, 2017 5:04:48 PM by Hibernate Tools 4.3.1
public class Classes {

    private String courseID;
    private String title;

    public Classes() {

    }

    public Classes(String courseID, String title) {
        this.courseID = courseID;
        this.title = title;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
