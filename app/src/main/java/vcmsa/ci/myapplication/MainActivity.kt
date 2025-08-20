package vcmsa.ci.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val editTextText = findViewById<EditText>(R.id.editTextText)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val day = editTextText.text.toString().trim().lowercase()


            val movie = when (day) {
                "monday" -> "Watch Inception"
                "tuesday" -> "Watch The Dark Knight Rises"
                "wednesday" -> "Watch Interstellar"
                "thursday" -> "Watch The Matrix"
                "friday" -> "Watch Avengers END GAME"
                else -> "Invalid day! Please enter a valid day"

            }

            textView2.text = movie
        }
    }
}

