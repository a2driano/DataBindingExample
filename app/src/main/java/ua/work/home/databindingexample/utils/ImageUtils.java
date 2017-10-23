package ua.work.home.databindingexample.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by kunde on 23.10.2017.
 */

public class ImageUtils {

    @BindingAdapter({"android:src"})
    public static void loadImage(ImageView view, String url) {
        Picasso.with(view.getContext())
                .load(url)
                .into(view);
    }
}
