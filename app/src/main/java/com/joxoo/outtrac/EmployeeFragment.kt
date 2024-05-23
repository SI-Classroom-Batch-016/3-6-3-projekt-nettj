package  com.joxoo.outtrac

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.joxoo.outtrac.adapter.EmployeeListItemAdapter
import com.joxoo.outtrac.databinding.FragmentEmployeeBinding
import com.joxoo.outtrac.view.model.EmployeeViewModel


class EmployeeFragment : Fragment() {

    private lateinit var binding: FragmentEmployeeBinding
    private val viewModel: EmployeeViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEmployeeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val adapter =
            viewModel.employees.value?.let {
                EmployeeListItemAdapter(it, itemClickedCallback = {
                    viewModel.selectedEmployees(it)
                    findNavController().navigate(R.id.action_tabBarFragment_to_employeeDetailFragment)
                })
            }
        binding.employeeRV.adapter = adapter


    }


}