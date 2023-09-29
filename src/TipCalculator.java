import java.util.ArrayList;
public class TipCalculator {
    int numPeople;
    int tipPercentage;
    double totalBillBeforeTip;
    ArrayList<String> items = new ArrayList<String>();
    ArrayList<Double> itemCosts = new ArrayList<Double>();

    public TipCalculator(int numPeople, int tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost, String meal) {
        totalBillBeforeTip += cost;
        itemCosts.add(cost);
        items.add(meal);
    }

    public double tipAmount() {
        //  returns the total tip amount added to the bill
        return (tipPercentage / 100.0) * totalBillBeforeTip;
    }

    public double totalBill() {
        // returns the group’s total bill including tip
        return totalBillBeforeTip + tipAmount();
    }

    public double perPersonCostBeforeTipping() {
        // returns the per-person cost before tip
        return totalBillBeforeTip / numPeople;
    }

    public double perPersonTipAmount() {
        // returns the per-person tip amount
        return tipAmount() / numPeople;
    }

    public double perPersonTotalCost() {
        // returns the total cost per person
        return totalBill() /numPeople;
    }
}
