package net.canaydogan.fontawesomeandroid;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface font = Typeface.createFromAsset( getAssets(), "fontawesome-webfont.ttf" );
        Button button = (Button)findViewById( R.id.button );
        button.setTypeface(font);
    }

}
