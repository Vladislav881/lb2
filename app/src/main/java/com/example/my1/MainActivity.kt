package com.example.my1

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.*


class MainActivity : AppCompatActivity() {

    lateinit var log_in: Button
    lateinit var Password: com.google.android.material.textfield.TextInputEditText
    lateinit var login: EditText
    lateinit var toggleButton: ToggleButton
    lateinit var toggleButton2: ToggleButton
    lateinit var back: androidx.constraintlayout.widget.ConstraintLayout

    @SuppressLint("SetTextI18n", "RtlHardcoded", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        log_in = findViewById(R.id.log_in)
        login = findViewById(R.id.login)
        Password = findViewById(R.id.Password)
        toggleButton = findViewById(R.id.toggleButton)
        toggleButton2 = findViewById(R.id.toggleButton2)
        back = findViewById(R.id.back)

        back.setBackgroundColor(Color.WHITE)

        toggleButton.isChecked
        log_in.setOnClickListener{
            val msg: String = Password.text.toString()
            val msgg: String = login.text.toString()
            if ((msg.trim().isNotEmpty()) and (msgg.trim().isNotEmpty())) {
                Toast.makeText(applicationContext, " wrong login or password ", Toast.LENGTH_SHORT).show()
            }else if (msg.trim().isNotEmpty()){
                Toast.makeText(applicationContext, " enter login ", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, " enter password ", Toast.LENGTH_SHORT).show()
            }
        }
        login.gravity = Gravity.RIGHT
        Password.gravity = Gravity.RIGHT

        toggleButton2.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                back.setBackgroundColor(Color.GRAY)
            }
            else{
                back.setBackgroundColor(Color.WHITE)
            }
        })
        toggleButton.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                login.hint = "логин"
                log_in.text = "Вход"

                log_in.setOnClickListener{
                    val msg: String = Password.text.toString()
                    val msgg: String = login.text.toString()
                    if ((msg.trim().isNotEmpty()) and (msgg.trim().isNotEmpty())) {
                        Toast.makeText(applicationContext, " неверный логин или пароль ", Toast.LENGTH_SHORT).show()
                    }else if (msg.trim().isNotEmpty()){
                        Toast.makeText(applicationContext, " введите логин ", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(applicationContext, " введите пароль ", Toast.LENGTH_SHORT).show()
                    }
                }
                login.gravity = Gravity.LEFT
                Password.gravity = Gravity.LEFT
            } else {
                login.setHint("login")
                log_in.text = "log in"

                log_in.setOnClickListener{
                    val msg: String = Password.text.toString()
                    val msgg: String = login.text.toString()
                    if ((msg.trim().isNotEmpty()) and (msgg.trim().isNotEmpty())) {
                        Toast.makeText(applicationContext, " wrong login or password ", Toast.LENGTH_SHORT).show()
                    }else if (msg.trim().isNotEmpty()){
                        Toast.makeText(applicationContext, " enter login ", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(applicationContext, " enter password ", Toast.LENGTH_SHORT).show()
                    }
                }
                login.gravity = Gravity.RIGHT
                Password.gravity = Gravity.RIGHT
            }
        })


    }
}

