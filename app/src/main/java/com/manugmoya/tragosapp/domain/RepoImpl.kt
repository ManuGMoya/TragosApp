package com.manugmoya.tragosapp.domain

import com.manugmoya.tragosapp.data.DataSource
import com.manugmoya.tragosapp.data.model.Drink
import com.manugmoya.tragosapp.vo.Resource

class RepoImpl(private val dataSource: DataSource) : Repo {

    override fun getTragosList(): Resource<List<Drink>> {
        return dataSource.getTragosList()
    }
}