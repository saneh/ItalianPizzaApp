package in.lemonco.italianpizzaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaActivity extends AppCompatActivity {

    public static final String EXTRA_PIZZANO="pizzaNo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
        //get pizza number from intent
        int pizzaNo = (Integer)getIntent().getExtras().get(EXTRA_PIZZANO);
        Pizza pizza = Pizza.pizzas[pizzaNo];

        //populate pizza image
        ImageView pizzaImage = (ImageView)findViewById(R.id.pizza_picture);
        pizzaImage.setImageResource(pizza.getImageResourceId());
        pizzaImage.setContentDescription(pizza.getName());

        //populate pizza name
        TextView pizzaName = (TextView)findViewById(R.id.pizza_name);
        pizzaName.setText(pizza.getName());

        //populate pizza description
        TextView pizzaDesc = (TextView)findViewById(R.id.pizza_description);
        pizzaDesc.setText(pizza.getDescription());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pizza, menu);
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
