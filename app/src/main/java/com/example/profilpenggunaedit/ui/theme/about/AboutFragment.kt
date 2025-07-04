package com.example.profilpenggunaedit.ui.theme.about

import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.profilpenggunaedit.R

class AboutFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val tvAbout = view.findViewById<TextView>(R.id.tv_about)
        tvAbout.text = "Aplikasi ini dikembangkan untuk latihan fragment dan ViewModel."
    }
}
