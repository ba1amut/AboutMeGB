package com.speedsumm.bu.aboutmegb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;
    Toast myToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePageAdapter(getSupportFragmentManager());
        mPager.setPageTransformer(true, new ZoomOutPageTransformer());
        mPager.setAdapter(mPagerAdapter);
    }
        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            getMenuInflater().inflate(R.menu.main, menu);
            return true;

        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            switch (item.getItemId()) {
                case R.id.menuMain:
                    showToast(getResources().getString(R.string.tab2name));
                    Intent intent = new Intent(this,SecondActivity.class);
                    startActivity(intent);
                    break;
                case R.id.menuSkills:
                    showToast("SKILLS");
                    break;
                case R.id.menuCont:
                    showToast("CONTACTS");
                    break;
//                case R.id.DatePicker:
//                    DatePickFragment datePickFragment = new DatePickFragment();
//                    datePickFragment.show(getSupportFragmentManager(), "DATA_PICKER");
//                    showToast("Date instead the name");
//                    break;
            }
            return super.onOptionsItemSelected(item);
        }

    private void showToast(String main) {
        if (myToast != null) {
            myToast.cancel();
        }
        myToast = Toast.makeText(this, main, Toast.LENGTH_LONG);
        myToast.show();


    }

}

