package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Arrays;


@JsonIgnoreProperties(ignoreUnknown = true)

public class PostBillPojo {

    /*  {
        "_id": "63a1657a99ca7f8f8bc096f9",
        "customerName": "Mustafa ÖRS",
        "customerPhoneNumber": "5445552233",
        "paymentMode": "Nakit",
        "subTotal": 40,
        "tax": 3.2,
        "totalAmount": 43.2,
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
            }, ],
        "createdAt": "2022-12-20T07:34:18.840Z",
        "updatedAt": "2022-12-20T07:34:18.840Z",
        "__v": 0
    },
     */

    private String customerName;
    private String customerPhoneNumber;
    private String paymentMode;
    private int subTotal;
    private int tax;
    private int totalAmount;
    private CardItemsPojo[] cartItems;

    public PostBillPojo(String customerName, String customerPhoneNumber, String paymentMode, int subTotal,
                        int tax, int totalAmount, CardItemsPojo []cartItems) {
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.paymentMode = paymentMode;
        this.subTotal = subTotal;
        this.tax = tax;
        this.totalAmount = totalAmount;
        this.cartItems = cartItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public CardItemsPojo[] getCartItems() {
        return cartItems;
    }

    public void setCartItems(CardItemsPojo[] cartItems) {
        this.cartItems = cartItems;
    }

    public PostBillPojo() {
    }




    @Override
    public String toString() {
        return "PostBillPojo{" +
                "customerName='" + customerName + '\'' +
                ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                ", paymentMode='" + paymentMode + '\'' +
                ", subTotal=" + subTotal +
                ", tax=" + tax +
                ", totalAmount=" + totalAmount +
                ", cartItems=" + Arrays.toString(cartItems) +
                '}';
    }
}
