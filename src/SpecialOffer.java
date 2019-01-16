public class SpecialOffer {

    Product product;
    String offerDescription;
    String dataOd;
    String dataDo;
    float discount;

    public SpecialOffer(Product product, String offerDescription, String dataOd, String dataDo, float discount) {
        this.product = product;
        this.offerDescription = offerDescription;
        this.dataOd = dataOd;
        this.dataDo = dataDo;
        this.discount = discount;
    }
}
