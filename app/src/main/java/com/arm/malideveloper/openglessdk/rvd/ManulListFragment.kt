package com.arm.malideveloper.openglessdk.rvd


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.arm.malideveloper.openglessdk.rvd.databinding.FragmentManulListBinding


class ManulListFragment : Fragment(R.layout.fragment_manul_list) {

    fun showDescr(manul:Manul){
        val direction = ManulListFragmentDirections.actionManulListFragmentToManulDescriptionFragment2(manul)
        findNavController().navigate(direction)
    }

    val adapter = ManulAdapter{
        showDescr(it)
    }

    private val manulsList = listOf(
        Manul("Драго",R.drawable.bakugan0,"Стихія вогню (pyrus). Напарник: Ден"),
        Manul("Інграм",R.drawable.bakugan1,"Стихія вітру (ventus). Напарник: Шун"),
        Manul("Геліос",R.drawable.bakugan2,"Стихія вогню (pyrus). Напарник: Спектра"),
        Manul("Гідраноїд",R.drawable.bakugan3,"Стихія темряви (darkus). Напарник: Маска"),
        Manul("Волкан",R.drawable.bakugan4,"Стихія землі (subterra). Напарник: Гас"),
        Manul("Драоїд",R.drawable.bakugan5,"Стихія землі (subterra). Напарник: Хайдрон"),
        Manul("Преяс",R.drawable.bakugan6,"Стихія води (aquos). Напарник: Маручо"),
        Manul("Аполлонір",R.drawable.bakugan7,"Стихія вогню (pyrus). Напарник: Ден (тимчасово)"),
        Manul("Скайрес",R.drawable.bakugan8,"Стихія вітру (ventus). Напарник: Шун"),
        Manul("Сирена",R.drawable.bakugan9,"Стихія води (aquos). Напарник: Клаус"),
        Manul("Тігрерра",R.drawable.bakugan10,"Стихія світла (haos). Напарник: Руно"),
        Manul("Вілда",R.drawable.bakugan11,"Стихія землі (subterra). Напарник: Міра"),

        )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var bind= FragmentManulListBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)
        bind.apply{
            rcView.layoutManager=LinearLayoutManager(context)
            rcView.adapter=adapter
        }
        adapter.addManuls(manulsList)


    }


}