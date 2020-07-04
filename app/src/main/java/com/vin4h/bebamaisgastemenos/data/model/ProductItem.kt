package com.vin4h.bebamaisgastemenos.data.model

class ProductItem(measure: Int, price: Float) {
    var measure: Int = 0
    var price: Float = 0.0f

    fun valueForAverage(): Float {
        return price / measure
    }
}