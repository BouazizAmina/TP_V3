package com.example.tp3_v3

import java.io.Serializable

data class Parking(
    val image: Int,
    val etat:String, val taux:Int,
    val nom:String,
    val commune:String,
    val distance: Double,
    val duree:Int,
    val tempsOuv: Int,
    val tempsFerm: Int,
    val unitPrice: Int,
    val prix: Double):Serializable
