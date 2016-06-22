package in.lemonco.italianpizzaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class StoreActivity extends AppCompatActivity {

    public static final String EXTRA_STORENO ="Store_No";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        int storeNo = (Integer)getIntent().getExtras().get(EXTRA_STORENO);
        Store store = Store.stores[storeNo];

        //Populate ImageView
        ImageView storeimage = (ImageView)findViewById(R.id.store_picture);
        storeimage.setImageResource(store.getImageResourceId());
        storeimage.setContentDescription(store.getName());

        //Populate Name
        TextView storeName = (TextView)findViewById(R.id.store_name);
        storeName.setText(store.getName());

        //Populate Address
        TextView storeAddress = (TextView)findViewById(R.id.store_address);
        storeAddress.setText(store.getaddress());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_store, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
