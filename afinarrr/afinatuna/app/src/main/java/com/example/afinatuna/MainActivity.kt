package com.example.afinatuna

import android.os.Bundle
import android.view.View // Importa la clase View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.afinatuna.databinding.ActivityMainBinding

private lateinit var textView3: TextView
private val afinaciones = listOf( "Estandar EADGBE", "Afinacion 2", "Afinacion 3")
private var currentAfinacionIndex = 0
private lateinit var siguienteButton: Button // Variable para el botón "Siguiente"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textView3 = findViewById(R.id.textView3)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        siguienteButton = findViewById(R.id.button) // Inicializa la variable

        updateTextView()

        button2.setOnClickListener {
            currentAfinacionIndex = (currentAfinacionIndex + 1) % afinaciones.size
            updateTextView()
        }

        button3.setOnClickListener {
            currentAfinacionIndex = if (currentAfinacionIndex - 1 < 0) afinaciones.size - 1 else currentAfinacionIndex - 1
            updateTextView()
        }
    }

    private fun updateTextView() {
        textView3.text = afinaciones[currentAfinacionIndex]
    }
}