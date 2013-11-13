package de.uni_hamburg.informatik.mci.lCalendar;

import java.util.ArrayList;
import java.util.List;

import de.uni_hamburg.informatik.mci.lcalendar2013.R;

import android.app.Activity;
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

public class ErsteAdapter extends BaseAdapter{
	Context context; 
	List<DayItem> dayItem; 


	
	public ErsteAdapter(Context context, List<DayItem> item){
		this.context = context; 
		this.dayItem = item; 
	}
	
	
	private class ViewDay{
		TextView nameDay; 
		TextView nummerDay; 
	}
	
	@Override
	public int getCount() {
		return dayItem.size();
	}

	@Override
	public Object getItem(int position) {
		return dayItem.get(position);
	}

	@Override
	public long getItemId(int position) {
		return dayItem.indexOf(getItem(position));
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewDay day = null; 
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		if(convertView == null) {
			convertView = inflater.inflate(R.layout.day_view, null); 
			day = new ViewDay(); 
			day.nameDay = (TextView) convertView.findViewById(R.id.week_day); 
			day.nummerDay = (TextView) convertView.findViewById(R.id.month_day);
			DayItem dayItem = (DayItem) getItem(position);
			day.nameDay.setText(dayItem.getWeekName()); 
			day.nummerDay.setText(String.valueOf(dayItem.getDayNummer())); 
		}else{
			day = (ViewDay) convertView.getTag();
		}
		
		return convertView;
	} 
	
	}