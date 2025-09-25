public class JavaCourse extends OnlineCourse {
    @Override
    void prepareContent() {
        System.out.println("Preparing Java content...");
    }

    @Override
    void deliverCourse() {
        System.out.println("Delivering Java course videos...");
    }

    @Override
    void conductExam() {
        System.out.println("Conducting Java online exam...");
    }
}
