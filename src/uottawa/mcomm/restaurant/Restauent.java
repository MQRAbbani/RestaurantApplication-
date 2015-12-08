package uottawa.mcomm.restaurant;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Restauent extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_restauent);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		//return true;
	MenuInflater mif =getMenuInflater();
	mif.inflate(R.menu.main_activity_action, menu);
	return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		Log.v("Restaurant",String.valueOf(id));
		if (id == R.id.search_icon) {
			menu_activity();
			return true;
		}
		if (id == R.id.contact_detail) {
			contact_detail();
			return true;
		}
		if (id == R.id.login_detail) {
			login_detail();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void menu_activity(){
		 //Toast.makeText(this, "Search Selected", Toast.LENGTH_SHORT).show();
		 Intent intent = new Intent(this, Restaurant_Menu.class);
		    startActivity(intent);
	}
	public void contact_detail(){
		Intent intent = new Intent(this, about.class);
	    startActivity(intent);
	}
	public void login_detail(){
		 Intent intent = new Intent(this, user_login.class);
		    startActivity(intent);
	}
	
}
