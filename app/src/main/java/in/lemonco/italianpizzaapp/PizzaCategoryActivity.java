package in.lemonco.italianpizzaapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PizzaCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listPizza = getListView();
        ArrayAdapter<Pizza> listAdapter = new ArrayAdapter<Pizza>(this,android.R.layout.simple_list_item_1,Pizza.pizzas);
        listPizza.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView,View itemView,int position,long id){
        Intent intent = new Intent(PizzaCategoryActivity.this,PizzaActivity.class);
        intent.putExtra(PizzaActivity.EXTRA_PIZZANO,(int)id);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pizza_category, menu);
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
