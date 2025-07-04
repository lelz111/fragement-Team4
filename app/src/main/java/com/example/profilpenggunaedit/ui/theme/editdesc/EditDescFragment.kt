package com.example.profilpenggunaedit.ui.theme.editdesc

import android.os.Bundle
import android.view.*
import android.widget.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.profilpenggunaedit.R
import com.example.profilpenggunaedit.ui.theme.profile.ProfileViewModel

class EditDescFragment : Fragment() {

    private val viewModel: ProfileViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_edit_desc, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val etDesc = view.findViewById<EditText>(R.id.et_edit_desc)
        val btnSave = view.findViewById<Button>(R.id.btn_save_desc)

        // Set default value
        etDesc.setText(viewModel.desc.value.orEmpty())

        btnSave.setOnClickListener {
            val desc = etDesc.text.toString().trim()
            if (desc.isEmpty()) {
                Toast.makeText(requireContext(), "Deskripsi tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            } else {
                viewModel.setDesc(desc)
                findNavController().popBackStack()
            }
        }
    }
}
