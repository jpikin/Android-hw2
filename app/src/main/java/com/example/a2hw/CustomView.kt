package com.example.a2hw

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import com.example.a2hw.databinding.CustomViewBinding

class CustomView  @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {
    init {
        inflate(context, R.layout.custom_view, this)
    }

    private val binding: CustomViewBinding
    init {
        val inflatedView = inflate(context,
            R.layout.custom_view, this)
        binding = CustomViewBinding.bind(inflatedView)
    }
    fun setText1(message: String) {
        binding.textView1.text = message
    }
    fun setText2(message: String) {
        binding.textView2.text = message
    }
}
