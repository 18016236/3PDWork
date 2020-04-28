package sg.edu.rp.c346.a3pdwork;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import sg.edu.rp.c346.a3pdwork.R;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Details>detailsArrayList;

    public CustomAdapter (Context context, int resource, ArrayList<Details> objects){
        super(context,resource,objects);
        parent_context = context;
        layout_id = resource;
        detailsArrayList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvPhone = rowView.findViewById(R.id.textViewphoneNum);
        TextView tvRate = rowView.findViewById(R.id.textviewrate);
        TextView tvRecommendations = rowView.findViewById(R.id.textViewRecommendations);

        Details currentItem = detailsArrayList.get(position);
        tvName.setText(currentItem.getName());
        tvPhone.setText(currentItem.getPhoneNum());
        tvRate.setText(currentItem.getRate());
        tvRecommendations.setText(currentItem.getRecommendations());

        return rowView;
    }
}
