package ua.work.home.databindingexample.utils;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by kunde on 23.10.2017.
 */

public class ImageUtils {

    @BindingAdapter({"android:src", "app:error"})
    public static void loadImage(ImageView view, String url, Drawable error) {
        Picasso.with(view.getContext())
                .load(url)
                .error(error)
                .into(view);
    }
}
