package cr.ac.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression

        var texto : TextView ?= null

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.texto)

    }
    fun crearTexto(text: View){
        val button = text as Button
        val textButton = button.text.toString()
        if(texto?.text.toString() == "0" || texto?.text.toString() == "0.0"){
            texto?.text = ""
        }else{
            texto?.text = texto?.text.toString()
        }
        var valor = texto?.text.toString() + textButton
        texto?.text =  valor

    }
    fun resultado(text: View){
        var result = Expression(texto?.text.toString())
        texto?.text = result.calculate().toString()
    }
    fun clear(text: View){
        texto?.text = "0"
    }



}