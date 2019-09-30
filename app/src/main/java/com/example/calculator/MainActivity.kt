package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.ArithmeticException

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {

    var inDisplay = "0"
    var new: Boolean = true
  //  var operator = Boolean true
    //var inError = Boolean false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    
    fun clear(){
        inDisplay = "0"
        display.text = inDisplay
        new = true
    }

    fun total(){
        val answer = ExpressionBuilder(inDisplay).build()

        try {
            val check = answer.evaluate()
            inDisplay = check.toString()
            display.text = inDisplay

      } catch (ex: ArithmeticException) {
           val fail = "ERRoR"
           display.text = fail
           //inError = true
      }
    }
/*
    fun useOperater(o: String) {
        if (!new || operator) {
            display.text = inDisplay
            operator = true
        } else {
            inDisplay += o
            display.text = inDisplay
        }
    }
*/
    fun toDisplay(a: String) = if(new){
        inDisplay = a
        display.text = inDisplay
        new = false
    }
    else {
        inDisplay += a
        display.text = inDisplay
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.button0 -> toDisplay("0")
            R.id.button1 -> toDisplay("1")
            R.id.button2 -> toDisplay("2")
            R.id.button3 -> toDisplay("3")
            R.id.button4 -> toDisplay("4")
            R.id.button5 -> toDisplay("5")
            R.id.button6 -> toDisplay("6")
            R.id.button7 -> toDisplay("7")
            R.id.button8 -> toDisplay("8")
            R.id.button9 -> toDisplay("9")
            R.id.buttonA -> toDisplay("+")
            R.id.buttonS -> toDisplay("-")
            R.id.buttonM -> toDisplay("*")
            R.id.buttonD -> toDisplay("/")
            R.id.buttonP -> toDisplay(".")
            R.id.buttonE -> total()
            R.id.buttonC -> clear()
        }
    }
}
