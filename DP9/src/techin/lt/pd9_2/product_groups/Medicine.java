package techin.lt.pd9_2.product_groups;

import techin.lt.pd9_2.product_groups.AbstractProduct;

public class Medicine extends AbstractProduct {

    private static final double VAT= 1.05;

    public Medicine(String name, double price, double discount) {
        super(name, price, discount);
    }

    @Override
    public double getPriceWithVat() {
        return Math.round((this.getPrice() * VAT)*100)/100.0;
    }


}

