package pe.edu.ulima.pm.cineapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.view.isVisible
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView
import pe.edu.ulima.pm.cineapp.fragments.CarteleraFragment
import pe.edu.ulima.pm.cineapp.fragments.NosotrosFragment

class ListadoPeliculasActivity : AppCompatActivity() {
    private lateinit var mDlaListaPeliculas : DrawerLayout
    private lateinit var mNviListaPeliculas : NavigationView



    private val fragmentCartelera = CarteleraFragment()
    private val fragmentNosotros = NosotrosFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_listado_peliculas)

        mDlaListaPeliculas = findViewById(R.id.dlaListaPeliculas)
        mNviListaPeliculas = findViewById(R.id.nviListaPeliculas)


        val header : View = mNviListaPeliculas.getHeaderView(0)
        val eteNombre : TextView = header.findViewById(R.id.eteNombre)
        eteNombre.text = "${intent.getStringExtra("nameUser")}"

        mNviListaPeliculas.setNavigationItemSelectedListener {
            it.isChecked=true

            val ft = supportFragmentManager.beginTransaction()


            when(it.itemId) {
                R.id.menCartelera -> mostrarFragmentCartelera(ft)
                R.id.menNosotros -> mostrarFragmentNosotros(ft)
            }

            ft.addToBackStack(null)

            ft.commit()


            mDlaListaPeliculas.closeDrawers()
            true


        }


        // Aquí se ubica el fragment a mostrar por defecto
        val ft = supportFragmentManager.beginTransaction()
        ft.add(R.id.fcvEleccion, fragmentCartelera)
        ft.commit()
    }




    private fun mostrarFragmentNosotros(ft: FragmentTransaction) {
        ft.replace(R.id.fcvEleccion, fragmentNosotros)
    }

    private fun mostrarFragmentCartelera(ft: FragmentTransaction) {
        ft.replace(R.id.fcvEleccion, fragmentCartelera)
    }

}