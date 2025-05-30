package com.example.afinatuna

import android.content.Intent // Importa la clase Intent
import android.os.Bundle
// import android.view.View // No es estrictamente necesario para este cambio específico si no lo usas directamente
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.afinatuna.databinding.ActivityMainBinding // Asegúrate que esta clase exista y esté configurada

// Estas variables globales podrían causar problemas si la Activity se recrea.
// Considera usar ViewModel o onSaveInstanceState para mantener el estado.
private lateinit var textView3: TextView
private val afinaciones = listOf( "Estandar EADGBE", "Afinacion 2", "Afinacion 3")
private var currentAfinacionIndex = 0
// private lateinit var siguienteButton: Button // Ya tienes 'binding.button' o puedes obtenerla localmente

class MainActivity : AppCompatActivity() {
    // Es recomendable usar View Binding para acceder a las vistas
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // Infla el binding
        enableEdgeToEdge()
        setContentView(binding.root) // Usa la raíz del binding

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets -> // Usa binding.main
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Accede a las vistas a través del binding
        textView3 = binding.textView3 // Si aún necesitas la referencia global
        // val button2: Button = binding.button2 // Ya no es necesario si usas binding directamente en el listener
        // val button3: Button = binding.button3 // Igual que arriba
        // siguienteButton = binding.button // Igual que arriba

        updateTextView()

        binding.button2.setOnClickListener {
            currentAfinacionIndex = (currentAfinacionIndex + 1) % afinaciones.size
            updateTextView()
        }

        binding.button3.setOnClickListener {
            currentAfinacionIndex = if (currentAfinacionIndex - 1 < 0) afinaciones.size - 1 else currentAfinacionIndex - 1
            updateTextView()
        }

        // --- INICIO DEL CÓDIGO AÑADIDO ---
        // Configura el OnClickListener para el botón "Siguiente"
        binding.button.setOnClickListener {
            // Crea un Intent para iniciar la SegundaActivity
            // Asegúrate de haber creado una Activity llamada "SegundaActivity"
            val intent = Intent(this, segunda::class.java)

            // Puedes pasar datos a la siguiente Activity si lo necesitas. Por ejemplo:
            // intent.putExtra("AFINACION_SELECCIONADA", afinaciones[currentAfinacionIndex])

            startActivity(intent)
        }
        // --- FIN DEL CÓDIGO AÑADIDO ---
    }

    private fun updateTextView() {
        // Asegúrate que textView3 esté inicializada antes de usarla
        if (::textView3.isInitialized) {
            textView3.text = afinaciones[currentAfinacionIndex]
        }
    }
}