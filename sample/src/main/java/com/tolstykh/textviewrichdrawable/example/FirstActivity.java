package com.tolstykh.textviewrichdrawable.example;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.tolstykh.textviewrichdrawable.DensityUtils;
import com.tolstykh.textviewrichdrawable.R;
import com.tolstykh.textviewrichdrawable.databinding.ActivityFirstBinding;

public class FirstActivity extends AppCompatActivity {

    private ActivityFirstBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFirstBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.textView.getmRichDrawableHelper().setmDrawableStartHeight(72);
        binding.textView.getmRichDrawableHelper().setmDrawableStartWidth(72);
        binding.textView.setDrawableStartVectorId(R.drawable.ic_baseline_arrow_forward_ios_24);
    }
}