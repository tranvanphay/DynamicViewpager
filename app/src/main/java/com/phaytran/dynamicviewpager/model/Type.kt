package com.phaytran.dynamicviewpager.model

class Type {
     var typeId = 0
     var typeName: String

    constructor(typeId: Int, typeName: String) {
        this.typeId = typeId
        this.typeName = typeName
    }

    constructor(typeName: String) {
        this.typeName = typeName
    }
}