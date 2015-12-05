package com.example.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Toast.makeText(this, "onCreate実行", Toast.LENGTH_LONG).show();;
	}

	@Override
	protected void onStart() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStart();
		Toast.makeText(this, "onStart実行", Toast.LENGTH_LONG).show();;

	}
/*
	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		Toast.makeText(this, "onResume実行", Toast.LENGTH_LONG).show();;

	}

	@Override
	protected void onPause() {
		// TODO 自動生成されたメソッド・スタブ
		super.onPause();
		Toast.makeText(this, "onPause実行", Toast.LENGTH_LONG).show();;

	}

	@Override
	protected void onStop() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStop();
		Toast.makeText(this, "onStop実行", Toast.LENGTH_LONG).show();;

	}

	@Override
	protected void onRestart() {
		// TODO 自動生成されたメソッド・スタブ
		super.onRestart();
		Toast.makeText(this, "onRestart実行", Toast.LENGTH_LONG).show();;

	}

	@Override
	protected void onDestroy() {
		// TODO 自動生成されたメソッド・スタブ
		super.onDestroy();
		Toast.makeText(this, "onDestroy実行", Toast.LENGTH_LONG).show();;

	}
*/
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
