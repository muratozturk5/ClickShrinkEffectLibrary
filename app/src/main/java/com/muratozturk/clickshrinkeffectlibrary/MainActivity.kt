package com.muratozturk.clickshrinkeffectlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muratozturk.click_shrink_effect.applyClickShrink
import com.muratozturk.clickshrinkeffectlibrary.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.applyClickShrink()
        binding.textView.applyClickShrink(0.80f, 150L)
        binding.cardView.applyClickShrink(0.75f, 150L)
        binding.imageView.applyClickShrink(0.50f, 250L)
    }
}