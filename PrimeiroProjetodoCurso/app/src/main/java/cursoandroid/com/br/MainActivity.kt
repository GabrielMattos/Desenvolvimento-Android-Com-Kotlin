package cursoandroid.com.br

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CliqueBotao(view: View)
    {
        var texto = findViewById<TextView>(R.id.id_textoExibicao);
        texto.setText("Texto Alterado");
    }
}
