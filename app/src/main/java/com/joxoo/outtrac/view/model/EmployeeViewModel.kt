package com.joxoo.outtrac.view.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.joxoo.outtrac.data.model.Datasource
import com.joxoo.outtrac.data.model.Employee


class EmployeeViewModel: ViewModel() {

    private val _employees = MutableLiveData<List<Employee>>(Datasource().getEmployees())
    val employees: LiveData<List<Employee>>
        get() = _employees

    private var _selectedEmployee = MutableLiveData<Employee>()
    val selectedEmployee: LiveData<Employee>
        get() = _selectedEmployee


    fun selectedEmployees(it: Employee) {
        _selectedEmployee.value = it

    }

}