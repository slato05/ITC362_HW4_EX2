package com.example.itc362_hw4_ex2

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

private const val TAG = "CounterViewModel"
const val TEAM_A_SCORE_KEY = "TEAM_A_SCORE_KEY"
const val TEAM_B_SCORE_KEY = "TEAM_B_SCORE_KEY"

class CounterViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    init{
        Log.d(TAG, "viewModel instance created")
    }


}