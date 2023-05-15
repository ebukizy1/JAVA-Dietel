package testdriller;

public class TestDriller {
    private int price;

    public int priceOfBooks(int quantity) {
        if (quantity >= 1 && quantity <= 4) {
            price = quantity * 2000;
            return price;
        } else if (quantity >= 4 && quantity <= 9) {
            price = quantity * 1800;
            return price;
        } else if (quantity >= 10 && quantity <= 29) {
            price = quantity * 1600;
            return price;
        } else if (quantity >= 30 && quantity <= 49) {
            price = quantity * 1500;
            return price;
        } else if (quantity >= 50 && quantity <= 99) {
            price = quantity * 1300;
            return price;
        } else if (quantity >= 100 && quantity <= 199) {
            price = quantity * 1200;
            return price;
        } else if (quantity >= 200 && quantity <= 499) {
            price = quantity * 1100;
            return price;
        } else if (quantity >= 500) {
            price = quantity * 1000;
        }
        return price;
    }
}



