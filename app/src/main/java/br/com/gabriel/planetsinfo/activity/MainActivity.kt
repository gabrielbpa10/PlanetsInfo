package br.com.gabriel.planetsinfo.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.gabriel.planetsinfo.R
import br.com.gabriel.planetsinfo.adapter.OnPlanetaItemListener
import br.com.gabriel.planetsinfo.adapter.PlanetaAdapter
import br.com.gabriel.planetsinfo.enum.Position
import br.com.gabriel.planetsinfo.util.PlanetaRepository

class MainActivity : AppCompatActivity(), OnPlanetaItemListener {

    private lateinit var planetasRecyclerView:RecyclerView
    private val planetas = PlanetaRepository.getAll()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        carregarElementos()
    }

    fun carregarElementos(){
        val linearLayoutManager = LinearLayoutManager(this)
        val planetaAdapater = PlanetaAdapter(planetas)

        planetaAdapater.setOnPlanetaItemListener(this)
        planetasRecyclerView = findViewById(R.id.main_recyclerView_list_planets)
        planetasRecyclerView.apply {
            adapter = planetaAdapater
            layoutManager = linearLayoutManager
            hasFixedSize()
        }
    }

    override fun onClick(view: View, position: Int) {
            var intent = Intent(this,DetailActivity::class.java)
            intent.putExtra(Position.POSICAO.name,position)
            startActivity(intent)
    }
}