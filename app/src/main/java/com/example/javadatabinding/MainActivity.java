package com.example.javadatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.javadatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private User user;
    private MyClickistener myClickistener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User();
        binding.setVm(user);
        myClickistener = new MyClickistener();
        binding.setMylistener(myClickistener);

    }
}
