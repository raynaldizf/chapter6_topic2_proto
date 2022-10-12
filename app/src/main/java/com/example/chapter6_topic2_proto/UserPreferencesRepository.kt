package com.example.chapter6_topic2_proto

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.dataStore

class UserPreferencesRepository(private val context: Context) {
    // create data store proto
    private val Context.userPreferencesStore: DataStore<UserPreferences> by dataStore(
        fileName = "userData",
        serializer = UserPreferencesSerializer
    )

    // save data to data store proto
    suspend fun saveData(name : String) {
        context.userPreferencesStore.updateData { preferences ->
            preferences.toBuilder().setName(name).build()
        }
    }
}