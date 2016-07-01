import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import ga.demo.viewslab.R;

/**
 * Created by Jonathan Taylor on 6/30/16.
 */
public class ListItemView extends RelativeLayout {

    private TextView tv1;
    private TextView tv2;
    private Button mButton;

    public ListItemView(Context context) {
        super(context);

    }

    public static ListItemView inflate(ViewGroup parent) {
        ListItemView ListItemView = (ListItemView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_test_list, parent, false);
        return ListItemView;
    }
}
