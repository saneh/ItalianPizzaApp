package in.lemonco.italianpizzaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class PastaActivity extends AppCompatActivity {

    public static final String EXTRA_PASTANO="PastaNo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta);
        //get pasta number from intent
        int pastaNo = (Integer)getIntent().getExtras().get(EXTRA_PASTANO);
        Pasta pasta = Pasta.pastas[pastaNo];

        //populate pasta image
        ImageView pastaImage = (ImageView)findViewById(R.id.pasta_picture);
        pastaImage.setImageResource(pasta.getImageResourceId());
        pastaImage.setContentDescription(pasta.getName());

        //populate pizza name
        TextView pastaName = (TextView)findViewById(R.id.pasta_name);
        pastaName.setText(pasta.getName());

        //populate pizza description
        TextView pastaDesc = (TextView)findViewById(R.id.pasta_description);
        pastaDesc.setText(pasta.getDescription());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pasta, menu);
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
