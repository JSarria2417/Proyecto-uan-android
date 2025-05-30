package com.example.afinatuna

import android.media.MediaPlayer // Importa MediaPlayer
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
// Asegúrate de que esta importación de R sea la correcta para tu proyecto.
// Si Android Studio muestra un error aquí, podría ser 'import com.example.afinatuna.R'
// o simplemente asegúrate que el paquete de la actividad es el correcto.

class segunda : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segunda) // Asegúrate que este sea el nombre correcto de tu layout XML

        // Configuración para el Edge-to-Edge
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // --- Lógica para los ImageButton ---

        // Obtener referencias a los ImageButton desde el layout
        val buttonBotona: ImageButton = findViewById(R.id.button_botona)
        val buttonBotonb: ImageButton = findViewById(R.id.button_botonb)
        val buttonBotond: ImageButton = findViewById(R.id.button_botond)
        val buttonBotone: ImageButton = findViewById(R.id.button_botone)
        val buttonBotone2: ImageButton = findViewById(R.id.button_botone2)
        val buttonBotong: ImageButton = findViewById(R.id.button_botong)

        // Configurar OnClickListeners para cada botón
        buttonBotona.setOnClickListener {
            Toast.makeText(this, "Botón A presionado", Toast.LENGTH_SHORT).show()
            playSound(R.raw.audioa) // REEMPLAZA 'sonido_a' con el nombre de tu archivo de sonido para el botón A
        }

        buttonBotonb.setOnClickListener {
            Toast.makeText(this, "Botón B presionado", Toast.LENGTH_SHORT).show()
            playSound(R.raw.audiob) // REEMPLAZA 'sonido_b' con el nombre de tu archivo de sonido para el botón B
        }

        buttonBotond.setOnClickListener {
            Toast.makeText(this, "Botón D presionado", Toast.LENGTH_SHORT).show()
            playSound(R.raw.audiod) // REEMPLAZA 'sonido_d' con el nombre de tu archivo de sonido para el botón D
        }

        buttonBotone.setOnClickListener {
            Toast.makeText(this, "Botón E presionado", Toast.LENGTH_SHORT).show()
            playSound(R.raw.audioe) // REEMPLAZA 'sonido_e' con el nombre de tu archivo de sonido para el botón E
        }

        buttonBotone2.setOnClickListener {
            Toast.makeText(this, "Botón E2 presionado", Toast.LENGTH_SHORT).show()
            playSound(R.raw.audioe2) // REEMPLAZA 'sonido_e2' con el nombre de tu archivo de sonido para el botón E2
        }

        buttonBotong.setOnClickListener {
            Toast.makeText(this, "Botón G presionado", Toast.LENGTH_SHORT).show()
            playSound(R.raw.audiog) // REEMPLAZA 'sonido_g' con el nombre de tu archivo de sonido para el botón G
        }
    }

    private fun playSound(soundResourceId: Int) {
        // Detiene y libera el MediaPlayer si ya está reproduciendo algo
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null

        // Crea y inicia un nuevo MediaPlayer
        mediaPlayer = MediaPlayer.create(this, soundResourceId)
        mediaPlayer?.setOnCompletionListener {
            // Libera el MediaPlayer cuando la reproducción haya terminado
            it.release()
            mediaPlayer = null // Importante para evitar problemas si se pulsa rápido
        }
        mediaPlayer?.start()
    }

    override fun onStop() {
        super.onStop()
        // Libera el MediaPlayer cuando la Activity ya no esté visible
        // para evitar fugas de memoria y que el sonido siga reproduciéndose.
        mediaPlayer?.release()
        mediaPlayer = null
    }
}