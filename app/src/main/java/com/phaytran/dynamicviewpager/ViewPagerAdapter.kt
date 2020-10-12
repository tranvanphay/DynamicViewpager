package com.phaytran.dynamicviewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.phaytran.dynamicviewpager.model.Dishes
import com.phaytran.dynamicviewpager.model.Type

class ViewPagerAdapter(var listType:ArrayList<Type>,var listDishes: ArrayList<Dishes>, fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    private fun initFragment():MutableList<FragmentContent>{
        var list:MutableList<FragmentContent> = mutableListOf()
        for (x in 0 until listType.size){
            val listDishesByType:ArrayList<Dishes> = arrayListOf()
            for(dishes in listDishes){
                if (dishes.type.equals(listType[x])){
                    listDishesByType.add(dishes)
                }
            }
            list.add(FragmentContent(listDishesByType))
        }
        return list
    }


    override fun getItemCount(): Int {
        return initFragment().size
    }

    override fun createFragment(position: Int): Fragment {
        return initFragment()[position]
    }
}