package Store;

public class Restaurant extends Store{
    public int servPeople;
    public double pricePeople;
    public Restaurant(String name){super(name);}
    public Restaurant(String name, int servPeople, double pricePeople){
        super(name);
        this.servPeople = servPeople;
        this.pricePeople = pricePeople;
    }
    public int getServPeople() {return servPeople;}
    public void setServPeople(int servPeople) {this.servPeople = servPeople;}
    public double getPricePeople() {return pricePeople;}
    public void setPricePeople(double pricePeople) {this.pricePeople = pricePeople;}
    @Override
    public String toString() {
        return "Restaurant - Name = " + getName()+
                ", People are served every year =" + servPeople +
                ", the average price per person =" + pricePeople +
                " ";
    }
    public double tax(){return servPeople * pricePeople * SALESJAXJATE;}
}
