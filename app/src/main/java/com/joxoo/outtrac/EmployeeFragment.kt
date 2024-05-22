package  com.joxoo.outtrac

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.joxoo.outtrac.adapter.EmployeeItemAdapter
import com.joxoo.outtrac.data.model.Datasource
import com.joxoo.outtrac.databinding.FragmentEmployeeBinding


class EmployeeFragment : Fragment() {

    lateinit var binding: FragmentEmployeeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEmployeeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dataSource = Datasource().getEmployees()

        binding.employeeRV.adapter = EmployeeItemAdapter(dataSource) {}
    }


}