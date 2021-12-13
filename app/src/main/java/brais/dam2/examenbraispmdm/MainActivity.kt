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

        for (numero in 100..0){
            Log.i("cuenta regresiba", numero.toString())
        }
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