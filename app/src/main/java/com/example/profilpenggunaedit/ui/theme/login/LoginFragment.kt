package com.example.profilpenggunaedit.ui.theme.login

import android.os.Bundle
import android.view.*
import android.widget.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.profilpenggunaedit.R
import com.example.profilpenggunaedit.ui.theme.profile.ProfileViewModel

class LoginFragment : Fragment() {

    private val viewModel: ProfileViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val etUsername = view.findViewById<EditText>(R.id.et_username)
        val btnLogin = view.findViewById<Button>(R.id.btn_login)

        btnLogin.setOnClickListener {
            val name = etUsername.text.toString().trim()
            if (name.isEmpty()) {
                Toast.makeText(requireContext(), "Nama tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            } else {
                viewModel.setName(name)
                viewModel.setDesc("") // reset deskripsi agar tidak reuse dari sebelumnya
                findNavController().navigate(R.id.action_loginFragment_to_profileFragment)
            }
        }
    }
}
