package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CardItemsPojo {

    /*
    "cartItems": [
            {
                "_id": "639cb4494432218d2ccd697a",
                "title": "Cep Telefonu",
                "img": "https://tasova.gen.tr/wp-content/uploads/2020/05/teknoloji-cesitleri.jpg",
                "price": 30,
                "category": "Teknoloji",
                "createdAt": "2022-12-16T18:09:13.237Z",
                "updatedAt": "2022-12-18T18:41:05.425Z",
                "__v": 0,
                "quantity": 1
            },
     */

    private String title;
    private String img;
    private int price;
    private String category;
    private int quantity;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CardItemsPojo() {
    }

    public CardItemsPojo(String title, String img, int price, String category, int quantity) {
        this.title = title;
        this.img = img;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CardItemsPojo{" +
                "title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
