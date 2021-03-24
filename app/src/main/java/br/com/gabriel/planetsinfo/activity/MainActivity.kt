package br.com.gabriel.planetsinfo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.gabriel.planetsinfo.R
import br.com.gabriel.planetsinfo.adapter.PlanetaAdapter
import br.com.gabriel.planetsinfo.model.PlanetaRepository
import br.com.gabriel.planetsinfo.util.ImagensRepository

class MainActivity : AppCompatActivity() {

    private lateinit var planetasRecyclerView:RecyclerView
    private val planetas = PlanetaRepository.getAll()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        carregarElementos()
    }

    fun carregarElementos(){
        val linearLayoutManager = LinearLayoutManager(this)
        val listaImagens = ImagensRepository.getKeyImageView()
        val planetaAdapater = PlanetaAdapter(planetas,listaImagens)

        planetasRecyclerView = findViewById(R.id.main_recyclerView_list_planets)
        planetasRecyclerView.apply {
            adapter = planetaAdapater
            layoutManager = linearLayoutManager
            hasFixedSize()
        }
    }
}