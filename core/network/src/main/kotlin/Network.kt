package com.javiersc.catalogs.sample.core.network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class Network {

    fun config(): Retrofit =
        Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create()).build()
}
