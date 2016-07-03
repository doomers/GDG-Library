package in.doomers.librarygdg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import in.doomers.doomlibrary.DoomLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DoomLibrary.getInstance().showdoom(this,"rahul");
    }
}
