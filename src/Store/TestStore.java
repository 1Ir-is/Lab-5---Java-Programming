package Store;

public class TestStore {
    public static void main(String[] args){
        WebStore myFirstStore= new WebStore("Amazon", "10.198.11.200",
                "React");
        Restaurant myRestaurant = new Restaurant("IriS",1000, 500000);
        System.out.println(myFirstStore);
        System.out.println(myRestaurant);
        System.out.printf("Tax is :%.0f ",myRestaurant.tax());
    }
}
