package in.lemonco.italianpizzaapp;

/**
 * Created by sanehyadav1 on 6/22/16.
 */
public class Pizza {
    private String name;
    private String description;
    private int imageResourceId;

    //pizzaz is an array of pizza
    public static final Pizza[] pizzas = {
            new Pizza("Farmhouse","A pizza that goes ballistic on veggies! Check out this mouth watering overload of crunchy, crisp capsicum, succulent mushrooms and fresh tomatoes",R.drawable.farmhouse),
            new Pizza("Margherita","A hugely popular margherita, with a deliciously tangy single cheese topping",R.drawable.margherita),
            new Pizza("Country Special","For all those with a partiality for veggies, this one's loaded - crunchy onions, crisp capsicum and fresh juicy tomatoes. Yum!",R.drawable.countryspecial),
            new Pizza("VEG EXTRAVAGANZA","A pizza that decidedly staggers under an overload of golden corn, exotic black olives, crunchy onions, crisp capsicum, succulent mushrooms, juicyfresh tomatoes and jalapeno - with extra cheese to go all around.",R.drawable.veg_extravaganza)
    };

    //Each pizza has a name, description and image resource
    private Pizza(String name, String description,int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public String toString(){
        return this.name;
    }

}
