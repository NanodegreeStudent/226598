package com.equest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class instructions_activity extends Activity {

	Button btn_start;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.instructions);

		
		btn_start=(Button) findViewById(R.id.btn_start_test);
		btn_start.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent(instructions_activity.this, Questions_Activity.class);
				startActivity(intent);
				
				finish();

			}
		});
		
		

	}

}
