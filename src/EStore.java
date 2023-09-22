import java.util.List;

enum CardType {
    MASTER_CARD, VISA_CARD, VERVE, AMERICAN_EXPRESS
}

enum ProductCategory {
    ELECTRONICS, GROCERIES, UTENSILS, CLOTHING
}

class Address {
    private String city;
    private String country;
    private String houseNumber;
    private String street;
    private String state;
}

class CreditCard {
    private CardType cardType;
    private String cardNumber;
    private String nameOnCard;
    private int expirationYear;
    private int expirationMonth;
    private int cvv;
}

class Product {
    private int productId;
    private String productName;
    private double price;
    private String description;
    private ProductCategory category;
}

class Item {
    private int quantity;
    private Product product;
}

class ShoppingCart {
    private List<Item> items;
}

class BillingInformation {
    private String receiverPhone;
    private String receiverName;
    private Address deliveryAddress;
    private CreditCard creditCard;
}

class User {
    private String age;
    private String email;
    private Address homeAddress;
    private String name;
    private String password;
    private String phone;
}

class Customer extends User {
    private List<BillingInformation> billingInformationList;
    private ShoppingCart shoppingCart;
}

class Seller extends User {
}

class Admin extends User {
}

public class EStore {
    public static void main(String[] args) {
    }
}
