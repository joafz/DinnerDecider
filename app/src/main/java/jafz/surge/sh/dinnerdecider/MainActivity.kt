package jafz.surge.sh.dinnerdecider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Korean", "Thai", "Persian", "Fast Food")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //selectedFoodTxt.text = "Hey there!"
        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener {
            //gets the input from the text field and convert it into string
            val newFood = addFoodTxt.text.toString()
            //then add the input to the foodList array
            foodList.add(newFood)
            //Clear the text field after it's done
            addFoodTxt.text.clear()
            println(foodList)
        }


    }
}

