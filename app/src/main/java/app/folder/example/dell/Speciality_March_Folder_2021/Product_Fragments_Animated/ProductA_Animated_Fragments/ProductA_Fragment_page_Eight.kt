package app.folder.example.dell.Speciality_March_Folder_2021.Product_Fragments_Animated.ProductA_Animated_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import app.folder.example.dell.Speciality_March_Folder_2021.R

/**
 * A simple [Fragment] subclass.
 */
class ProductA_Fragment_page_Eight : Fragment() {
    var image13: ImageView? = null
    var image_header1: ImageView? = null
    var image_header2: ImageView? = null
    var image_background_header: ImageView? = null
    var header1: ImageView? = null
    var header2: ImageView? = null
    var image_background: ImageView? = null
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image8: ImageView? = null
    var image7: ImageView? = null
    var image9: ImageView? = null
    var image10: ImageView? = null
    var image11: ImageView? = null
    var image12: ImageView? = null
    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_a_fragment_page_8, container, false)



        image_background = view.findViewById<View>(R.id.qbal_page8_background) as ImageView
        image_header1 = view.findViewById<View>(R.id.qbal_page8_header1) as ImageView
        image_header2 = view.findViewById<View>(R.id.qbal_page8_header2) as ImageView
        image1 = view.findViewById<View>(R.id.qbal_page8_image1) as ImageView
        image2 = view.findViewById<View>(R.id.qbal_page8_image2) as ImageView
        image3 = view.findViewById<View>(R.id.qbal_page8_image3) as ImageView
        image4 = view.findViewById<View>(R.id.qbal_page8_image4) as ImageView
        image5 = view.findViewById<View>(R.id.qbal_page8_image5) as ImageView
        image6 = view.findViewById<View>(R.id.qbal_page8_image6) as ImageView


/*        int width = getResources().getConfiguration().screenWidthDp;
        DisplayMetrics metrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);

        float yInches = metrics.heightPixels / metrics.ydpi;
        float xInches = metrics.widthPixels / metrics.xdpi;
        double diagonalInches = Math.sqrt(xInches * xInches + yInches * yInches);


        int density = getResources().getDisplayMetrics().densityDpi;
        // smaller device

        switch (density) {
            case DisplayMetrics.DENSITY_LOW:
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page8_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page2_header2.png").into(image_header2);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page8_image2.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page8_image4.png").into(image4);
               Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page8_image5.png").into(image5);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page8_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page8_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page8_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page8_image9.png").into(image9);
           

                break;

            case DisplayMetrics.DENSITY_MEDIUM:

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page8_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page2_header2.png").into(image_header2);


                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page8_image2.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page8_image4.png").into(image4);
               Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page8_image5.png").into(image5);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page8_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page8_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page8_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page8_image9.png").into(image9);
          


                break;

            case DisplayMetrics.DENSITY_HIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page8_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page2_header2.png").into(image_header2);


                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page8_image2.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page8_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page8_image5.png").into(image5);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page8_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page8_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page8_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page8_image9.png").into(image9);
             


                break;

            case DisplayMetrics.DENSITY_XHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page8_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page2_header2.png").into(image_header2);


                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page8_image2.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page8_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page8_image5.png").into(image5);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page8_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page8_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page8_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page8_image9.png").into(image9);
          

                break;

            case DisplayMetrics.DENSITY_XXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page8_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page2_header2.png").into(image_header2);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page8_image2.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page8_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page8_image5.png").into(image5);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page8_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page8_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page8_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page8_image9.png").into(image9);
          

                break;

            case DisplayMetrics.DENSITY_XXXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page8_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page2_header2.png").into(image_header2);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page8_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page8_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page8_image2.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page8_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page8_image5.png").into(image5);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page8_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page8_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page8_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page8_image9.png").into(image9);
         

                break;
        }*/


        // Animation anim_background = AnimationUtils.loadAnimation(getContext(), R.anim.bounce);
        val animation_header1 = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        val animation_header2 = AnimationUtils.loadAnimation(context, R.anim.rotate)

        // image_background.startAnimation(anim_background);
        image_header1!!.startAnimation(animation_header1)
        image_header2!!.startAnimation(animation_header2)

        image1!!.visibility = View.INVISIBLE
        image2!!.visibility = View.INVISIBLE
        image3!!.visibility = View.INVISIBLE
        image4!!.visibility = View.INVISIBLE
        image5!!.visibility = View.INVISIBLE
        image6!!.visibility = View.INVISIBLE

        view.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                //do something
                touch++
                if (touch == 1) {
                    val animation_image1 =
                        AnimationUtils.loadAnimation(context, R.anim.move_from_left)
                    image1!!.visibility = View.VISIBLE
                    image1!!.startAnimation(animation_image1)

                    val animation_image2 =
                        AnimationUtils.loadAnimation(context, R.anim.fade_in_one_sec)
                    image2!!.visibility = View.VISIBLE
                    image2!!.startAnimation(animation_image2)

                } else if (touch == 2) {
                    val animation_image3 =
                        AnimationUtils.loadAnimation(context, R.anim.move_from_left)
                    image3!!.visibility = View.VISIBLE
                    image3!!.startAnimation(animation_image3)


                    val animation_image4 =
                        AnimationUtils.loadAnimation(context, R.anim.fade_in_one_sec)
                    image4!!.visibility = View.VISIBLE
                    image4!!.startAnimation(animation_image4)

                } else if (touch == 3) {
                    val animation_image5 =
                        AnimationUtils.loadAnimation(context, R.anim.move_from_left)
                    image5!!.visibility = View.VISIBLE
                    image5!!.startAnimation(animation_image5)

                    val animation_image6 =
                        AnimationUtils.loadAnimation(context, R.anim.fade_in_one_sec)
                    image6!!.visibility = View.VISIBLE
                    image6!!.startAnimation(animation_image6)

                }
            }
            true
        }
        return view
    }
}