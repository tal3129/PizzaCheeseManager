package com.onl.pizzacheesemanager_ashdod.Types

class ShipLocation(var id: String = "", var name: String = "", var price: Double = 0.0) {

    override fun toString(): String {
        return "$name: $price ₪"
    }
}