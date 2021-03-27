package br.com.gabriel.planetsinfo.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.gabriel.planetsinfo.R
import br.com.gabriel.planetsinfo.adapter.OnPlanetaItemListener
import br.com.gabriel.planetsinfo.adapter.PlanetaAdapter
import br.com.gabriel.planetsinfo.model.PlanetaRepository
import br.com.gabriel.planetsinfo.util.ImagensRepository
import java.io.Serializable

class MainActivity : AppCompatActivity(), OnPlanetaItemListener {

    private lateinit var planetasRecyclerView:RecyclerView
    private val planetas = PlanetaRepository.getAll()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        carregarElementos()
    }

    fun carregarElementos(){
        val gridLayoutManager = GridLayoutManager(this,2)
        val listaImagens = ImagensRepository.getKeyImageView()
        val planetaAdapater = PlanetaAdapter(planetas,listaImagens)

        planetaAdapater.setOnPlanetaItemListener(this)
        planetasRecyclerView = findViewById(R.id.main_recyclerView_list_planets)
        planetasRecyclerView.apply {
            adapter = planetaAdapater
            layoutManager = gridLayoutManager
            hasFixedSize()
        }
    }

    override fun onClick(view: View, position: Int) {
//        Toast.makeText(this,"Componente na posição $position tem o planeta ${planetas[position].nome}",Toast.LENGTH_SHORT).show()
            var planetaSelecionado = planetas[position]
            var intent = Intent(this,DetailActivity::class.java)
            intent.putExtra("detail",planetaSelecionado as Serializable)
            startActivity(intent)
    }
}