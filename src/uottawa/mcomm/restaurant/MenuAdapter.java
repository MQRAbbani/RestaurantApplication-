package uottawa.mcomm.restaurant;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
 
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
 

 
public class MenuAdapter extends ArrayAdapter<String> {
	 
	 private final Activity context;
	 private final String[] itemname;
	 private final Integer[] imgid;
	 private final Integer[] prices;
	 
	 public MenuAdapter(Activity context, String[] itemname, Integer[] imgid, Integer[] prices) {
	 super(context, R.layout.menu_items, itemname);
	 // TODO Auto-generated constructor stub
	 
	 this.context=context;
	 this.itemname=itemname;
	 this.imgid=imgid;
	 this.prices=prices;
	 }
	 
	 public View getView(int position,View view,ViewGroup parent) {
	 LayoutInflater inflater=context.getLayoutInflater();
	 View rowView=inflater.inflate(R.layout.menu_items, null,true);
	 
	 TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
	 ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
	 TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);
	 
	 txtTitle.setText(itemname[position]);
	 imageView.setImageResource(imgid[position]);
	 extratxt.setText("Price :$"+String.valueOf(prices[position])+" CAN");
	 return rowView;
	 
	 };
	}
