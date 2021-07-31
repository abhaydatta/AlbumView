package com.wwt.album.core.models

data class NBError(
    val throwable: Throwable? = null,
    val customMessage: String? = null,
    val statusCode: String? = null,
    val cancelable: Boolean = true
)
