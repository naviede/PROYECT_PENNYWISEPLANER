package curo.yaguno.pennywiseplaner

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class IngresarGastosActivity : AppCompatActivity() {

    private lateinit var dbHelper:DataBaseHelper
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ingresar_gastos)

        dbHelper = DataBaseHelper(this)
        val Usuario0 = intent.getIntExtra("Usuario", -1)
        val Gasto = intent.getStringExtra("Gasto") ?: ""
        val Operacion0 = findViewById<TextView>(R.id.nombre)
        Operacion0.text = Gasto
        val Dineroo = findViewById<EditText>(R.id.dinero)

        findViewById<Button>(R.id.Guardar).setOnClickListener {
            val Dinero = Dineroo.text.toString().toIntOrNull() ?: 0
            dbHelper.insertGasto(Usuario0, Gasto, Dinero)
            finish()
        }

    }
}