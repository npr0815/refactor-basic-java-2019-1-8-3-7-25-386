package practice3;

import java.math.BigDecimal;
import java.util.List;

public class Order {

    private List<OrderLineItem> orderLineItemList;
    private List<BigDecimal> discounts;
    private BigDecimal tax;
    private BigDecimal subTotal;

    public Order(List<OrderLineItem> orderLineItemList, List<BigDecimal> discounts) {
        this.orderLineItemList = orderLineItemList;
        this.discounts = discounts;
        this.tax = new BigDecimal(0.1);
    }

    public BigDecimal calculate() {
        subTotal = new BigDecimal(0);

        // Total up line items
        totalUpLineItems();

        // Subtract discounts
        subtractDiscounts();

        // calculate tax
        BigDecimal tax = calculateTax();

        // calculate GrandTotal
        BigDecimal grandTotal = calculateGrandTotal(tax);

        return grandTotal;
    }

    public void totalUpLineItems(){
        for (OrderLineItem lineItem : orderLineItemList) {
            subTotal = subTotal.add(lineItem.getPrice());
        }
    }

    public void subtractDiscounts(){
        for (BigDecimal discount : discounts) {
            subTotal = subTotal.subtract(discount);
        }
    }

    public BigDecimal calculateTax(){
        return subTotal.multiply(this.tax);
    }

    public BigDecimal calculateGrandTotal(BigDecimal tax){
        return subTotal.add(tax);
    }
}
