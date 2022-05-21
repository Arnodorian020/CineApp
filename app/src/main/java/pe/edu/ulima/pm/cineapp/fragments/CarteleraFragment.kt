package pe.edu.ulima.pm.cineapp.fragments

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelStore
import com.google.android.material.navigation.NavigationView
import pe.edu.ulima.pm.cineapp.R

class CarteleraFragment : Fragment() {

    private lateinit var mToolbar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*if(arguments != null){
            activity?.title = "Bienvenido " + "${requireArguments().getString("nombre")}"

        }

        Log.i("null", requireArguments().getString("nombre").toString())*/
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cartelera, container, false)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

        inflater.inflate(R.menu.menu_cartelera, menu)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }
}