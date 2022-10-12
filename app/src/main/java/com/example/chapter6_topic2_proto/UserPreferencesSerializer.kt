package com.example.chapter6_topic2_proto

import androidx.datastore.core.Serializer
import java.io.InputStream
import java.io.OutputStream
import androidx.datastore.core.CorruptionException
import com.google.protobuf.InvalidProtocolBufferException

object UserPreferencesSerializer : Serializer<UserPreferences> {
    override val defaultValue: UserPreferences = UserPreferences.getDefaultInstance()
    override suspend fun readFrom(input: InputStream): UserPreferences {
        try {
            return UserPreferences.parseFrom(input)
        } catch (exception: InvalidProtocolBufferException) {
            throw CorruptionException("Cannot read proto.", exception)
        }
    }

    override suspend fun writeTo(t: UserPreferences, output: OutputStream) = t.writeTo(output)
}