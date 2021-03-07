package com.example.animationapp

import android.animation.ObjectAnimator
import android.opengl.Visibility
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        startGame.setOnClickListener {

            ObjectAnimator.ofFloat(view4, "translationX", 160f).apply {
                duration = 1000
                start()
            }
            ObjectAnimator.ofFloat(view5, "translationY", -330f).apply {
                duration = 3000
                start()
            }
            ObjectAnimator.ofFloat(view6, "translationX", -160f).apply {
                duration = 1000
                start()
            }
            startGame.visibility = View.GONE

        }
        reset.setOnClickListener {

            ObjectAnimator.ofFloat(view4, "translationX", 0f).apply {
                duration = 1000
                start()
            }
            ObjectAnimator.ofFloat(view5, "translationY", 0f).apply {
                duration = 3000
                start()
            }
            ObjectAnimator.ofFloat(view6, "translationX", 0f).apply {
                duration = 1000
                start()
            }
            startGame.visibility = view.visibility
        }
        rotationButton.setOnClickListener {
            ObjectAnimator.ofFloat(view1, "rotationX", 360f).apply {
                duration = 1000
                start()
            }
            ObjectAnimator.ofFloat(view2, "rotationY", 360f).apply {
                duration = 1000
                start()
            }
            ObjectAnimator.ofFloat(view3, "scaleX", 2f).apply {
                duration = 1000
                start()
            }
            ObjectAnimator.ofFloat(view4, "scaleY", 3f).apply {
                duration = 1000
                start()
            }
            ObjectAnimator.ofFloat(view5, "pivotY", 3f).apply {
                duration = 1000
                start()
            }
            ObjectAnimator.ofFloat(view1, "alpha", 0.5f).apply {
                duration = 1000
                start()
            }
        }
    }
    fun bar(vararg smt : Int){

    }
}