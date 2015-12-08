package uottawa.mcomm.restaurant;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
 
public class Restaurant_Menu extends ListActivity {
 
 String[] itemname ={
 "Cake",
 "French Fries",
 "HamBurger",
 "Pizza"
 };
 Integer[] price={10,3,5,12};
 Integer[] imgid={
		 R.drawable.cake,
		 R.drawable.frenchfries,
		 R.drawable.hamburger,
		 R.drawable.pizza,
		 };
 protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 
	 MenuAdapter adapter=new MenuAdapter(this, itemname, imgid,price);
	 setListAdapter(adapter);
	 }
	 public void onListItemClick(ListView lv ,View view,int position,int imgid) {
	 
	 String Slecteditem= (String)getListAdapter().getItem(position);
	 Toast.makeText(this, Slecteditem, Toast.LENGTH_SHORT).show();
	 }
	 
	}