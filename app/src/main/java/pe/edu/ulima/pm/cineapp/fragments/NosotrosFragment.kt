package pe.edu.ulima.pm.cineapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import pe.edu.ulima.pm.cineapp.R

class NosotrosFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.title = "Sobre Nosotros"
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_nosotros, container, false)
        val btn = v.findViewById<Button>(R.id.btnBack)
        btn?.setOnClickListener {
            println("a")
            val ft = requireActivity().supportFragmentManager
            ft.popBackStack()
            //ft.replace(R.id.fcvEleccion, CarteleraFragment())
        }
        return v
    }
}