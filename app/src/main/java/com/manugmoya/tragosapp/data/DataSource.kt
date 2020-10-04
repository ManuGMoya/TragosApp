package com.manugmoya.tragosapp.data

import com.manugmoya.tragosapp.data.model.Drink
import com.manugmoya.tragosapp.vo.Resource

class DataSource {


    private val generateTragoslist = listOf(
        Drink("https://cdn5.recetasdeescandalo.com/wp-content/uploads/2018/09/Coctel-margarita-como-prepararlo.-Receta-e-ingredientes.jpg","Margarita","con azucar, vodka y nueces"),
        Drink("https://images.clarin.com/2020/04/07/fernet-con-cola-el-trago___64p5_UOyq2_340x340__1.jpg","Fernet","con coca y 2 hielos"),
        Drink("https://k30.kn3.net/taringa/0/0/7/5/A/B/cocopumita/17B.jpg","Toro","Toro con pritty"),
        Drink("https://esteralcaniz.files.wordpress.com/2012/02/ii.jpg?w=584","Gancia","Gancoia copn sprite")
    )

    fun getTragosList(): Resource<List<Drink>>{
        return Resource.Success(generateTragoslist)
    }
}