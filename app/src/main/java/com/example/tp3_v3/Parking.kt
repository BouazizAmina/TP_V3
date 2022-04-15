package com.example.movieexample

import android.widget.ImageView
import android.widget.TextView
import java.io.Serializable
import java.sql.Time
import java.time.LocalTime

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
