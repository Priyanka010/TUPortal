package com.tuportal.example.tuportal;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;


public class MainActivity extends AppCompatActivity implements BaseSliderView.OnSliderClickListener,ViewPager.OnPageChangeListener {
    SliderLayout mDemoSlider;
    private CoordinatorLayout coordinatorLayout;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    ImageView img_drawer;
    ListView listView;

    //    CollapsingToolbarLayout collapsingToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        listView = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> madapter =new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.list));
        
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                                if (i == 0) {
                                                    Intent aboutcsit = new Intent(MainActivity.this, AboutCsitActivity.class);
                                                   // aboutcsit.putExtra("listname",listView.getItemAtPosition(i).toString());
                                                    startActivity(aboutcsit);
                                                }
                                                else if (i == 1) {
                                                    Intent pakistan = new Intent(MainActivity.this, CourseActivity.class);
                                                    //pakistan.putExtra("listname",listView.getItemAtPosition(i).toString());
                                                    startActivity(pakistan);
                                                }
                                                else if (i == 2) {
                                                    Intent shriLanka = new Intent(MainActivity.this, ResultActivity.class);
                                                    startActivity(shriLanka);
                                                }
                                                else if (i == 3) {
                                                    Intent china= new Intent(MainActivity.this, SyllabusActivity.class);
                                                    startActivity(china);
                                                }
                                                else if (i == 4) {
                                                    Intent bangladesh= new Intent(MainActivity.this, CollegeListActivity.class);
                                                    startActivity(bangladesh);
                                                }
                                                else if (i == 5) {
                                                    Intent nepal= new Intent(MainActivity.this, AdmissionActivity.class);
                                                    startActivity(nepal);
                                                }
                                                else if (i == 6) {
                                                    Intent complain= new Intent(MainActivity.this, FormActivity.class);
                                                    startActivity(complain);
                                                }
                                              // Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                                               //intent.putExtra("listname",listView.getItemAtPosition(i).toString());
                                              // startActivity(intent);
                                            }
                                        });
        listView.setAdapter(madapter);

                drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        img_drawer=(ImageView)drawerLayout.findViewById(R.id.image_view);

        navigationView = (NavigationView)findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                menuItem.setChecked(true);

                Intent intent;
                switch (menuItem.getItemId()){
                    case R.id.Login:
                        intent=new Intent((MainActivity.this),Login.class);
                        startActivity(intent);
                        return true;
                    case R.id.AboutUs:
                        intent=new Intent((MainActivity.this),AboutUs.class);
                        startActivity(intent);
                        return true;
                    case R.id.NotifyResult:
                        intent=new Intent((MainActivity.this),NotifyResultActivity.class);
                        startActivity(intent);
                        return true;
                    case R.id.FAQ:
                        intent=new Intent((MainActivity.this),FAQ.class);
                        startActivity(intent);
                        return true;
                    case R.id.ContactUs:
                        intent=new Intent((MainActivity.this),Contact.class);
                        startActivity(intent);
                        return true;
                }

                return false;
            }
        });

        toggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.drawer_open, R.string.drawer_close) {

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getSupportActionBar().setTitle("Nepalhm");
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                getSupportActionBar().setTitle("Nepalhm");

            }
        };
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();



//        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        mDemoSlider=(SliderLayout)findViewById(R.id.slider);
        int[] ress=new int[7];
        ress[0]=R.drawable.a;
        ress[1]=R.drawable.b;
        ress[2]=R.drawable.c;
        ress[3]=R.drawable.a;
        ress[4]=R.drawable.b;
         ress[5]=R.drawable.c;
        ress[6]=R.drawable.a;

        for (int i = 0; i < ress.length; i++) {
            TextSliderView textSliderView = new TextSliderView(getApplicationContext());
            String name = "";
            textSliderView
                    .description(name)
                    .image(ress[i])
//                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);
            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setDuration(2000);
        mDemoSlider.setPresetTransformer("Default");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem searchItem = menu.findItem(R.id.search);
        final SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }




}


