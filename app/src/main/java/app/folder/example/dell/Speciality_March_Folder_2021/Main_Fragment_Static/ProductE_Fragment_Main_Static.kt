package app.folder.example.dell.Speciality_March_Folder_2021.Main_Fragment_Static

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.location.LocationManager
import android.os.Bundle
import android.provider.Settings
import android.support.v4.app.Fragment
import android.support.v4.view.PagerTabStrip
import android.support.v4.view.ViewPager
import android.support.v4.view.ViewPager.OnPageChangeListener
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.folder.example.dell.Speciality_March_Folder_2021.Adapter_Static.ProductE_Adapter
import app.folder.example.dell.Speciality_March_Folder_2021.R
import app.folder.example.dell.Speciality_March_Folder_2021.Transformations.SimpleTransformation

/**
 * A simple [Fragment] subclass.
 */
class ProductE_Fragment_Main_Static : Fragment() {
    var locationManager: LocationManager? = null
    var isGPSEnable = false
    var isNetworkEnable = false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_e_fragment_main, container, false)
        viewPager_complete = view.findViewById<View>(R.id.viewpager_complete_productE) as ViewPager
        // pagerTabStrip = (PagerTabStrip)view.findViewById(R.id.pagertabstrip_id_productC);
        viewPager_complete!!.adapter = ProductE_Adapter(
            childFragmentManager
        )
        //viewPager_complete.setPageTransformer(true, new RotateUpTransformer());
        viewPager_complete!!.setPageTransformer(true, SimpleTransformation())
        viewPager_complete!!.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                viewPager_complete!!.adapter!!.notifyDataSetChanged()
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })
        return view
    }

    private fun fn_checkLocation() {
        locationManager = context!!.getSystemService(Context.LOCATION_SERVICE) as LocationManager
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
        val builder = AlertDialog.Builder(context)
        builder.setMessage("Yout GPS seems to be disabled, do you want to enable it?")
            .setCancelable(false)
            .setPositiveButton("Yes") { dialog, id -> startActivity(Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)) }
            .setNegativeButton("No") { dialog, id -> System.exit(0) }
        val alert = builder.create()
        alert.show()
    }

    companion object {
        var viewPager_complete: ViewPager? = null
        var pagerTabStrip: PagerTabStrip? = null
    }
}