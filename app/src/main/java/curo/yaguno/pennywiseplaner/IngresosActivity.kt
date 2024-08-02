package curo.yaguno.pennywiseplaner

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class IngresosActivity : AppCompatActivity() {

    private lateinit var dbHelper:DataBaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresos)

        dbHelper = DataBaseHelper(this)
        val Usuario = intent.getIntExtra("ayuda", -1)

        findViewById<ImageView>(R.id.iv_menu).setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            intent.putExtra("Usuario",Usuario)
            startActivity(intent)
        }
        findViewById<ImageView>(R.id.iv_home).setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("Usuario",Usuario)
            startActivity(intent)
        }

        findViewById<CardView>(R.id.Salario).setOnClickListener {
            val Gasto = "Salario"
            val intent = Intent(this, IngresarGastosActivity::class.java)
            intent.putExtra("Usuario",Usuario)
            intent.putExtra("Gasto",Gasto)
            startActivity(intent)
        }
        findViewById<CardView>(R.id.Intereses).setOnClickListener {
            val Gasto = "Intereses"
            val intent = Intent(this, IngresarGastosActivity::class.java)
            intent.putExtra("Usuario",Usuario)
            intent.putExtra("Gasto",Gasto)
            startActivity(intent)
        }
        findViewById<CardView>(R.id.Regalo).setOnClickListener {
            val Gasto = "Regalo"
            val intent = Intent(this, IngresarGastosActivity::class.java)
            intent.putExtra("Usuario",Usuario)
            intent.putExtra("Gasto",Gasto)
            startActivity(intent)
        }
        findViewById<CardView>(R.id.Otros).setOnClickListener {
            val Gasto = "Otro"
            val intent = Intent(this, IngresarGastosActivity::class.java)
            intent.putExtra("Usuario",Usuario)
            intent.putExtra("Gasto",Gasto)
            startActivity(intent)
        }
    }
}