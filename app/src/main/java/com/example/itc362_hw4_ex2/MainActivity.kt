package com.example.itc362_hw4_ex2

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.itc362_hw4_ex2.databinding.ActivityMainBinding

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val counterViewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(TAG, "Got a CounterViewModel: $counterViewModel")

        // Display the scores for each team upon onCreate() function call
        displayForTeamA(counterViewModel.scoreTeamA)
        displayForTeamB(counterViewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View?) {
        //use scoreTeamA variable from counterViewModel
        counterViewModel.scoreTeamA++
        displayForTeamA(counterViewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View?) {
        //use scoreTeamA variable from counterViewModel
        counterViewModel.scoreTeamA += 2
        displayForTeamA(counterViewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View?) {
        //use scoreTeamA variable from counterViewModel
        counterViewModel.scoreTeamA += 3
        displayForTeamA(counterViewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View?) {
        //use scoreTeamB variable from counterViewModel
        counterViewModel.scoreTeamB++
        displayForTeamB(counterViewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View?) {
        //use scoreTeamB variable from counterViewModel
        counterViewModel.scoreTeamB += 2
        displayForTeamB(counterViewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View?) {
        //use scoreTeamB variable from counterViewModel
        counterViewModel.scoreTeamB += 3
        displayForTeamB(counterViewModel.scoreTeamB)
    }

    /**
     * Resets the score for both teams back to 0.
     */
    fun resetScore(v: View?) {
        //reset scoreTeamA and scoreTeamB variables from counterViewModel
        counterViewModel.scoreTeamA = 0
        counterViewModel.scoreTeamB = 0
        displayForTeamA(counterViewModel.scoreTeamA)
        displayForTeamB(counterViewModel.scoreTeamB)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = binding.teamAScore
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = binding.teamBScore
        scoreView.text = score.toString()
    }
}