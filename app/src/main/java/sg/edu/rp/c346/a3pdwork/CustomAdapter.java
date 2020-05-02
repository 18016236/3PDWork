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
    private TextView tvrecommendations;
    private ImageView pic;
    private Context context;

    public CustomAdapter(Context context, int resource, ArrayList<Details> objects) {
        super(context,resource,objects);
        // Store the food that is passed to this adapter
        detailsArrayList = objects;
        // Store Context object as we would need to use it later
        this.context = context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);


        // Get the TextView object
        Contact = (TextView) rowView.findViewById(R.id.textViewphoneNum);
        tvname = (TextView) rowView.findViewById(R.id.textViewName);
        tvrate = (TextView) rowView.findViewById(R.id.textviewrate);
        tvrecommendations = (TextView) rowView.findViewById(R.id.textViewRecommendations);

        // Get the ImageView object
        pic = (ImageView) rowView.findViewById(R.id.imageView);

        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Details currentDays = detailsArrayList.get(position);
        // Set the TextView to show the food

        tvname.setText(currentDays.getName());
        Contact.setText(currentDays.getPhoneNum());
        tvrate.setText(currentDays.getRate());
        tvrecommendations.setText(currentDays.getRecommendations());
        pic.setImageResource(currentDays.getPic());

        // Return the nicely done up View to the ListView
        return rowView;
    }
}
