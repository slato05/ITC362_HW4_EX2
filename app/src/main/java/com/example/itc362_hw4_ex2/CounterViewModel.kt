package com.example.itc362_hw4_ex2

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

private const val TAG = "CounterViewModel"
const val TEAM_A_SCORE_KEY = "TEAM_A_SCORE_KEY"
const val TEAM_B_SCORE_KEY = "TEAM_B_SCORE_KEY"

class CounterViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    /*
    init{
        Log.d(TAG, "viewModel instance created")
    }
    */

    // Getters and setters for scoreTeamA and scoreTeamB variables, set to zero if has no value
    public var scoreTeamA: Int
        get() = savedStateHandle.get(TEAM_A_SCORE_KEY) ?: 0
        set(value) = savedStateHandle.set(TEAM_A_SCORE_KEY, value)

    public var scoreTeamB: Int
        get() = savedStateHandle.get(TEAM_B_SCORE_KEY) ?: 0
        set(value) = savedStateHandle.set(TEAM_B_SCORE_KEY, value)


    //var scoreTeamA = 0
    //var scoreTeamB = 0

}