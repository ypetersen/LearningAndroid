package yannick.de.mytraining

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : Activity() {

    val trainingList = ArrayList<String>()

    fun initTestTrainingList() {
        trainingList.add("Brust Bizeps")
        trainingList.add("Rücken Triceps")
        trainingList.add("Bauch Beine")

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initTestTrainingList()

    }

    fun openTraining() {
        intent = Intent(this, TrainingActivity::class.java)
        startActivity(intent)
    }
}

