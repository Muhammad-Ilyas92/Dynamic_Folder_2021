package app.folder.example.dell.Speciality_March_Folder_2021.Product_Fragments_Animated.ProductJ_Animated_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import app.folder.example.dell.Speciality_March_Folder_2021.R

class ProductJ_Fragment_page_Two : Fragment() {
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image7: ImageView? = null
    var image_background: ImageView? = null
    var image_header1: ImageView? = null
    var image_header2: ImageView? = null
    var image8: ImageView? = null
    var image9: ImageView? = null
    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_j_fragment_page_2, container, false)
       /* image_background = view.findViewById<View>(R.id.cebac_page9_background) as ImageView
        image_header1 = view.findViewById<View>(R.id.cebac_page9_header1) as ImageView
        image_header2 = view.findViewById<View>(R.id.cebac_page9_header2) as ImageView
        image1 = view.findViewById<View>(R.id.cebac_page9_image1) as ImageView
        image2 = view.findViewById<View>(R.id.cebac_page9_image2) as ImageView
        image3 = view.findViewById<View>(R.id.cebac_page9_image3) as ImageView
        image4 = view.findViewById<View>(R.id.cebac_page9_image4) as ImageView
        image5 = view.findViewById<View>(R.id.cebac_page9_image5) as ImageView
        image6 = view.findViewById<View>(R.id.cebac_page9_image6) as ImageView
        image7 = view.findViewById<View>(R.id.cebac_page9_image7) as ImageView
        image8 = view.findViewById<View>(R.id.cebac_page9_image8) as ImageView
        image9 = view.findViewById<View>(R.id.cebac_page9_image9) as ImageView
*/

/*

        int width = getResources().getConfiguration().screenWidthDp;
        DisplayMetrics metrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);

        float yInches = metrics.heightPixels / metrics.ydpi;
        float xInches = metrics.widthPixels / metrics.xdpi;
        double diagonalInches = Math.sqrt(xInches * xInches + yInches * yInches);


        int density = getResources().getDisplayMetrics().densityDpi;
        // smaller device

        switch (density) {
            case DisplayMetrics.DENSITY_LOW:
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-ldpi/cebac_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-ldpi/cebac_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-ldpi/cebac_page2_header2.png").into(image_header2);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-ldpi/cebac_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-ldpi/cebac_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-ldpi/cebac_page8_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-ldpi/cebac_page8_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-ldpi/cebac_page8_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-ldpi/cebac_page8_image6.png").into(image6);

                break;

            case DisplayMetrics.DENSITY_MEDIUM:

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-mdpi/cebac_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-mdpi/cebac_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-mdpi/cebac_page2_header2.png").into(image_header2);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-mdpi/cebac_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-mdpi/cebac_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-mdpi/cebac_page8_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-mdpi/cebac_page8_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-mdpi/cebac_page8_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-mdpi/cebac_page8_image6.png").into(image6);

                break;

            case DisplayMetrics.DENSITY_HIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-hdpi/cebac_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-hdpi/cebac_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-hdpi/cebac_page2_header2.png").into(image_header2);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-hdpi/cebac_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-hdpi/cebac_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-hdpi/cebac_page8_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-hdpi/cebac_page8_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-hdpi/cebac_page8_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-hdpi/cebac_page8_image6.png").into(image6);

                break;

            case DisplayMetrics.DENSITY_XHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xhdpi/cebac_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xhdpi/cebac_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xhdpi/cebac_page2_header2.png").into(image_header2);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xhdpi/cebac_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xhdpi/cebac_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xhdpi/cebac_page8_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xhdpi/cebac_page8_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xhdpi/cebac_page8_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xhdpi/cebac_page8_image6.png").into(image6);

                break;

            case DisplayMetrics.DENSITY_XXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxhdpi/cebac_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxhdpi/cebac_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxhdpi/cebac_page2_header2.png").into(image_header2);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxhdpi/cebac_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxhdpi/cebac_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxhdpi/cebac_page8_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxhdpi/cebac_page8_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxhdpi/cebac_page8_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxhdpi/cebac_page8_image6.png").into(image6);

                break;

            case DisplayMetrics.DENSITY_XXXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxxhdpi/cebac_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxxhdpi/cebac_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxxhdpi/cebac_page2_header2.png").into(image_header2);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxxhdpi/cebac_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxxhdpi/cebac_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxxhdpi/cebac_page8_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxxhdpi/cebac_page8_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxxhdpi/cebac_page8_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2021_June/cebac/drawable-xxxhdpi/cebac_page8_image6.png").into(image6);

                break;
        }

*/

        // Animation anim_background = AnimationUtils.loadAnimation(getContext(), R.anim.bounce);
        val anim_header1 = AnimationUtils.loadAnimation(context, R.anim.fade_in_one_sec)
        val anim_header2 = AnimationUtils.loadAnimation(context, R.anim.blink)
        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.slide_down)


        // image_background.startAnimation(anim_background);
        image_header1!!.startAnimation(anim_header1)
        image_header2!!.startAnimation(anim_header2)
        image1!!.startAnimation(animation_image1)
        image2!!.visibility = View.INVISIBLE
        image3!!.visibility = View.INVISIBLE
        image4!!.visibility = View.INVISIBLE
        image5!!.visibility = View.INVISIBLE
        image6!!.visibility = View.INVISIBLE
        image7!!.visibility = View.INVISIBLE
        image8!!.visibility = View.INVISIBLE
        image9!!.visibility = View.INVISIBLE
        view.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                //do something
                touch++
                if (touch == 1) {
                    val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.slide_down)
                    image2!!.visibility = View.VISIBLE
                    image2!!.startAnimation(animation_image2)
                } else if (touch == 2) {
                    val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.slide_down)
                    image3!!.visibility = View.VISIBLE
                    image3!!.startAnimation(animation_image3)
                } else if (touch == 3) {
                    val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.slide_down)
                    image4!!.visibility = View.VISIBLE
                    image4!!.startAnimation(animation_image4)
                } else if (touch == 4) {
                    val animation_image5 = AnimationUtils.loadAnimation(context, R.anim.slide_down)
                    image5!!.visibility = View.VISIBLE
                    image5!!.startAnimation(animation_image5)
                } else if (touch == 5) {
                    val animation_image6 = AnimationUtils.loadAnimation(context, R.anim.slide_down)
                    image6!!.visibility = View.VISIBLE
                    image6!!.startAnimation(animation_image6)
                } else if (touch == 6) {
                    val animation_image7 = AnimationUtils.loadAnimation(context, R.anim.slide_down)
                    image7!!.visibility = View.VISIBLE
                    image7!!.startAnimation(animation_image7)
                } else if (touch == 7) {
                    val animation_image8 = AnimationUtils.loadAnimation(context, R.anim.slide_down)
                    image8!!.visibility = View.VISIBLE
                    image8!!.startAnimation(animation_image8)
                } else if (touch == 8) {
                    val animation_image9 =
                        AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
                    image9!!.visibility = View.VISIBLE
                    image9!!.startAnimation(animation_image9)
                }
            }
            true
        }
        return view
    }
}