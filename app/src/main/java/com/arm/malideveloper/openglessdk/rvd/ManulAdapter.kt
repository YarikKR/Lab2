package com.arm.malideveloper.openglessdk.rvd


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arm.malideveloper.openglessdk.rvd.databinding.ManulItemBinding
import com.bumptech.glide.Glide

class ManulAdapter(val launchfargment : (Manul)->Unit): RecyclerView.Adapter<ManulAdapter.ManulHolder>() {


    val manulList = ArrayList<Manul>()

    inner class ManulHolder(item: View):RecyclerView.ViewHolder(item){
        val bind = ManulItemBinding.bind(item)
        fun bindFun(bakugan: Manul){
            bind.button0.setOnClickListener {
                launchfargment(manulList[adapterPosition])
            }
            Glide.with(bind.image.context).load(bakugan.image).into(bind.image)

            bind.name.text=bakugan.name
            bind.bakuganDescr.text=bakugan.descr

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ManulHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.manul_item,parent,false)
        return ManulHolder(view)
    }

    override fun onBindViewHolder(holder: ManulHolder, position: Int) {
        holder.bindFun(manulList[position])
    }

    override fun getItemCount(): Int {
        return manulList.size
    }

    fun addManul(manul: Manul){
        manulList.add(manul)
        notifyDataSetChanged()
    }

    fun addManuls(manul: List<Manul>){
        manulList.addAll(manul)
        notifyDataSetChanged()
    }



}