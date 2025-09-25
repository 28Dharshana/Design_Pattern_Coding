public abstract class OnlineCourse {
    // Template method
    public final void createCourse() {
        prepareContent();
        deliverCourse();
        if (hasAssignment()) {
            addAssignment();
        }
        conductExam();
    }

    abstract void prepareContent();
    abstract void deliverCourse();
    abstract void conductExam();

    // Hook method
    boolean hasAssignment() {
        return true;
    }

    void addAssignment() {
        System.out.println("Adding default assignment...");
    }
}
