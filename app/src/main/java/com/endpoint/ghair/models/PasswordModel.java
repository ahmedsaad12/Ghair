package com.endpoint.ghair.models;

import android.content.Context;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

import com.endpoint.ghair.BR;
import com.endpoint.ghair.R;


public class PasswordModel extends BaseObservable {


    private String password;

    public ObservableField<String> error_password = new ObservableField<>();


    public PasswordModel() {

        this.password="";
    }

    public PasswordModel(String password) {

        this.password = password;
        notifyPropertyChanged(com.endpoint.ghair.BR.password);


    }




    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);

    }

    public boolean isDataValid(Context context)
    {
        if (
                password.length()>=6
        )
        {

            error_password.set(null);

            return true;
        }else
            {


                if (password.isEmpty())
                {
                    error_password.set(context.getString(R.string.field_req));
                }else if (password.length()<6)
                {
                    error_password.set(context.getString(R.string.pass_short));
                }else
                    {
                        error_password.set(null);

                    }
                return false;
            }
    }


}
