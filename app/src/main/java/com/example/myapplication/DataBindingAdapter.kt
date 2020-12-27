package com.example.myapplication

import android.widget.TextView
import androidx.databinding.BindingAdapter

object DataBindingAdapter {
    @JvmStatic
    @BindingAdapter("setCountText")
    fun TextView.setCountText(count: Int) {
        text = if (count < 3) {
            "Updated to $count"
        } else {
            "Updating more, Now it is $count"
        }
    }
}