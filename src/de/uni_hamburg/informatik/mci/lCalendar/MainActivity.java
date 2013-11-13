package de.uni_hamburg.informatik.mci.lCalendar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.uni_hamburg.informatik.mci.lcalendar2013.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnItemClickListener {

	public static final String[] dayname = new String[] { "Mo", "Di", "Mi",
			"Do", "Fr", "Sa", "So" };

	

	public static final Integer[] dayOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31,
			30, 31, 30, 31 };
	public final String[] NameOfMonth = new String[] { "Januar", "Februar",
			"Marz", "April", "Mai", "Juni", "Juli", "August", "September",
			"Oktober", "November", "Dezember" };

	ListView listview;
	List<DayItem> dayItem;
	private TextView textView; 
	int currentday = 11;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.month_view);
		dayItem = new ArrayList<DayItem>();
		for (int i = 1; i <= getdayofMonth(currentday); i++) {
			DayItem item = new DayItem(getdayName(i), i);
			dayItem.add(item);
		}

		listview = (ListView) findViewById(R.id.list);
		textView = (TextView) findViewById(R.id.Name_month); 
		ErsteAdapter adapter = new ErsteAdapter(this, dayItem);
		listview.setAdapter(adapter);
		listview.setOnItemClickListener(this);
		textView.setText(getNameOfMonth(11));

	}

	private int getdayofMonth(int i) {
		
		List list ;  
		list= Arrays.asList(dayOfMonth);
		int a = (Integer) list.get(i); 
		return (Integer) list.get(i); 
	}

	private String getdayName(int i) {
		List list; 
		list= Arrays.asList(dayname);
		String a; 
		if ((i % 7) == 0) {
			a= (String) list.get(i % 7);
			return a; 
		} else {
			a = (String) list.get((i % 7) - 1);
			return a;
		}
	}
	
	private String getNameOfMonth(int i){
		return NameOfMonth[i]; 
	}

	// private List<String> getdayNameforAllTable(int k ){
	//
	// List<String>liste = new ArrayList<String>();
	// for(int i = 1; i<= getZahldayOfMonth().size(); i++){
	// k = i % 7;
	// liste.add(getdayName(k));
	// }
	// return liste;
	//
	// }

	// private List<Integer>getZahldayOfMonth(){
	// List<Integer> dayNumber = new ArrayList<Integer>() ;
	// for(int i = 1; i<=getdayofMonth(currentday); i++){
	// dayNumber.add(i);
	// }
	// return dayNumber;
	// }

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub

	}

}
