package com.example.chapter6_topic2_proto

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class UserViewModel(application: Application) : AndroidViewModel(application) {

    private val repo = UserPreferencesRepository(application)

    suspend fun editData(name : String){
        repo.saveData(name)
    }
}