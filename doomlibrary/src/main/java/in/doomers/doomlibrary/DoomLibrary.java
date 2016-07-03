package in.doomers.doomlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by doomers on 3/7/16.
 */
public class DoomLibrary {
    private static DoomLibrary ourInstance = new DoomLibrary();

    public static DoomLibrary getInstance() {
        return ourInstance;
    }

    private DoomLibrary() {


    }
    public void showdoom (Context context,String data){
        Toast.makeText(context, data, Toast.LENGTH_SHORT).show();
    }
}
