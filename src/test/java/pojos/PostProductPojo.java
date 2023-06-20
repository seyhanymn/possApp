package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PostProductPojo {
/*
"title": "televizyon",
        "img": "❤",
        "price": 444444,
        "category": "Elektronik",
 */

    private String title;
    private String img;
    private int price;
    private String category;

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

    public PostProductPojo() {
    }

    public PostProductPojo(String title, String img, int price, String category) {
        this.title = title;
        this.img = img;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "PostProductPojo{" +
                "title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", price='" + price + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
