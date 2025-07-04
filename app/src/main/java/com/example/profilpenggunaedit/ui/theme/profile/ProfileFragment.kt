package com.example.profilpenggunaedit.ui.theme.profile

import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.profilpenggunaedit.R

class ProfileFragment : Fragment() {

    private val viewModel: ProfileViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val tvName = view.findViewById<TextView>(R.id.tv_username)
        val tvDesc = view.findViewById<TextView>(R.id.tv_description)
        val btnEditName = view.findViewById<Button>(R.id.btn_edit_name)
        val btnEditDesc = view.findViewById<Button>(R.id.btn_edit_desc)
        val btnAbout = view.findViewById<Button>(R.id.btn_about)

        viewModel.name.observe(viewLifecycleOwner) { tvName.text = "Nama: $it" }
        viewModel.desc.observe(viewLifecycleOwner) { tvDesc.text = "Deskripsi: $it" }

        btnEditName.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_editNameFragment)
        }

        btnEditDesc.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_editDescFragment)
        }

        btnAbout.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_aboutFragment)
        }
    }
}
