package pe.edu.ulima.pm.cineapp.fragments

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import pe.edu.ulima.pm.cineapp.ListadoPeliculasActivity
import pe.edu.ulima.pm.cineapp.R

class NosotrosFragment : Fragment() {
    private lateinit var mNviListaPeliculas : NavigationView
    private lateinit var toolbar : Toolbar
    private var nombre: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_nosotros, container, false)
        val btn = v.findViewById<Button>(R.id.btnBack)
        if(arguments != null){
            nombre = requireArguments().getString("nombre").toString()
        }
        btn?.setOnClickListener {
            val ft = requireActivity().supportFragmentManager
            ft.popBackStack()
            (activity as AppCompatActivity).supportActionBar?.title = "$nombre"
        }
        return v
    }
}