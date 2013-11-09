package de.uni_hamburg.informatik.lCalendar;

import java.util.ArrayList;

import org.apache.http.impl.entity.LaxContentLengthStrategy;

import de.uni_hamburg.informatik.mci.lcalendar2013.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.ClipData.Item;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends Activity {

	private GridView calendarView;
	private ersteAdapter adapter;
	
	ArrayList<Item> gridArray = new ArrayList<Item>();
	private String[] month = new String[] { "Januar", "Februar", "Marz",
			"April", "Mai", "juni", "Juli", "August", "September", "Oktober",
			"November", "Dezember" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calendar_layout);
//		TableRow [] tr = new TableRow[12];
//		TextView []textview = new TextView[12];
//		for(int i = 1; i<=month.length;i++){
////			tr[i].setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
//			tr[i].addView(new TableRow(this)); 
//			textview[i].setText(month[i]); 
//			textview[i].setTextColor(Color.BLUE); 
////			tr[i].addView(textview);
//		}
		
		calendarView = (GridView) findViewById(R.id.calendar);
		Button button = (Button) findViewById(R.id.calendar_day_gridcell);
		gridArray.add(new Item("1"));
		gridArray.add(new Item("2"));
		gridArray.add(new Item("3"));
		gridArray.add(new Item("4"));
		gridArray.add(new Item("5"));
		gridArray.add(new Item("6"));
		gridArray.add(new Item("7"));
		gridArray.add(new Item("8"));
		gridArray.add(new Item("9"));
		adapter = new ersteAdapter(this, R.layout.gridcell, gridArray);
		calendarView.setAdapter(adapter);
	}

}
