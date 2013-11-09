package de.uni_hamburg.informatik.lCalendar;

import java.util.ArrayList;

import de.uni_hamburg.informatik.mci.lcalendar2013.R;

import android.content.ClipData.Item;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class ersteAdapter extends ArrayAdapter<Item> implements OnClickListener {

	ArrayList<Item > data = new ArrayList<Item>(); 
	private Context context;
	private Button gridcell;
	private int layoutRessourceId; 

	
	public ersteAdapter(Context context, int textViewId, ArrayList<Item> data){
		super(context, textViewId, data); 
		this.context = context; 
		this.layoutRessourceId = textViewId; 
		this.data = data; 
		
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		cellCalendar cell = null; 
		LayoutInflater inflate = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		row = inflate.inflate(R.layout.gridcell, parent, false);
		
		cell = new cellCalendar(); 
		cell.text = (TextView) row.findViewById(R.id.num_events_per_day);
		cell.button = (Button) row.findViewById(R.id.calendar_day_gridcell); 
		Item item = data.get(position); 
		cell.text.setText(item.getText());
		

		return row;
	}

	@Override
	public void onClick(View v) {

	}
	
//	private String getWeekAsString(int i){
//		return dayNumber[i]; 
//	}
//	
	static class cellCalendar{
		Button button; 
		TextView text; 
	}

}
