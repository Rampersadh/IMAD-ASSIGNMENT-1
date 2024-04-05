package com.divs.employeeapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //declear
    private lateinit var searchButton: Button
    private lateinit var resultTextview: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        //initialise
        searchButton = findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearbutton)
        ageInput = findViewById(R.id.ageInput)
        resultTextview = findViewById(R.id.resultTextView)



        searchButton.setOnClickListener {
            //create a variable of age to get value form user
            val age = ageInput.text.toString().toIntOrNull()

            //if age is not null and age is in the range between 20 and 50
            if (age != null && age in 20..80) {

                val actorsName = when (age) {

                    24 -> "James Dean. He is an American Actor. He is remembered as a cultural icon of teenage disillusionment ans social estrangement."
                    33 -> "Bruce Lee. He was the most popular martial artist of all time. He inspired millions of people and brought attention to martial arts in the western world."
                    73 -> "Gary Graham. He was born in Long Beach, California,Usa. He was an actor and producer. He was married to Becky Hopkins first. He was 73 years old when he pass away. "
                    40 -> "Paul Walker. Besides acting, Walker was the face of The Coty Prestige fragrance brand Davidoff Cool Water for men. He also founder the charity Reach Out Worldwide(ROWW), an organization providing relief efforts for ares affected by natural disasters."
                    65 -> "Bob Saget. He acted as Danny Tanner on the sitcom Full House and its sequal Fuller House. Saget was the original host of America's Funniest Home videos."
                    66 -> "Peter Scolari. He was an actor who was best known for his roles as Henry Desmond on Bosom Buddies, Michael Harris on Newhart and Wayne Szalinski on Honey."
                    78 -> "John Langley. He was an American television and film director, writer and producer who was best known as the creator and executive producer of the television show Cops, which premiered on Fox in March 1989."
                    54 -> "Matthew Perry. He was an American and Canadian actor. He gained international fame for starring as Chandler Bing on the NBC television sitcom Friends.He was suffering with a popular mental health trearment across thee U.S. A lower dose of the traditional anestheic has been used to treat symptoms of depression, typically via IV in clinics."
                    76 -> "Carl Weathers. He was an American actor and gridiron football linebacker for the Raiders then moved north to play for the Lions."
                    67 -> "Leslie Jordan. Jordan appeared in movies and television shows and was an accomplished stage actor and playwright."
                    else -> null
                }

                val message = if ( actorsName != null) "The actors name is $actorsName ."
                else "No actor found with the entered age."
                resultTextview.text = message

            } else {
                resultTextview.text = "Invalid input. Please enter a valid age between 20 and 80."
            }
        }
            clearButton.setOnClickListener {
                ageInput.text.clear()
                resultTextview.text = ""
            }

    }
}