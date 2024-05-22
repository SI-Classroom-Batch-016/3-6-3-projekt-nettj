package com.joxoo.outtrac

import com.joxoo.outtrac.adapter.TabPagerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.joxoo.outtrac.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)

        setUpTabs()

    }

    private fun setUpTabs() {
        Log.d("MainActivity", "Setting up tabs ${binding.tabLayout2.tabCount}")
        val adapter = TabPagerAdapter(this, binding.tabLayout2.tabCount)
        binding.viewPager.adapter = adapter
        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                val tab = binding.tabLayout2.getTabAt(position)
                binding.tabLayout2.selectTab(tab)
                binding.toolbar.title = tab?.contentDescription ?: "OutTrac"
            }
        })

        binding.tabLayout2.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                Log.d("MainActivity", "Tab ${tab.position} selected")
                binding.viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })

    }
}