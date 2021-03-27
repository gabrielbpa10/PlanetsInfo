package br.com.gabriel.planetsinfo.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.gabriel.planetsinfo.R
import br.com.gabriel.planetsinfo.model.Planeta

class PlanetaAdapter (
                        private val planetas:List<Planeta>,
                        private val hashmapImages:HashMap<String,Int>
): RecyclerView.Adapter<PlanetaAdapter.PlanetaViewHolder>() {

    private var listener: OnPlanetaItemListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.planeta_item,parent,false)
        return PlanetaViewHolder(view,listener)
    }

    override fun getItemCount(): Int {
        return planetas.size
    }

    override fun onBindViewHolder(holder: PlanetaViewHolder, position: Int) {
        holder.itemNomePlaneta.text = planetas[position].nome
        holder.itemImagemPlaneta.setImageResource(hashmapImages.get(planetas[position].nomeImagem)!!)

    }

    fun setOnPlanetaItemListener(listener: OnPlanetaItemListener){
        this.listener = listener
    }

    class PlanetaViewHolder (view: View, listener: OnPlanetaItemListener?): RecyclerView.ViewHolder(view){
        val itemNomePlaneta: TextView = view.findViewById(R.id.planeta_item_textview_nome)
        val itemImagemPlaneta: ImageView = view.findViewById(R.id.planeta_item_imageview)

        init {
            view.setOnClickListener {
                listener?.onClick(it,adapterPosition)
            }
        }
    }
}