package PetrolPurchase;//Create a class called PetrolPurchase.PetrolPurchase to represent information about the petrol you purchase.
// The class should include five pieces of information in the form of instance variables—the station’s
// location (type String), the type of petrol (type String), the quantity (type int) of the purchase
// in liters, the price per liter (double), and the percentage discount
//(double). Your class should have a constructor that initializes the five instance variables. Provide a
//set and a get method for each instance variable. In addition, provide a method named getPurchase-
//Amount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
//minus the discount, then returns the net amount you had to pay as a double value. Write an application
// class named Petrol that demonstrates the capabilities of class PetrolPurchase.PetrolPurchase.

class PetrolPurchase {
private String location;
private String petrolType;
private int quantityPerLiter;
private double pricePerLiter;
private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String petrolType, int quantityInLiters,
                          double pricePerLiter, double discountPercentage) {
        this.location = stationLocation;
        this.petrolType = petrolType;
        this.quantityPerLiter = quantityInLiters;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = discountPercentage;
    }

    public String getStationLocation() {
        return location;
    }

    public void setStationLocation(String stationLocation) {
        this.location = stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantityInLiters() {
        return quantityPerLiter;
    }

    public void setQuantityInLiters(int quantityInLiters) {
        this.quantityPerLiter = quantityInLiters;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getDiscountPercentage() {
        return percentageDiscount;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.percentageDiscount = discountPercentage;
    }

    public double getPurchaseAmount() {
        double grossAmount = quantityPerLiter * pricePerLiter;
        double discountAmount = (percentageDiscount / 100) * grossAmount;
        return grossAmount - discountAmount;
    }
}

public class PetrolPurchase {
    public static void main(String[] args) {
        PetrolPurchase purchase = new PetrolPurchase("Station A", "Regular", 50, 2.5, 10);

        System.out.println("Petrol Station: " + purchase.getStationLocation());
        System.out.println("Petrol Type: " + purchase.getPetrolType());
        System.out.println("Quantity: " + purchase.getQuantityInLiters() + " liters");
        System.out.println("Price per Liter: $" + purchase.getPricePerLiter());
        System.out.println("Discount Percentage: " + purchase.getDiscountPercentage() + "%");
        System.out.println("Net Purchase Amount: $" + purchase.getPurchaseAmount());
    }
}