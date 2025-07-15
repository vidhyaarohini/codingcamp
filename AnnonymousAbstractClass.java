public class AnnonymousAbstractClass {
    public static void main(String[] args) {
        Student student = new Student() {
            @Override
            public void getMarks() {
                System.out.println("student marks");
            }
        };
        student.getMarks();
    }
}
