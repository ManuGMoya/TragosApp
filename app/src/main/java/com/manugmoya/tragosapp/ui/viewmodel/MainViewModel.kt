package com.manugmoya.tragosapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.manugmoya.tragosapp.domain.Repo
import com.manugmoya.tragosapp.vo.Resource
import com.manugmoya.tragosapp.vo.Resource.Failure
import kotlinx.coroutines.Dispatchers

class MainViewModel(private val repo: Repo):ViewModel() {

    val fetchTragosList= liveData(Dispatchers.IO) {
        emit(Resource.Loading())

        try {
            emit(repo.getTragosList())
        }catch (e: Exception){
            emit(Failure(e))
        }
    }

}