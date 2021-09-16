package app.folder.example.dell.Speciality_March_Folder_2021.Adapter_Static

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.PagerAdapter
import app.folder.example.dell.Speciality_March_Folder_2021.Product_Fragments_Static.ProductI_Static_Fragments.*

class ProductI_Adapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
    //int count = 0;
    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> return ProductI_Fragment_page_One()
            1 ->                 //  return new ProductA_Fragment_page_Four();
                return ProductI_Fragment_page_Two()
            2 ->                 //return new ProductA_Fragment_page_Five();
                return ProductI_Fragment_page_Three()
            3 ->                 //return new ProductA_Fragment_page_Six();
                return ProductI_Fragment_page_Four()
            4 ->                 //return new ProductA_Fragment_page_Two();
                return ProductI_Fragment_page_Five()
            5 ->                 // return new ProductA_Fragment_page_Three();
                return ProductI_Fragment_page_Six()
        }
        return null
    }

    override fun getCount(): Int {
        return 6
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "Page 1"
            1 -> return "Page 2"
            2 -> return "Page 3"
            3 -> return "Page 4"
            4 -> return "Page 5"
            5 -> return "Page 6"
        }
        return null
    }

    override fun getItemPosition(`object`: Any): Int {
        return POSITION_NONE
    }
}