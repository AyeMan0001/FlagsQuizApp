package eu.tutorials.myquizapp
//here i have to define what kind of parameters i have for my quesion
//what information i need
//what the question consist of
//Data model
data class Question(
    val id: Int,
    val question: String,
    //images will be an int which means a location inside of our resources
    val image: Int,
    val optionOne:String,
    val optionTwo:String,
    val optionThree:String,
    val optionFour:String,
    //the anser going to hold the index of the option
    val correctAnswer: Int

)
