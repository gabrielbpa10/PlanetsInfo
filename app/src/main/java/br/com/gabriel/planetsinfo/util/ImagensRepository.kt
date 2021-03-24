package br.com.gabriel.planetsinfo.util

import br.com.gabriel.planetsinfo.R

object ImagensRepository {

    fun getKeyImageView(): HashMap<String,Int>{
        var hashMap: HashMap<String,Int> = HashMap()
//        hashMap.put("mercurio", R.drawable.mercurio)
//        hashMap.put("venus", R.drawable.venus)
        hashMap.put("terra",R.mipmap.ic_launcher_terra)
//        hashMap.put("marte",R.drawable.marte)
        hashMap.put("jupter",R.mipmap.ic_launcher_jupter)

        return hashMap
    }
}