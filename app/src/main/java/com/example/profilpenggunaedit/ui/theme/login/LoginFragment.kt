package com.example.profilpenggunaedit.ui.theme.login

import android.os.Bundle
import android.os.Vibrator
import android.view.*
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.profilpenggunaedit.R
import com.example.profilpenggunaedit.ui.theme.profile.ProfileViewModel
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginFragment : Fragment() {

    private val viewModel: ProfileViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_login, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val etUsername = view.findViewById<TextInputEditText>(R.id.et_username)
        val etPassword = view.findViewById<TextInputEditText>(R.id.et_password)
        val tilUsername = view.findViewById<TextInputLayout>(R.id.til_username)
        val tilPassword = view.findViewById<TextInputLayout>(R.id.til_password)
        val btnLogin = view.findViewById<View>(R.id.btn_login)

        val shake = AnimationUtils.loadAnimation(requireContext(), R.anim.shake)

        btnLogin.setOnClickListener {
            val name = etUsername.text.toString().trim()
            val password = etPassword.text.toString().trim()
            var valid = true

            if (name.isEmpty()) {
                tilUsername.error = "Username tidak boleh kosong"
                etUsername.startAnimation(shake)
                valid = false
            } else {
                tilUsername.error = null
            }

            if (password.isEmpty()) {
                tilPassword.error = "Password tidak boleh kosong"
                etPassword.startAnimation(shake)
                valid = false
            } else {
                tilPassword.error = null
            }

            if (valid) {
                viewModel.setName(name)
                viewModel.setDesc("")
                findNavController().navigate(R.id.action_loginFragment_to_profileFragment)
            }
        }
    }
}
