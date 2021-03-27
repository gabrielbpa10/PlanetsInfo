package br.com.gabriel.planetsinfo.util

import br.com.gabriel.planetsinfo.R

object ImagensRepository {

    fun getKeyImageView(): HashMap<String,Int>{
        var hashMap: HashMap<String,Int> = HashMap()
        hashMap.put("mercurio", R.mipmap.ic_launcher_mercurio)
        hashMap.put("venus", R.mipmap.ic_launcher_venus)
        hashMap.put("terra",R.mipmap.ic_launcher_terra)
        hashMap.put("marte",R.mipmap.ic_launcher_marte)
        hashMap.put("jupter",R.mipmap.ic_launcher_jupter)
        hashMap.put("saturno",R.mipmap.ic_launcher_saturno)
        hashMap.put("urano",R.mipmap.ic_launcher_urano)
        hashMap.put("neturno",R.mipmap.ic_launcher_neturno)
        hashMap.put("ceres",R.mipmap.ic_launcher_ceres)
        hashMap.put("plutao",R.mipmap.ic_launcher_plutao)
        hashMap.put("haumea",R.mipmap.ic_launcher_haumea)
        hashMap.put("makemake",R.mipmap.ic_launcher_makemake)
        hashMap.put("eris",R.mipmap.ic_launcher_eris)
        hashMap.put("dysnomia",R.mipmap.ic_launcher_dysnomia)

        return hashMap
    }
}