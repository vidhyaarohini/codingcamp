public class Market {
    public static void main(String[] args) {
        Shop shop = new Shop() {
            @Override
            public void getMessage() {
                System.out.println("anonymous interface class");
            }
        };
        shop.getMessage();
    }
}
