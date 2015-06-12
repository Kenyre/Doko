package nl.uva.kite.Doko;

import android.app.ActionBar;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;


public class SelectFriend extends Fragment {
    private LinearLayout linLayout;
    //private FragmentActivity fragActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        //fragActivity = super.getActivity();

        linLayout = (LinearLayout) inflater.inflate(R.layout.activity_select_friend, container, false);
        //setContentView(R.layout.activity_select_friend);
        Friends.get_friendlist(OnJSONCompleted.SELECTFRIEND, getActivity());

        if (Friends.friends == null) {
            Log.e("", "FKDAJFKLADJ;FKAJDLFKJDKLFJ");
            return linLayout;
        }
        return linLayout;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        // Inflate the menu; this adds items to the action bar if it is present.
        inflater.inflate(R.menu.menu_select_friend, menu);
        //return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
