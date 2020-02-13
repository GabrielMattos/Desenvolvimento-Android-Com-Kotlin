
package cursoandroid.com.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var texto : TextView
    val frases = arrayOf(
        "hjvgjsvghvjsghjgjsdhjvgsjhgsh",
        "efifjeiofujeiofeioufeufeofeiefoi",
        "fefeuiefiufuiyefiuyefiuyfeiefpwdiodiwpdwio"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.id_textViewFrase)
    }

    fun gerarFrase(view: View)
    {
        val totalItensArray = frases.size
        val numeroAleatorio = Random.nextInt(totalItensArray)
        texto.setText(frases[numeroAleatorio])
    }
}
