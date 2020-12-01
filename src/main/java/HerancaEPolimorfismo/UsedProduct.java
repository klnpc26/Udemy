package HerancaEPolimorfismo;

import HerancaEPolimorfismo.Product;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private Date manufactureDate;

    public UsedProduct(Date manufactureDate, String name, Double price) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    @Override
    public String priceTag(){
        return getName() + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + sdf.format(manufactureDate)
                + ")";
    }
}
