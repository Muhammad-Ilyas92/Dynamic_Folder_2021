package app.folder.example.dell.Speciality_March_Folder_2021.Adapter_Animated

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import app.folder.example.dell.Speciality_March_Folder_2021.Product_Fragments_Animated.ProductE_Animated_Fragments.*

class ProductE_Adapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> return ProductE_Fragment_page_One()
            1 -> return ProductE_Fragment_page_Two()
            2 -> return ProductE_Fragment_page_Three()
            3 -> return ProductE_Fragment_page_Four()
            4 -> return ProductE_Fragment_page_Seven()
            5 -> return ProductE_Fragment_page_Five()
            6 -> return ProductE_Fragment_page_Six()
            7 -> return ProductE_Fragment_page_Eight()
            8 -> return ProductE_Fragment_page_Nine()
        }
        return null
    }

    override fun getCount(): Int {
        return 9
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "Page 1"
            1 -> return "Page 2"
            2 -> return "Page 3"
            3 -> return "Page 4"
            4 -> return "Page 5"
            5 -> return "Page 6"
            6 -> return "Page 7"
        }
        return null
    }

    override fun getItemPosition(`object`: Any): Int {
        return POSITION_NONE
    }
}