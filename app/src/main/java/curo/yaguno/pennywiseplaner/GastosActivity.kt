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

class GastosActivity : AppCompatActivity() {

    private lateinit var dbHelper:DataBaseHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gastos)

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

        findViewById<CardView>(R.id.Salud).setOnClickListener {
            val Gasto = "Salud"
            val intent = Intent(this, IngresarGastosActivity::class.java)
            intent.putExtra("Usuario",Usuario)
            intent.putExtra("Gasto",Gasto)
            startActivity(intent)
        }
        findViewById<CardView>(R.id.Ocio).setOnClickListener {
            val Gasto = "Ocio"
            val intent = Intent(this, IngresarGastosActivity::class.java)
            intent.putExtra("Usuario",Usuario)
            intent.putExtra("Gasto",Gasto)
            startActivity(intent)
        }
        findViewById<CardView>(R.id.Casa).setOnClickListener {
            val Gasto = "Casa"
            val intent = Intent(this, IngresarGastosActivity::class.java)
            intent.putExtra("Usuario",Usuario)
            intent.putExtra("Gasto",Gasto)
            startActivity(intent)
        }
        findViewById<CardView>(R.id.Ropa).setOnClickListener {
            val Gasto = "Ropa"
            val intent = Intent(this, IngresarGastosActivity::class.java)
            intent.putExtra("Usuario",Usuario)
            intent.putExtra("Gasto",Gasto)
            startActivity(intent)
        }
        findViewById<CardView>(R.id.Educacion).setOnClickListener {
            val Gasto = "Educacion"
            val intent = Intent(this, IngresarGastosActivity::class.java)
            intent.putExtra("Usuario",Usuario)
            intent.putExtra("Gasto",Gasto)
            startActivity(intent)
        }
        findViewById<CardView>(R.id.Alimentacion).setOnClickListener {
            val Gasto = "Alimentacion"
            val intent = Intent(this, IngresarGastosActivity::class.java)
            intent.putExtra("Usuario",Usuario)
            intent.putExtra("Gasto",Gasto)
            startActivity(intent)
        }
        findViewById<CardView>(R.id.Familia).setOnClickListener {
            val Gasto = "Familia"
            val intent = Intent(this, IngresarGastosActivity::class.java)
            intent.putExtra("Usuario",Usuario)
            intent.putExtra("Gasto",Gasto)
            startActivity(intent)
        }
        findViewById<CardView>(R.id.Transporte).setOnClickListener {
            val Gasto = "Trasnporte"
            val intent = Intent(this, IngresarGastosActivity::class.java)
            intent.putExtra("Usuario",Usuario)
            intent.putExtra("Gasto",Gasto)
            startActivity(intent)
        }
        findViewById<CardView>(R.id.Otros).setOnClickListener {
            val Gasto = "Otros"
            val intent = Intent(this, IngresarGastosActivity::class.java)
            intent.putExtra("Usuario",Usuario)
            intent.putExtra("Gasto",Gasto)
            startActivity(intent)
        }
    }
}