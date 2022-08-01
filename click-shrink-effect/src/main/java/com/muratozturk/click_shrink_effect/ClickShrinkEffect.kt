package com.muratozturk.click_shrink_effect

import android.animation.Animator
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.view.MotionEvent
import android.view.View
import java.lang.ref.WeakReference


class ClickShrinkEffect(view: View, shrinkValue: Float, animationDuration: Long) {

    private val weakRefView = WeakReference(view)
    private val _shrinkValue = shrinkValue
    private val _animationDuration = animationDuration

    init {
        if (!view.hasOnClickListeners()) view.setOnClickListener { }
        view.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> buildShrinkAnimator()?.start()
                MotionEvent.ACTION_UP -> buildGrowAnimator()?.start()
                MotionEvent.ACTION_CANCEL -> buildGrowAnimator()?.start()
            }
            return@setOnTouchListener false
        }
    }

    private fun buildShrinkAnimator(): Animator? {
        val scaleX = PropertyValuesHolder.ofFloat(View.SCALE_X, 1f, _shrinkValue)
        val scaleY = PropertyValuesHolder.ofFloat(View.SCALE_Y, 1f, _shrinkValue)
        weakRefView.get()?.apply {
            val animator = ObjectAnimator.ofPropertyValuesHolder(this, scaleX, scaleY)
            animator.duration = _animationDuration
            return animator
        }
        return null
    }


    private fun buildGrowAnimator(): Animator? {
        val scaleX = PropertyValuesHolder.ofFloat(View.SCALE_X, _shrinkValue, 1f)
        val scaleY = PropertyValuesHolder.ofFloat(View.SCALE_Y, _shrinkValue, 1f)
        weakRefView.get()?.apply {
            val animator = ObjectAnimator.ofPropertyValuesHolder(this, scaleX, scaleY)
            animator.duration = _animationDuration
            return animator
        }
        return null
    }
}

fun View.applyClickShrink(shrinkValue: Float = 0.95f, animationDuration: Long = 100L): View {
    return this.apply {
        ClickShrinkEffect(this, shrinkValue, animationDuration)
    }
}