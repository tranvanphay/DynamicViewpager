package com.phaytran.dynamicviewpager

import android.database.DatabaseUtils
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.phaytran.dynamicviewpager.databinding.FragmentContentBinding
import com.phaytran.dynamicviewpager.model.Dishes

class FragmentContent(var listDishes: ArrayList<Dishes>): Fragment() {
    lateinit var binding: FragmentContentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_content,container,false)
        binding.tvTypeName.text = listDishes[0].type.typeName
        for (dishes in listDishes){
            Log.e("Phaydev","DishesName: "+dishes.dishesName)
        }
        return binding.root
    }
}