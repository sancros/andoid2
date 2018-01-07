package suprunenko.andoid2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements StartUpFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        //setContentView(R.layout.activity_main);

        StartUpFragment fragment = new StartUpFragment();

            //TokenFragment tt = new
        //     transaction.replace(android.R.id.content, fragment );
     
         setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        FragmentManager manager = getFragmentManager();
        android.app.FragmentTransaction transaction = manager.beginTransaction();

        //setContentView(R.layout.activity_main);

        StartUpFragment fragment = new StartUpFragment();

        //TokenFragment tt = new
      //  transaction.replace(android.R.id.content, fragment );
    }
}
