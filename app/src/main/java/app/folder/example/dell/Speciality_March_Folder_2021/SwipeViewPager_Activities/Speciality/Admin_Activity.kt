package app.folder.example.dell.Speciality_March_Folder_2021.SwipeViewPager_Activities.Speciality

import android.animation.ArgbEvaluator
import android.app.AlertDialog
import android.content.Intent
import android.location.LocationManager
import android.net.wifi.WifiManager
import android.os.Bundle
import android.provider.Settings
import android.support.design.widget.AppBarLayout
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v4.view.ViewPager.OnPageChangeListener
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView
import android.support.v7.widget.Toolbar
import android.view.*
import app.folder.example.dell.Speciality_March_Folder_2021.Activities.LoginActivity
import app.folder.example.dell.Speciality_March_Folder_2021.Prefs.PrefConfig
import app.folder.example.dell.Speciality_March_Folder_2021.R
import app.folder.example.dell.Speciality_March_Folder_2021.SwipeViewPager_Activities.Model
import app.folder.example.dell.Speciality_March_Folder_2021.SwipeViewPager_Adapter.Speciality.Adapter_Admin
import java.util.*

class Admin_Activity : AppCompatActivity() {
    private val cardView: CardView? = null
    var adapterAdmin: Adapter_Admin? = null
    var models: MutableList<Model>? = null
    var colors: Array<Int>? = null
    var argbEvaluator = ArgbEvaluator()
    private var preferenceConfig: PrefConfig? = null
    private var wifiManager: WifiManager? = null
    var isGPSEnable = false
    var isNetworkEnable = false
    var locationManager: LocationManager? = null
    private val tabLayout: TabLayout? = null
    private val appBarLayout: AppBarLayout? = null
    private var viewPager: ViewPager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        /* Toolbar open*/requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.setFlags(
            WindowManager.LayoutParams.FLAG_SECURE,
            WindowManager.LayoutParams.FLAG_SECURE
        )
        /*toolbar close*/setContentView(R.layout.activity_speciality_admin)
        wifiManager = applicationContext.getSystemService(WIFI_SERVICE) as WifiManager
        //if( savedInstanceState == null )
        //  changeFragment(new HomeFragment());
        /* mIntentFilter = new IntentFilter();
        mIntentFilter.addAction(mBroadcastStringAction);
        Intent serviceIntent = new Intent(this, BroadcastService.class);
        startService(serviceIntent);*/fn_checkLocation()
        preferenceConfig = PrefConfig(applicationContext)
        val toolbar = findViewById<View>(R.id.toolbar_activity2) as Toolbar
        //toolbar.setTitle("Merofer");
        setSupportActionBar(toolbar)
        supportActionBar?.setTitle(null)
        models = ArrayList()



        models?.add(Model(R.drawable.qbal_title_folder, R.drawable.qbal_title_text_image, "  "))

        adapterAdmin = Adapter_Admin(models as ArrayList<Model>, this)
        viewPager = findViewById(R.id.viewPager)
        viewPager?.setAdapter(adapterAdmin)
        viewPager?.setPadding(100, 0, 100, 0)
        val colors_temp = arrayOf(
            resources.getColor(R.color.color1)

        )
        colors = colors_temp
        viewPager?.setOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                if (position < adapterAdmin!!.count - 1 && position < colors!!.size - 1) {
                    viewPager?.setBackgroundColor(
                        (argbEvaluator.evaluate(
                            positionOffset,
                            colors!![position],
                            colors!![position + 1]
                        ) as Int)
                    )
                } else {
                    viewPager?.setBackgroundColor(colors!![colors!!.size - 1])
                }
            }

            override fun onPageSelected(position: Int) {}
            override fun onPageScrollStateChanged(state: Int) {}
        })
    }

    /*

    @Override
    public void onClick(View view) {
        if (R.id.card_animated == R.id.card_static) {
            Intent intent = new Intent(Admin_Activity.this, Animated_Activity.class);
            startActivity(intent);
            Toast.makeText(this, "Animated Folder", Toast.LENGTH_LONG).show();
        }
        else
        {
            Intent intent = new Intent(Admin_Activity.this, Static_Page_Activity.class);
            startActivity(intent);
            Toast.makeText(this, "Static Folder", Toast.LENGTH_LONG).show();

        }
    }

*/
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.app_bar_menu_logout, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.product_Logout -> {
                //Toast.makeText(getApplicationContext(), "Logout", Toast.LENGTH_LONG).show();
                finish()
                val homeIntent = Intent(applicationContext, LoginActivity::class.java)
                homeIntent.addCategory(Intent.CATEGORY_HOME)
                homeIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(homeIntent)
                preferenceConfig!!.writeLoginStatus(false)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun fn_checkLocation() {
        locationManager = applicationContext.getSystemService(LOCATION_SERVICE) as LocationManager
        isNetworkEnable = locationManager!!.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
        isGPSEnable = locationManager!!.isProviderEnabled(LocationManager.GPS_PROVIDER)
        if (!isGPSEnable && !isNetworkEnable) {
            buildAlertMessageNoGps()
            //Toast.makeText(this, "Enable Gps First", LENGTH_LONG).show();
            /*  finishAffinity();*/
            /*  System.exit(0);*/
            //startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
            //return false;
        }
    }

    private fun buildAlertMessageNoGps() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Yout GPS seems to be disabled, do you want to enable it?")
            .setCancelable(false)
            .setPositiveButton("Yes") { dialog, id -> startActivity(Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)) }
            .setNegativeButton("No") { dialog, id ->
                finishAffinity()
                System.exit(0)
            }
        val alert = builder.create()
        alert.show()
    }

    public override fun onResume() {
        super.onResume()
        fn_checkLocation()
        //registerReceiver(mReceiver, mIntentFilter);
    }

    /*    private BroadcastReceiver mReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            if (intent.getAction().equals(mBroadcastStringAction)) {
               */
    /* System.exit(0);
                finishAffinity();
                // Toast.makeText(getApplicationContext(),"Exit App",Toast.LENGTH_SHORT).show();
                Intent homeIntent = new Intent(getApplicationContext(),LoginActivity.class);
                homeIntent.addCategory( Intent.CATEGORY_HOME );
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
                preferenceConfig.writeLoginStatus(false);*/
    /*

                finish();
                Intent homeIntent = new Intent(getApplicationContext(),LoginActivity.class);
                homeIntent.addCategory( Intent.CATEGORY_HOME );
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
                preferenceConfig.writeLoginStatus(false);


            }
        }
    };*/
    /*   @Override
    protected void onPause() {
        unregisterReceiver(mReceiver);
        super.onPause();
    }*/
    override fun onStart() {
        super.onStart()
        /* IntentFilter intentFilter = new IntentFilter(WifiManager.WIFI_STATE_CHANGED_ACTION);
        registerReceiver(wifiStateReceiver, intentFilter);*/
    }

    override fun onStop() {
        super.onStop()
        //  unregisterReceiver(wifiStateReceiver);
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
}