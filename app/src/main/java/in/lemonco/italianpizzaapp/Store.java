package in.lemonco.italianpizzaapp;

/**
 * Created by sanehyadav1 on 6/22/16.
 */
public class Store {
    private String name;
    private String address;
    private int imageResourceId;

    //pastas is an array of pasta
    public static final Store[] stores = {
            new Store("Dominos Chandigarh","SCO 215 \n Sector 35 \n Chandigarh",R.drawable.chandigarh_store),
            new Store("Dominos Delhi","SCO 233 \n Cannuaght Place \n Delhi 110021",R.drawable.delhi_store)
    };

    //Each pizza has a name, description and image resource
    private Store(String name, String address,int imageResourceId){
        this.name = name;
        this.address = address;
        this.imageResourceId = imageResourceId;
    }
    public String getaddress(){
        return address;
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
