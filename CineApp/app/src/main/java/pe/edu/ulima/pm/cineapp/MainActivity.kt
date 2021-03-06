package pe.edu.ulima.pm.cineapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    //Se crea una variabla de tipo TextInput
    var tietNameUser: TextInputEditText? = null

    //Se crea una variable de tipo button
    var btnLogin: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Se captura el valor de tietNameUser
        tietNameUser = findViewById(R.id.tietNameUser)

        //Se captura el valor de btnLogin
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin!!.setOnClickListener{
            val intent= Intent()
            intent.setClass(this,MainActivity::class.java)// Intent configurado

            //Se crea una variable para almacenar el nombre del usuario
            val nameUser = Bundle()
            nameUser.putString("nameUser",tietNameUser!!.text.toString())
            intent.putExtras(nameUser)
            startActivity(intent)
        }
    }

}