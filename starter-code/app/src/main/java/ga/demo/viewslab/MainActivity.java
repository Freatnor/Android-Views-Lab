package ga.demo.viewslab;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<LinearLayout> layouts;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layouts = new ArrayList<>();

        LinearLayout layout1 = (LinearLayout)findViewById(R.id.layout1);
        LinearLayout layout2 = (LinearLayout)findViewById(R.id.layout2);
        LinearLayout layout3 = (LinearLayout)findViewById(R.id.layout3);
        LinearLayout layout4 = (LinearLayout)findViewById(R.id.layout4);
        LinearLayout layout5 = (LinearLayout)findViewById(R.id.layout5);
        LinearLayout layout6 = (LinearLayout)findViewById(R.id.layout6);
        LinearLayout layout7 = (LinearLayout)findViewById(R.id.layout7);
        LinearLayout layout8 = (LinearLayout)findViewById(R.id.layout8);
        LinearLayout layout9 = (LinearLayout)findViewById(R.id.layout9);
        LinearLayout layout10 = (LinearLayout)findViewById(R.id.layout10);

        layouts.add(layout1);
        layouts.add(layout2);
        layouts.add(layout3);
        layouts.add(layout4);
        layouts.add(layout5);
        layouts.add(layout6);
        layouts.add(layout7);
        layouts.add(layout8);
        layouts.add(layout9);
        layouts.add(layout10);



        View.OnClickListener ocl = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int hintVal = Integer.parseInt(((Button) view).getHint().toString());
                int previousText = hintVal - 1;
                Toast.makeText(view.getContext(), getString(R.string.toastText) + " " + previousText + " and " + hintVal, Toast.LENGTH_SHORT).show();
            }
        };

        int i = 1;

        for (LinearLayout layout : layouts) {

            TextView tempTextView1 = new TextView(this);
            tempTextView1.setText("This is TextView number " + i);
            i++;
            tempTextView1.setTextSize(26);
            tempTextView1.setTypeface(null, Typeface.BOLD);
            layout.addView(tempTextView1);

            TextView tempTextView2 = new TextView(this);
            tempTextView2.setText("This is TextView number " + i);

            tempTextView2.setTextSize(22);
            tempTextView2.setTypeface(null, Typeface.ITALIC);
            layout.addView(tempTextView2);

            Button tempButton1 = new Button(this);
            tempButton1.setText("Button");
            tempButton1.setHint("" + i);
            i++;
            tempButton1.setOnClickListener(ocl);
            layout.addView(tempButton1);
        }


        //Put your Java code in here

    }
}
