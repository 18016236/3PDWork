package sg.edu.rp.c346.a3pdwork;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import sg.edu.rp.c346.a3pdwork.R;

public class CustomAdapter extends ArrayAdapter {
    int layout_id;
    ArrayList<Details>detailsArrayList;
    private TextView tvname;
   private TextView Contact;
    private TextView tvrate;
    private TextView tvspeciality;
    private TextView tvrecommendations;
    private ImageView pic;
    private Context context;

    public CustomAdapter(Context context, int resource, ArrayList<Details> objects) {
        super(context,resource,objects);
        detailsArrayList = objects;
        this.context = context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);


        Contact = (TextView) rowView.findViewById(R.id.textViewphoneNum);
        tvname = (TextView) rowView.findViewById(R.id.textViewName);
        tvrate = (TextView) rowView.findViewById(R.id.textviewrate);
        tvspeciality = (TextView) rowView.findViewById(R.id.textviewSpeciality);
        tvrecommendations = (TextView) rowView.findViewById(R.id.textViewRecommendations);

        pic = (ImageView) rowView.findViewById(R.id.imageView);


        Details currentDays = detailsArrayList.get(position);

        tvname.setText(currentDays.getName());
        Contact.setText(currentDays.getPhoneNum());
        tvrate.setText(currentDays.getRate());
        tvspeciality.setText(currentDays.getSpeciality());
        tvrecommendations.setText(currentDays.getRecommendations());
        pic.setImageResource(currentDays.getPic());

        return rowView;
    }
}
