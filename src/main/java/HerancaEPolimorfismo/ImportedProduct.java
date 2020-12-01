package HerancaEPolimorfismo;

import HerancaEPolimorfismo.Product;

public class ImportedProduct extends Product{
    
    private double customsFee;

    public ImportedProduct(double customsFee, String name, double price) {
        super(name, price);
        this.customsFee = customsFee;
    }


    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    public Double totalPrice(){
        return super.getPrice() + customsFee;
    }
    
    @Override
    public final String priceTag(){
        return getName() + " $ " + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", customsFee)
                + ")";
    }
}
