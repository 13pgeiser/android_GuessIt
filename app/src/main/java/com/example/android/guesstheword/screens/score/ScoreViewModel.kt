package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int)  : ViewModel() {
    private val _score = MutableLiveData<Int>()
    val score : LiveData<Int> get()  = _score

    private val _evtPlayAgain = MutableLiveData<Boolean>()
    val evtPlayAgain : LiveData<Boolean> get() = _evtPlayAgain

    init {
        Log.i("ScoreViewModel", "Init! Score: $finalScore")
        _score.value = finalScore
    }

    fun onPlayAgain() {
        _evtPlayAgain.value = true
    }

    fun onPlayAgainComplete() {
        _evtPlayAgain.value = false
    }
}
