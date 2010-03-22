package learn.now;

import java.util.Date;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter.ViewBinder;

public class Now extends Activity implements android.view.View.OnClickListener{
	Button btn;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		updateTime();
	}
	
	public void updateTime(){
		btn.setText(new Date().toString());
	}
}