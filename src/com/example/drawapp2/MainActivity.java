package com.example.drawapp2;

import org.w3c.dom.Text;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
       
	Context context;
     TextView textView;
     EditText editText;
     
     
     
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		context=this;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button1=(Button) findViewById(R.id.button1);

		TextView textview1=(TextView) findViewById(R.id.textView1);
		
		
		
		button1.setOnClickListener(new OnClickListener(){//タッチされるまで待機している
			
			@Override
			public void onClick(View v){
				Toast.makeText(context, "Touchされました",Toast.LENGTH_SHORT).show();
			}
		});
		/**Log.v("TAG","verbose");
		Log.d("TAG","verbose");
		Log.i("TAG","verbose");
		Log.w("TAG","verbose");
		Log.e("TAG","verbose");**/
		textView=(TextView)findViewById(R.id.textView2);
		editText=(EditText)findViewById(R.id.editText1);
		Button button2=(Button) findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				String text = editText.getText().toString();
				textView.setText(text);
			
			}
		});
	
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
