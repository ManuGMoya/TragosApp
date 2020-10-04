package com.manugmoya.tragosapp.domain

import com.manugmoya.tragosapp.data.model.Drink
import com.manugmoya.tragosapp.vo.Resource

interface Repo {
    fun getTragosList(): Resource<List<Drink>>
}