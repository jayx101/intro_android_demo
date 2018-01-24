package codepath.apps.demointroandroid;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnKeyListener;
import android.view.View;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

public class BasicViewsActivity extends Activity {
    private EditText editText1;
    private TextWatcher text = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_basic_views);

        editText1 = (EditText) findViewById(R.id.editText1);

        }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_basic_views, menu);
		return true;
	}

    public void buttonClick(View view){

        //code here will be executed when button is touched or clicked
        Log.d("myTag", "This is my message");
    }


}

