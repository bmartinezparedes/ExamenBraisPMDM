package brais.dam2.examenbraispmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        Hago un for qu e a la variable numero le vay ametiendo los valores de 100
        a 0 y despues con el Log.i imprimo esos valores que se mostraran luego en logcat
        en el apartado info. le puse un tag para que sea mas facil buscarlo despues
         */
        for (numero in 100 downTo 0){
            Log.i("cuenta regresiba", numero.toString())
        }
        /*
        Declaro el variable boton que le meto un boton que hace referencia a una id
        y dentro esta a la espera de ser pulsado para imprimir una Toas
        que es un mensaje qvisible para el ususario
         */
        val bToast: Button =findViewById(R.id.bToast)
        bToast.setOnClickListener{
            Toast.makeText(this.applicationContext, "Apruebame", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onResume() {
        super.onResume()
        //codigo que quieras en on resume
    }
}