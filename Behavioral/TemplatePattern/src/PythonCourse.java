public class PythonCourse extends OnlineCourse {
    @Override
    void prepareContent() {
        System.out.println("Preparing Python content...");
    }

    @Override
    void deliverCourse() {
        System.out.println("Delivering Python course videos...");
    }

    @Override
    void conductExam() {
        System.out.println("Conducting Python online exam...");
    }

    @Override
    boolean hasAssignment() {
        return false; // No assignment for Python course
    }
}
