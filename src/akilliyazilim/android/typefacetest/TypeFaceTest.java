package akilliyazilim.android.typefacetest;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.TextView;

public class TypeFaceTest extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_type_face_test);
		
		Typeface typeface_1 = Typeface.createFromAsset(getAssets(), "fonts/intrique.ttf");
		
		TextView textview_1 = (TextView) findViewById(R.id.textView1);
		
		textview_1.setTypeface(typeface_1);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.type_face_test, menu);
		return true;
	}

}
