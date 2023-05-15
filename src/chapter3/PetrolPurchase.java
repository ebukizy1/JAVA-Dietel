package chapter3;

            public class PetrolPurchase {
                private String stationLocation;
                private String  petrolType;
                private int quantityLiterPurchase;
                private double pricePerLiters;
                 private double percentageDiscount;


             public PetrolPurchase(String stationLocation, String petrolType, int quantityLiterPurchase,
                 double pricePerLiters, double percentageDiscountDouble) {
                 this.stationLocation = stationLocation;
                this.petrolType = petrolType;
                this.quantityLiterPurchase = quantityLiterPurchase;
                this.pricePerLiters = pricePerLiters;
                this.percentageDiscount = percentageDiscountDouble;
    }
            public String getStationLocation() {
                 return stationLocation;
    }
            public void setStationLocation(String stationLocation) {
              this.stationLocation = stationLocation;
    }
            public String getPetrolType() {
               return petrolType;
    }
            public void setPetrolType(String petrolType) {
               this.petrolType = petrolType;
    }
            public int getQuantityPurchaseLiters() {
                 return quantityLiterPurchase;
    }
            public void setQuantityPurchaseLiters(int quantityLiterPurchase) {
                if(quantityLiterPurchase<=0)quantityLiterPurchase=0;
                this.quantityLiterPurchase = quantityLiterPurchase;
    }
            public double getPricePerLiters() {
                return pricePerLiters;
    }
            public void setPricePerLiters(double pricePerLiters) {
                 if(pricePerLiters<=0)pricePerLiters = 0;
                this.pricePerLiters = pricePerLiters;
    }
            public double getPercentageDiscount() {
                 return percentageDiscount;
    }
           public void setPercentageDiscount(double percentageDiscount) {
                  if(percentageDiscount<=0)percentageDiscount= 0;
                  this.percentageDiscount = percentageDiscount;
    }
              public double getPurchaseAmountTest(){
                  quantityLiterPurchase *=pricePerLiters;
                  quantityLiterPurchase-=(percentageDiscount/100);
                    return quantityLiterPurchase;
              }
}




