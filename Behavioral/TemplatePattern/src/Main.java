public class Main {
    public static void main(String[] args) {
        OnlineCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("-----");

        OnlineCourse pythonCourse = new PythonCourse();
        pythonCourse.createCourse();
    }
}
