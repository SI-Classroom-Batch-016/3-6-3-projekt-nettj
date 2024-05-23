package com.joxoo.outtrac

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.joxoo.outtrac.data.model.Employee
import com.joxoo.outtrac.databinding.FragmentEmployeeDetailBinding
import com.joxoo.outtrac.view.model.EmployeeViewModel


class EmployeeDetailFragment : Fragment() {

    private lateinit var binding: FragmentEmployeeDetailBinding
    private val viewModel: EmployeeViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEmployeeDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.selectedEmployee.observe(viewLifecycleOwner) {
            binding.employeeNameTV.text = getFullName(it)
        }

    }

    private fun getFullName(employee: Employee): String {
        return "${employee.person.firstname} ${employee.person.lastname}"
    }

}