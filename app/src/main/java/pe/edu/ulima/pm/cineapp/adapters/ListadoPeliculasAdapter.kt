package pe.edu.ulima.pm.cineapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pe.edu.ulima.pm.cineapp.Pelicula
import pe.edu.ulima.pm.cineapp.R

class ListadoPeliculasAdapter(private val mListPeliculas : List<Pelicula>,
                              private val mOnItemClickListener : (pelicula: Pelicula) -> Unit)
    : RecyclerView.Adapter<ListadoPeliculasAdapter.ViewHolder>(){
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val tviPeliculaNombre : TextView
        val tviPeliculaHora : TextView

        init {
            tviPeliculaNombre = view.findViewById(R.id.tviPeliculaNombre)
            tviPeliculaHora = view.findViewById(R.id.tviPeliculaHora)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_pelicula, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pelicula = mListPeliculas[position]
        holder.tviPeliculaNombre.text = pelicula.nombre
        holder.tviPeliculaHora.text = pelicula.hora

        holder.itemView.setOnClickListener {
            // Devolver el nro de items a mostrar
            mOnItemClickListener(pelicula)
        }
    }

    override fun getItemCount(): Int {
        return mListPeliculas.size
    }
}