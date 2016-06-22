package in.lemonco.italianpizzaapp;

/**
 * Created by sanehyadav1 on 6/22/16.
 */
public class Pasta {
    private String name;
    private String description;
    private int imageResourceId;

    //pastas is an array of pasta
    public static final Pasta[] pastas = {
            new Pasta("Veg Pasta Italiano White","Penne Pasta tossed with extra virgin olive oil, exotic herbs & a generous helping of new flavoured sauce.",R.drawable.vegpasta_italiano_white),
            new Pasta("NON VEG PASTA ITALIANO WHITE","Penne Pasta tossed with extra virgin olive oil, exotic herbs & a generous helping of new flavoured sauce.",R.drawable.nonveg_pasta_italiano_white),
    };

    //Each pizza has a name, description and image resource
    private Pasta(String name, String description,int imageResourceId){
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
