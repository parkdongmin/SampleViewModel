package com.example.sampleviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // AndroidViewModel()을 상속받을 경우
    // class MainViewModel( application: Application) : AndroidViewModel(application){}
    var count = MutableLiveData<Int>()
    init {
        count.value = 0
    }

    fun plus(){
        count.value = count.value?.plus(1)
    }

    fun minus(){
        count.value = count.value?.minus(1)
    }

}