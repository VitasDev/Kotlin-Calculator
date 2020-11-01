package com.cubesolver.kotlincalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sum: BigDecimal

        btnPlus.setOnClickListener {
            if (checkEmpty()) {
                sum = firstnumber.text.toString().trim().toBigDecimal() + secondnumber.text.toString().trim().toBigDecimal()
                result.setText("$sum")
            }
        }

        btnMinus.setOnClickListener {
            if (checkEmpty()) {
                sum = firstnumber.text.toString().trim().toBigDecimal() - secondnumber.text.toString().trim().toBigDecimal()
                result.setText("$sum")
            }
        }

        btnMultiply.setOnClickListener {
            if (checkEmpty()) {
                sum = firstnumber.text.toString().trim().toBigDecimal() * secondnumber.text.toString().trim().toBigDecimal()
                result.setText("$sum")
            }
        }

        btnDivision.setOnClickListener {
            if (checkEmpty()) {
                var sum2: Double = firstnumber.text.toString().trim().toDouble() / secondnumber.text.toString().trim().toDouble()
                result.setText("$sum2")
            }
        }

        btnPercent.setOnClickListener {
            if (checkEmpty()) {
                sum = firstnumber.text.toString().trim().toBigDecimal() % secondnumber.text.toString().trim().toBigDecimal()
                result.setText("$sum")
            }
        }

    }

    fun checkEmpty(): Boolean {
        if (firstnumber.text.isEmpty() || secondnumber.text.isEmpty()) {
            Toast.makeText(this,"Please insert number!",Toast.LENGTH_SHORT).show()
            return false
        } else {
            return true
        }
    }
}