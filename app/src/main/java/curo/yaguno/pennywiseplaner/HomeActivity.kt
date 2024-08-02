package curo.yaguno.pennywiseplaner

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var dbHelper: DataBaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        dbHelper = DataBaseHelper(this)
        val Usuario = intent.getIntExtra("Usuario", -1)

        val ingresosTextView = findViewById<TextView>(R.id.izquierda01)
        val gastosTextView = findViewById<TextView>(R.id.abc)
        val saldoTextView = findViewById<TextView>(R.id.Tv_plata)

        val totalIngresos = dbHelper.getTotalIngresos(Usuario)
        val totalGastos = dbHelper.getTotalGastos(Usuario)
        val saldoTotal = totalIngresos - totalGastos

        ingresosTextView.text = "$$totalIngresos"
        gastosTextView.text = "$$totalGastos"
        saldoTextView.text = "$$saldoTotal"

        findViewById<ImageView>(R.id.iv_gastos).setOnClickListener {
            val intent = Intent(this, GastosActivity::class.java)
            intent.putExtra("Usuario", Usuario)
            startActivity(intent)
        }
        findViewById<ImageView>(R.id.iv_ingresos).setOnClickListener {
            val intent = Intent(this, IngresosActivity::class.java)
            intent.putExtra("Usuario", Usuario)
            startActivity(intent)
        }
    }
}
