package app.folder.example.dell.Speciality_March_Folder_2021.Transformations

import android.support.v4.view.ViewPager.PageTransformer
import android.view.View

class FadeOutTransformation : PageTransformer {
    override fun transformPage(page: View, position: Float) {
        page.translationX = -position * page.width
        page.alpha = 1 - Math.abs(position)
    }
}