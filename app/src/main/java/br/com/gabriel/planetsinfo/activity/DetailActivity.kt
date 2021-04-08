package br.com.gabriel.planetsinfo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import br.com.gabriel.planetsinfo.R
import br.com.gabriel.planetsinfo.enum.Position
import br.com.gabriel.planetsinfo.util.PlanetaRepository

class DetailActivity : AppCompatActivity() {

    private var imagemPlaneta: ImageView? = null
    private var nomePlaneta: TextView? = null
    private var tipoPlaneta: TextView? = null
    private var descricaoPlaneta: TextView? = null
    private val listaPlanetas = PlanetaRepository.getAll()
    private val tituloTela = "Detalhes"
    private val valorDefault = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        carregarElementos()
        setTitle(tituloTela)
        val intent = getIntent()
        val posicao = intent.getIntExtra(Position.POSICAO.name,valorDefault)
        if(posicao != valorDefault){
            preencherCampos(posicao)
        }
    }

    fun carregarElementos(){
        imagemPlaneta = findViewById(R.id.activity_detail_imagem_planeta)
        nomePlaneta = findViewById(R.id.activity_detail_nome_planeta)
        tipoPlaneta = findViewById(R.id.activity_detail_tipo_planeta)
        descricaoPlaneta = findViewById(R.id.activity_detail_descricao_planeta)
    }

    fun preencherCampos(posicao: Int){
        imagemPlaneta?.setImageResource(listaPlanetas[posicao].numeroImagem)
        nomePlaneta?.text = listaPlanetas[posicao].nome
        tipoPlaneta?.text = listaPlanetas[posicao].tipo
        descricaoPlaneta?.text = listaPlanetas[posicao].descricao
    }
}