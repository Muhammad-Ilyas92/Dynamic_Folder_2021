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
 *
 *
 *
 *
 *
 */
class ProductA_Fragment_page_Seven : Fragment() {
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
        val view = inflater.inflate(R.layout.product_a_fragment_page_7, container, false)



        image_background = view.findViewById<View>(R.id.qbal_page7_background) as ImageView
        image_header1 = view.findViewById<View>(R.id.qbal_page7_header1) as ImageView
        image_header2 = view.findViewById<View>(R.id.qbal_page7_header2) as ImageView
        image1 = view.findViewById<View>(R.id.qbal_page7_image1) as ImageView
        image2 = view.findViewById<View>(R.id.qbal_page7_image2) as ImageView
        image3 = view.findViewById<View>(R.id.qbal_page7_image3) as ImageView
        image4 = view.findViewById<View>(R.id.qbal_page7_image4) as ImageView
        // image5 = view.findViewById<View>(R.id.qbal_page2_image5) as ImageView
        // image6 = view.findViewById<View>(R.id.qbal_page2_image6) as ImageView



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
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page7_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page2_header2.png").into(image_header2);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page7_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page7_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page6_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page4_image4.png").into(image4);
               Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page4_image5.png").into(image5);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page6_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page6_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page6_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page4_image9.png").into(image9);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page4_image10.png").into(image10);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page6_image11.png").into(image11);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page6_image12.png").into(image12);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-ldpi/tanzo_page6_image13.png").into(image13);


                break;

            case DisplayMetrics.DENSITY_MEDIUM:

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page6_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page2_header2.png").into(image_header2);


                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page6_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page6_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page6_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page4_image4.png").into(image4);
               Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page4_image5.png").into(image5);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page6_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page6_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page6_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page4_image9.png").into(image9);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page4_image10.png").into(image10);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page6_image11.png").into(image11);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page6_image12.png").into(image12);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-mdpi/tanzo_page6_image13.png").into(image13);



                break;

            case DisplayMetrics.DENSITY_HIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page6_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page2_header2.png").into(image_header2);


                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page6_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page6_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page6_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page4_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page4_image5.png").into(image5);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page6_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page6_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page6_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page4_image9.png").into(image9);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page4_image10.png").into(image10);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page6_image11.png").into(image11);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page6_image12.png").into(image12);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-hdpi/tanzo_page6_image13.png").into(image13);



                break;

            case DisplayMetrics.DENSITY_XHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page6_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page2_header2.png").into(image_header2);


                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page6_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page6_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page6_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page4_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page4_image5.png").into(image5);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page6_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page6_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page6_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page4_image9.png").into(image9);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page4_image10.png").into(image10);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page6_image11.png").into(image11);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page6_image12.png").into(image12);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xhdpi/tanzo_page6_image13.png").into(image13);


                break;

            case DisplayMetrics.DENSITY_XXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page6_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page2_header2.png").into(image_header2);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page6_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page6_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page6_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page4_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page4_image5.png").into(image5);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page6_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page6_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page6_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page4_image9.png").into(image9);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page4_image10.png").into(image10);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page6_image11.png").into(image11);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page6_image12.png").into(image12);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxhdpi/tanzo_page6_image13.png").into(image13);


                break;

            case DisplayMetrics.DENSITY_XXXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page6_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page2_header1.png").into(image_header1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page2_header2.png").into(image_header2);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page6_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page6_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page6_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page4_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page4_image5.png").into(image5);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page6_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page6_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page6_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page4_image9.png").into(image9);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page4_image10.png").into(image10);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page6_image11.png").into(image11);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page6_image12.png").into(image12);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/tanzo/drawable-xxxhdpi/tanzo_page6_image13.png").into(image13);


                break;
        }*/


        // Animation anim_background = AnimationUtils.loadAnimation(getContext(), R.anim.bounce);
        val animation_header1 = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        val animation_header2 = AnimationUtils.loadAnimation(context, R.anim.rotate)

        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.rotate_one_sec)
        val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.fade_in_two_sec)
        val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.move_up_two_second)


        //  val animation_image5 = AnimationUtils.loadAnimation(context, R.anim.fade_in_two_sec)


        // image_background.startAnimation(anim_background);
        image_header1!!.startAnimation(animation_header1)
        image_header2!!.startAnimation(animation_header2)
        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)
        //  image5!!.startAnimation(animation_image5)

     /*   // image_background.startAnimation(anim_background);
        image_header1!!.startAnimation(animation_header1)
        image_header2!!.startAnimation(animation_header2)
        image1!!.startAnimation(animation_image1)
        image2!!.visibility = View.INVISIBLE
        image3!!.visibility = View.INVISIBLE
        image4!!.visibility = View.INVISIBLE
        image5!!.visibility = View.INVISIBLE
        image6!!.visibility = View.INVISIBLE
        image7!!.visibility = View.INVISIBLE
        image8!!.visibility = View.INVISIBLE
        image9!!.visibility = View.INVISIBLE
        image10!!.visibility = View.INVISIBLE
        image11!!.visibility = View.INVISIBLE
        image12!!.visibility = View.INVISIBLE
        image13!!.visibility = View.INVISIBLE
        view.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                //do something
                touch++
                if (touch == 1) {
                    val animation_image2 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image2!!.visibility = View.VISIBLE
                    image2!!.startAnimation(animation_image2)
                } else if (touch == 2) {
                    val animation_image3 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image3!!.visibility = View.VISIBLE
                    image3!!.startAnimation(animation_image3)
                } else if (touch == 3) {
                    val animation_image4 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image4!!.visibility = View.VISIBLE
                    image4!!.startAnimation(animation_image4)
                } else if (touch == 4) {
                    val animation_image5 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image5!!.visibility = View.VISIBLE
                    image5!!.startAnimation(animation_image5)
                } else if (touch == 5) {
                    val animation_image6 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image6!!.visibility = View.VISIBLE
                    image6!!.startAnimation(animation_image6)
                } else if (touch == 6) {
                    val animation_image7 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image7!!.visibility = View.VISIBLE
                    image7!!.startAnimation(animation_image7)
                } else if (touch == 7) {
                    val animation_image8 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image8!!.visibility = View.VISIBLE
                    image8!!.startAnimation(animation_image8)
                } else if (touch == 8) {
                    val animation_image9 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image9!!.visibility = View.VISIBLE
                    image9!!.startAnimation(animation_image9)
                } else if (touch == 9) {
                    val animation_image10 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image10!!.visibility = View.VISIBLE
                    image10!!.startAnimation(animation_image10)
                } else if (touch == 10) {
                    val animation_image11 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image11!!.visibility = View.VISIBLE
                    image11!!.startAnimation(animation_image11)
                } else if (touch == 11) {
                    val animation_image12 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image12!!.visibility = View.VISIBLE
                    image12!!.startAnimation(animation_image12)
                } else if (touch == 12) {
                    val animation_image13 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image13!!.visibility = View.VISIBLE
                    image13!!.startAnimation(animation_image13)
                }
            }
            true
        }*/


        return view
    }
}