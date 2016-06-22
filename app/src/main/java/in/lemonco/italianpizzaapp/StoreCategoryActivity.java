package in.lemonco.italianpizzaapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StoreCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView storeList = getListView();
        ArrayAdapter<Store> storeArrayAdapter = new ArrayAdapter<Store>(this,android.R.layout.simple_list_item_1,Store.stores);
        storeList.setAdapter(storeArrayAdapter);


    }

    @Override
    public void onListItemClick(ListView listView,View view,int position, long id){
        Intent intent = new Intent(StoreCategoryActivity.this,StoreActivity.class);
        intent.putExtra(StoreActivity.EXTRA_STORENO,(int)id);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_store_category, menu);
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
