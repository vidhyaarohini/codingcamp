public class AnonymousInnerClass {
    public static void main(String[] args) {
        Employee employee = new Employee(){
            public void getPromotion(){
                System.out.println("promotion added");
            }
        };
        employee.getPromotion();
    }
}
