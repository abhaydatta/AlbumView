package com.wwt.album.data.util

import java.util.*

fun String.getUrl() = String(Base64.getDecoder().decode(this))