package de.uni_hamburg.informatik.mci.lCalendar;



import de.uni_hamburg.informatik.mci.lcalendar2013.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.BaseAdapter;
import android.widget.Button;

public class GridcellOfMonthAdapter extends BaseAdapter implements OnClickListener{

	
	
	private final String[] months = { "January", "February", "March",
			"April", "May", "June", "July", "August", "September",
			"October", "November", "December" };
	
	private Button buttonMonth;
	private final Context context; 


	public GridcellOfMonthAdapter(Context context, int textViewResourceId, int month){
		this.context =context; 
		printMonthName(month); 
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView; 
		if (row == null) {
			LayoutInflater inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.gridcell_of_month_name, parent, false);
			buttonMonth = (Button) row.findViewById(R.id.calendar_day_gridcell); 
			buttonMonth.setOnClickListener(this); 
		}
		return null;
	} 
	
	private String printMonthName(int month){
		String nameMonth = months[month]; 
		return nameMonth; 
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	

}
