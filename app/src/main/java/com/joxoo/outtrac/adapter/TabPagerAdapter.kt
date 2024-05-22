package com.joxoo.outtrac.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.joxoo.outtrac.EmployeeFragment
import  com.joxoo.outtrac.HomeFragment
import  com.joxoo.outtrac.ObjectFragment

class TabPagerAdapter (fragmentActivity: FragmentActivity, private val tabCount: Int) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = tabCount
    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                return HomeFragment()
            }
            2 -> {
                return ObjectFragment()
            }
            3 -> {
                return EmployeeFragment()
            }
            else -> {
                return HomeFragment()
            }
        }
    }
}