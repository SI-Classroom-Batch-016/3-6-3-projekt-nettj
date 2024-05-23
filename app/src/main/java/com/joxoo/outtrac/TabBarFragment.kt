package com.joxoo.outtrac

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.tabs.TabLayout
import com.joxoo.outtrac.adapter.TabPagerAdapter
import com.joxoo.outtrac.databinding.FragmentTabBarBinding

class TabBarFragment : Fragment() {

    private lateinit var binding: FragmentTabBarBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTabBarBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpTabs()
    }

    private fun setUpTabs() {
        Log.d("MainActivity", "Setting up tabs ${binding.tabLayout2.tabCount}")
        val adapter = TabPagerAdapter(requireActivity(), binding.tabLayout2.tabCount)
        binding.viewPager.adapter = adapter
        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                val tab = binding.tabLayout2.getTabAt(position)
                binding.tabLayout2.selectTab(tab)
                requireActivity().findViewById<MaterialToolbar>(R.id.toolbar).title = tab?.contentDescription ?: "OutTrac"
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