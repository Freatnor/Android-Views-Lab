import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by Jonathan Taylor on 6/30/16.
 */
public class TestListViewAdapter extends ArrayAdapter<ListItem> {


    public TestListViewAdapter(Context context, List<ListItem> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListItemView itemView = (ListItemView)convertView;
        if (null == itemView)
            itemView = ListItemView.inflate(parent);
        itemView.setItem(getItem(position));
        return itemView;
    }


}
