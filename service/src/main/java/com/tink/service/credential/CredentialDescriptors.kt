package com.tink.service.credential

import android.net.Uri
import com.tink.model.credential.Credential

data class CredentialCreationDescriptor(
    val providerName: String,
    val type: Credential.Type,
    val fields: Map<String, String>,
    val appUri: Uri
)

data class CredentialUpdateDescriptor(
    val id: String,
    val fields: Map<String, String>,
    val appUri: Uri
)
