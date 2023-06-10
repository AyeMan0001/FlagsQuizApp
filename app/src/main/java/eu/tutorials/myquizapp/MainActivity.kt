
package eu.tutorials.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //snake case means that we have underscores in the variables like btn_start
        val btnStart : Button = findViewById(R.id.btn_start)
        val etName : EditText = findViewById(R.id.et_name)
        btnStart.setOnClickListener {
            if(etName.text.isEmpty()){
                Toast.makeText(this, "Please Enter your name.", Toast.LENGTH_SHORT).show()
            }else{
                //we make an intent "هدف" and this means we move from somewhere to another
                // the following code means we move from "this" activity to another one
                val intent = Intent(this,QuizQuestionsActivity::class.java)
                //the putextra means we bring with us this information to the next activity
                intent.putExtra(Constants.USER_NAME,etName.text.toString())
                //after intialising the intent we need to go to it by this :
                startActivity(intent)
                //the finish means we can't go back to the main activity
                //finishing the main activity "the previos activity"
                finish()
            }

        }
    }
}