package com.example.javadatabinding;

import android.content.Context;
import android.view.View;


public class MyClickistener  {
    private Context context;
    private User user;

    public MyClickistener() {
        this.context = context;
        this.user = user;
    }


    public void onShowToast(View view) {
        user.name.set("Jhonny");
        user.email.set("johonny.Englih@gmail.com");
    }
}
