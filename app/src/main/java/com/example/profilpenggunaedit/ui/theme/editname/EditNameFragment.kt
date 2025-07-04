package com.example.profilpenggunaedit.ui.theme.editname

import android.os.Bundle
import android.view.*
import android.widget.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.profilpenggunaedit.R
import com.example.profilpenggunaedit.ui.theme.profile.ProfileViewModel

class EditNameFragment : Fragment() {

    private val viewModel: ProfileViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_edit_name, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val etName = view.findViewById<EditText>(R.id.et_edit_name)
        val btnSave = view.findViewById<Button>(R.id.btn_save_name)

        // Set default value
        etName.setText(viewModel.name.value.orEmpty())

        btnSave.setOnClickListener {
            val name = etName.text.toString().trim()
            if (name.isEmpty()) {
                Toast.makeText(requireContext(), "Nama tidak boleh kosong", Toast.LENGTH_SHORT).show()
            } else {
                viewModel.setName(name)
                findNavController().popBackStack()
            }
        }
    }
}
