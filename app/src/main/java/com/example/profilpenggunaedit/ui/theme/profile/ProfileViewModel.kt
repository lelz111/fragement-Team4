package com.example.profilpenggunaedit.ui.theme.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {

    private val _name = MutableLiveData<String>()
    private val _desc = MutableLiveData<String>()

    val name: LiveData<String> get() = _name
    val desc: LiveData<String> get() = _desc

    fun setName(name: String) {
        _name.value = name
    }

    fun setDesc(desc: String) {
        _desc.value = desc
    }

    fun clearData() {
        _name.value = ""
        _desc.value = ""
    }
}
