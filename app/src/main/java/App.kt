package com.javiersc.catalogs.sample.app

import com.javiersc.catalogs.sample.core.network.Network
import com.javiersc.catalogs.sample.features.user.User
import com.javiersc.catalogs.sample.features.users.Users

class App {
    val users = Users()
    val user = User()
    val config = Network().config()
}
