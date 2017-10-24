package ua.work.home.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import ua.work.home.databindingexample.databinding.ActivityMainBinding;
import ua.work.home.databindingexample.model.User;
import ua.work.home.databindingexample.model.UserTwoSide;
import ua.work.home.databindingexample.model.ViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        User user = new User("Andrew", "Android");
//        User user = new User("Andrew", "Papai");
        User user = new User("Andrew", "Papai", "https://www.atomix.com.au/media/2015/06/atomix_user31.png");
        UserTwoSide userTwoSide = new UserTwoSide("", "");
        ViewModel viewModel = new ViewModel();
        binding.setUser(user);
        binding.setMain(this);
        binding.setViewModel(viewModel);
    }


    public void clickToast() {
        Toast.makeText(MainActivity.this, "Click to button", Toast.LENGTH_SHORT).show();
        Log.d("TAG", "*********************** click");
    }
}
