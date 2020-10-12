package com.phaytran.dynamicviewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.phaytran.dynamicviewpager.databinding.FragmentViewPagerBinding
import com.phaytran.dynamicviewpager.model.Dishes
import com.phaytran.dynamicviewpager.model.Type

class FragmentViewPager: Fragment() {
    lateinit var binding: FragmentViewPagerBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_view_pager,container,false)
        initViewPager()
        return binding.root
    }

    private fun initViewPager() {
        val listType = arrayListOf<Type>(
            Type(0,"Breakfast"),
            Type(1,"Lunch"),
            Type(2,"Dinner"),
            Type(3,"Fastfood"),
            Type(4,"Water"),
            Type(5,"Beer")
        )
        val listDishes = arrayListOf<Dishes>(
            Dishes(0,"Bakery","10.000","https://lh3.googleusercontent.com/proxy/" +
                    "FK1tpOT2hrNDCF-nK3poisnJJBacw_zkMuewL0gNF2VkrHt4gyGji8FeCwiu59cKSGBbhbkWYtqY_fkpSW_PDgHkWYnmrNmVuOy-vWRfhr7SSlJ0"
                ,listType[0]),
            Dishes(1,"Noodles","3.000","https://static.toiimg.com/thumb/52467119.cms?imgsize=1106358&width=800&height=800",listType[0]),
            Dishes(2,"Cereals","20.000","https://lh3.googleusercontent.com/proxy/r7NQdQ5WmsB94HcDHG3c7YtPp0MVVV8dGkdghV6A6L89znQPbu-vce_" +
                    "DuG4jDp3kFFgfpedj03F9hiX0dbrB9bCFGC8hFlby7e-0cI4FftzKd1ARZaWQBJFh6nU29B2Apf1A7DC8Bac1nvUVxUYTt8cYFNcorItKnT6_HZE",listType[0]),
            Dishes(3,"Noodles Soup","25.000","https://www.recipetineats.com/wp-content/uploads/2014/06/DSC_0038-680x451-1.jpg?w=500&h=451&crop=1",listType[0]),
            Dishes(4,"Lunch A","100.000","https://simply-delicious-food.com/wp-content/uploads/2018/07/mexican-lunch-bowls-3.jpg",listType[1]),
            Dishes(5,"Lunch B","50.000","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/" +
                    "healthy-recipes-marquee-1577978180.png?crop=0.663xw:0.993xh;0.171xw,0&resize=640:*",listType[1]),
            Dishes(6,"Lunch C","35.000","https://static.toiimg.com/thumb/msid-66476758,width-800,height-600," +
                    "resizemode-75,imgsize-1640939,pt-32,y_pad-40/66476758.jpg",listType[1]),
            Dishes(7,"Lunch D","40.000","https://babyfoode.com/wp-content/uploads/2017/09/10_healthy_school_lunch_idea-4.jpg",listType[1]),
            Dishes(8,"Dinner A","55.000","https://www.tasteofhome.com/wp-content/uploads/2018/01/One-Pot-Dinner_EXPS_OPBZ18_10388_E06_07_2b-1-696x696.jpg",listType[2]),
            Dishes(9,"Dinner B","75.000","https://assets.kraftfoods.com/recipe_images/opendeploy/62663_640x428.jpg",listType[2]),
            Dishes(10,"Dinner C","25.000","https://images.immediate.co.uk/production/volatile/sites/30/2020/08/crab-asparagus-pappardelle-69a2b90.jpg?" +
                    "quality=90&resize=500%2C454",listType[2]),
            Dishes(11,"Dinner D","45.000","https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/1/07/0/" +
                    "FNK_Chicken-Tortilla-Dump-Dinner_s4x3.jpg.rend.hgtvcom.826.620.suffix/1546896090334.jpeg",listType[2]),
            Dishes(12,"Fastfood A","33.000","https://upload.wikimedia.org/wikipedia/commons/2/2e/Fast_food_meal.jpg",listType[3]),
            Dishes(13,"Fastfood B","44.000","https://www.brandsvietnam.com/upload/news/480px/2018/14411_Fastfood.jpg",listType[3]),
            Dishes(14,"Fastfood C","55.000","https://www.hoteljob.vn/files/Anh-Hoteljob-Ni/Nam-2019/Thang-6/Bo-sung-3/" +
                    "nhieu-dai-gia-fastfood-vo-mong-tai-thi-truong-viet-nam.jpg",listType[3]),
            Dishes(15,"Fastfood D","77.000","https://nghekhachsan.com/upload/NKS-Hong/fastfood-la-gi-3.jpg",listType[3]),
            Dishes(16,"Water A","33.000","https://lh3.googleusercontent.com/proxy/cEMsibOmfy3g7AGVu-qESAiswe_mtE2VJ9zhoG2IJ" +
                    "GOjl9Go8JQn0634uAJ_vKMpoShm7BLa6szOm4y5wLM9VPVekob-ihMKW9o2wt2DPKz-lJ2PmT5YyxYy2jnwx1QgVJJOIuFNsw",listType[4]),
            Dishes(17,"Water B","44.000","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRmER02GibzqUR0CtQkOmOUHIxje-Cjx_E1-g&usqp=CAU",listType[4]),
            Dishes(18,"Water C","55.000","https://post.healthline.com/wp-content/uploads/sites/3/2020/02/320892_1100-732x549.jpg",listType[4]),
            Dishes(19,"Water D","77.000","https://media.self.com/photos/5dd2bf57761ad00009f78036/3:4/w_675,h_900,c_limit/05-AdobeStock_270650020.jpg",listType[4]),            Dishes(12,"Water A","33.000","https://lh3.googleusercontent.com/proxy/cEMsibOmfy3g7AGVu-qESAiswe_mtE2VJ9zhoG2IJGOjl9Go8JQn0634uAJ_vKMpoShm7BLa6szOm4y5wLM9VPVekob-ihMKW9o2wt2DPKz-lJ2PmT5YyxYy2jnwx1QgVJJOIuFNsw",listType[4]),
            Dishes(20,"Beer B","11.000","https://static.independent.co.uk/s3fs-public/thumbnails/image/2019/08/01/17/istock-1060456922.jpg?width=982&height=726",listType[5]),
            Dishes(21,"Beer C","22.000","https://cdn.craftbeer.com/wp-content/uploads/2014/04/22205106/Foam-main.jpg",listType[5]),
            Dishes(22,"Beer D","12.000","https://media.npr.org/assets/img/2018/10/16/rts1u2te-71fe69214f2094429ea5ca2485cd1fbd5ee8383f-s800-c85.jpg",listType[5]),
            Dishes(22,"Beer A","13.000","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQQ14dH_K9fffbCAeQ2Q2GHGoKsqq-sRx70lQ&usqp=CAU",listType[5])
        )
        val adapter = ViewPagerAdapter(listType,listDishes,activity!!.supportFragmentManager,lifecycle)
        binding.viewPager.adapter = adapter

        binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        TabLayoutMediator(binding.tabLayout,binding.viewPager){tab, position ->
            tab.text = listType[position].typeName
        }.attach()
    }
}