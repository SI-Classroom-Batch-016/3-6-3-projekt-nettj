package com.joxoo.outtrac

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.joxoo.outtrac.adapter.ObjectItemAdapter
import com.joxoo.outtrac.databinding.FragmentObjectBinding


class ObjectFragment : Fragment() {

    lateinit var binding: FragmentObjectBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentObjectBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.listRV.adapter = ObjectItemAdapter()
    }
}