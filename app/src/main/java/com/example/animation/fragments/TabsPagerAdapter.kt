package com.example.animation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.animation.view.StarFragment

class TabsPagerAdapter(fm: FragmentManager, lifecycle: Lifecycle, private var numberOfTabs: Int) : FragmentStateAdapter(fm, lifecycle) {

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                // # Animation Fragment
                val bundle = Bundle()
                bundle.putString("fragmentName", "Music Fragment")
                val animationFragment = AnimationFragment()
                animationFragment.arguments = bundle
                return animationFragment
            }
            1 -> {
                // # motion Fragment
                val bundle = Bundle()
                bundle.putString("fragmentName", "Movies Fragment")
                val motionFragment = MotionFragment()
                motionFragment.arguments = bundle
                return motionFragment
            }
            2 -> {
                // # lottie Fragment
                val bundle = Bundle()
                bundle.putString("fragmentName", "Lottie Fragment")
                val lottieFragment = Lottie()
                lottieFragment.arguments = bundle
                return lottieFragment
            }
            3 -> {
                // # custom Fragment
                val bundle = Bundle()
                bundle.putString("fragmentName", "Star Fragment")
                val starFragment = StarFragment()
                starFragment.arguments = bundle
                return starFragment
            }
            else -> return AnimationFragment()
        }
    }

    override fun getItemCount(): Int {
        return numberOfTabs
    }
}