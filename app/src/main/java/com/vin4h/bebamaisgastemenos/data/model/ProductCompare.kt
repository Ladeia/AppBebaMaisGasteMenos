package com.vin4h.bebamaisgastemenos.data.model

class ProductCompare {

    var products = mutableListOf<ProductItem>()

    fun createProduct(measure: Int, price:Float) {
        val product = ProductItem(measure, price)
        products.add(product)
    }

    fun getBestProduct(): ProductItem {
        var bestProduct:ProductItem = ProductItem(0, 0.0F)
        var bestChoice:Float = Float.MAX_VALUE

        products.forEach {
            if(bestChoice < it.valueForAverage()) {
                bestChoice = it.valueForAverage()
                bestProduct = it
            }
        }

        return bestProduct
    }

}