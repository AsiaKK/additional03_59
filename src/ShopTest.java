public class ShopTest {
    public static void main(String[] args) {

        Category nabial = new Category("A", "description for category A");
        Category slodycze = new Category("B", "description for category B");

        Product mleko = new Product("mleko", "mleko w proszku", 2.36, nabial);
        Product serek = new Product("serek", "serek light", 2.2, nabial);
        Product czekolada = new Product("czekolada", "czekolada gorzka", 4.0, slodycze);
        Product napoj = new Product("napoj", "napoj pomaranczowy", 3.0, null);

        SpecialOffer serkiDlaWszystkich = new SpecialOffer(serek, "serki dla wszystkich", "2019-01-15", "2019-01-31", 0.2f);

        System.out.println("Information about products: ");
        System.out.println(mleko.name + "," + mleko.description + ", price: " + mleko.price + ", category: " + mleko.category.name);
        System.out.println(czekolada.name + "," + czekolada.description + ", price: " + czekolada.price + ", category: " + czekolada.category.name);
        System.out.println(napoj.name + "," + napoj.description + ", price: " + napoj.price + ", category: " + napoj.category);
        System.out.println(serek.name + "," + serek.description + ", price: " + serek.price + ", category: " + serek.category.name);

    }

}