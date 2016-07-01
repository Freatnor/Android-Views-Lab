package ga.demo.viewslab;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * Created by Jonathan Taylor on 6/30/16.
 */
public class TestListActivity extends ListActivity {

    ListView listview;
    LayoutInflater mInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_test_list);

        listview = (ListView) findViewById(R.id.listview);
        mInflater = this.getLayoutInflater();

        for (int i = 0; i < 10; i++) {
            mInflater.inflate(R.layout.list_layout_piece, null);
        }



        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.id)


    }
}
