public class RunBusinessInterface {
    public static void main(String[] args) {
        BusinessImpl business = new BusinessImpl();
        business.profit(new Business() {
            @Override
            public void profit() {
                System.out.println("interface implementation in mehtod argument");
            }
        });
    }
}
