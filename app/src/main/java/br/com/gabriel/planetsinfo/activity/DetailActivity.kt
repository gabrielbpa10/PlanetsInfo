package br.com.gabriel.planetsinfo.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import br.com.gabriel.planetsinfo.R
import br.com.gabriel.planetsinfo.model.Planeta
import br.com.gabriel.planetsinfo.util.ImagensRepository

class DetailActivity : AppCompatActivity() {

    private var imagemPlaneta: ImageView? = null
    private var nomePlaneta: TextView? = null
    private var tipoPlaneta: TextView? = null
    private var descricaoPlaneta: TextView? = null
    private val listaImagens = ImagensRepository.getKeyImageView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        carregarElementos()
        val intent = getIntent()

        if(intent.hasExtra("detail")){
            setTitle("Detalhes")
            var planeta = intent.getSerializableExtra("detail") as Planeta
            preencherCampos(planeta)
        }
    }

    fun carregarElementos(){
        imagemPlaneta = findViewById(R.id.activity_detail_imagem_planeta)
        nomePlaneta = findViewById(R.id.activity_detail_nome_planeta)
        tipoPlaneta = findViewById(R.id.activity_detail_tipo_planeta)
        descricaoPlaneta = findViewById(R.id.activity_detail_descricao_planeta)
    }

    fun preencherCampos(planeta: Planeta){
        imagemPlaneta?.setImageResource(listaImagens.get(planeta.nomeImagem)!!)
        nomePlaneta?.setText(planeta.nome)
        tipoPlaneta?.setText(planeta.tipo)
        descricaoPlaneta?.setText(planeta.descricao)
    }
}