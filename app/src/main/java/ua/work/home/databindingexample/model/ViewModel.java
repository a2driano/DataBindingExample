package ua.work.home.databindingexample.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.Observable;
import android.text.Editable;
import android.text.TextWatcher;


/**
 * Created by Andrii Papai on 24.10.2017.
 */

public class ViewModel extends BaseObservable {
    public User user;

    public ViewModel() {
        user = new User("", "");
        user.addOnPropertyChangedCallback(new OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                notifyPropertyChanged(propertyId);
            }
        });

//        user.addOnPropertyChangedCallback(new OnPropertyChangedCallback {
//            @Override
//            public void onPropertyChanged (Observable sender,int property){
//                if (property == BR.firstName || property == BR.lastName) {
//                    notifyPropertyChanged(ViewModel.this, BR.hello);
//                }
//            }
//        });
    }

//    @Bindable
//    public String hello() {
//        return "Hello " + user.getName();
//    }

    @Bindable
    public TextWatcher getUserNameTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                user.setName(String.valueOf(charSequence));

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
    }
}

