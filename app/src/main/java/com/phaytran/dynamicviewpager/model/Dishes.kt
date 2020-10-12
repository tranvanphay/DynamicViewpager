package com.phaytran.dynamicviewpager.model

class Dishes {
    var dishesId = 0
    var dishesName: String
    var dishesPrices:String
    var dishesPicture:String
    var type:Type

    constructor(dishesId:Int,dishesName:String,dishesPrices:String,dishesPicture:String,type: Type){
        this.dishesId = dishesId
        this.dishesName = dishesName
        this.dishesPrices = dishesPrices
        this.dishesPicture = dishesPicture
        this.type = type
    }

    constructor(dishesName:String,dishesPrices:String,dishesPicture:String, type:Type){
        this.dishesName = dishesName
        this.dishesPrices = dishesPrices
        this.dishesPicture = dishesPicture
        this.type = type
    }


}