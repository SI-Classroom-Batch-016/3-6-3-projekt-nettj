package com.joxoo.outtrac

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.google.android.material.appbar.MaterialToolbar
import com.joxoo.outtrac.data.model.Employee
import com.joxoo.outtrac.data.model.Person
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
            binding.employeeAddressTV.text = getEmployeeAddress(it.person)
            binding.employeeOrtTV.text = it.person.address.city
            binding.circularProgressBar.progress = employeeStatus(it)
        }

        requireActivity().findViewById<MaterialToolbar>(R.id.toolbar).title = viewModel.selectedEmployee.value?.person?.firstname

    }

    private fun getFullName(employee: Employee): String {
        return "${employee.person.firstname} ${employee.person.lastname}"
    }

    private fun getEmployeeAddress(person: Person): String {
        return person.address.street
    }

    private fun employeeStatus(employee: Employee): Float {
        return employee.workLogSummary.workedMonthHours
    }



}