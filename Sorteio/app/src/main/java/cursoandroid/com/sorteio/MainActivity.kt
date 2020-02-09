package cursoandroid.com.sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonSelecionarNumero(view: View)
    {
        var numeroSorteado = Random.nextInt(10, 100)
        var txt = findViewById<TextView>(R.id.id_textViewNumeroSelecionado)
        txt.setText("Número sorteado é: $numeroSorteado")
    }
}
