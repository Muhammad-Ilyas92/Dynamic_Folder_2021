package app.folder.example.dell.Speciality_March_Folder_2021.Transformations

import android.support.v4.view.ViewPager.PageTransformer
import android.util.Log
import android.view.View

class HorizontalFlipTransformation : PageTransformer {
    override fun transformPage(page: View, position: Float) {
        page.translationX = -position * page.width
        page.cameraDistance = 20000f
        if (position < 0.5 && position > -0.5) {
            page.visibility = View.VISIBLE
        } else {
            page.visibility = View.INVISIBLE
        }
        if (position < -1) {     // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.alpha = 0f
        } else if (position <= 0) {    // [-1,0]
            page.alpha = 1f
            page.rotationX = 180 * (1 - Math.abs(position) + 1)
            Log.e("HORIZONTAL", "position <= 0     " + 180 * (1 - Math.abs(position) + 1))
        } else if (position <= 1) {    // (0,1]
            page.alpha = 1f
            page.rotationX = -180 * (1 - Math.abs(position) + 1)
            Log.e("HORIZONTAL", "position <= 1     " + -180 * (1 - Math.abs(position) + 1))
        } else {    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.alpha = 0f
        }
    }
}