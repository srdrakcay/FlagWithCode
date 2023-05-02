    package com.serdar.flagwithcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.serdar.flagwithcode.databinding.ActivityMainBinding

    class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

      FlagKit.drawableWithFlag(this,"ad").also {
          binding.imageView.setImageDrawable(it)
      }

    }
}