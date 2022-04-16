package com.example.tp3_v3

import androidx.lifecycle.ViewModel

class MyModel: ViewModel() {
    // Les données à partager entre les fragments
    var data = mutableListOf<Parking>()
    init {
        data.add(Parking(R.drawable.parking2,"Ouvert",66,"Parking Jardin d'essai","Alger",8.86,14,3,9,1,60.2 ))
        data.add(Parking(R.drawable.parking2,"Fermé",30,"Parking Said Hamdine","Alger",12.95,17,4,6,6,70.0))
        data.add(Parking(R.drawable.parking2,"Fermé",95,"parking Val d'hydra","Alger",12.95,17,6,7,4,50.0))
        data.add(Parking(R.drawable.parking2,"Fermé",95,"parking Val d'hydra","Alger",12.95,17,8,9,3,80.0))
        data.add(Parking(R.drawable.parking2,"Fermé",66,"Parking Jardin d'essai","Alger",8.86,14,1,2,2,50.0))
        data.add(Parking(R.drawable.parking2,"Fermé",30,"Parking Said Hamdine","Alger",12.95,17,5,6,1,60.0))
        data.add(Parking(R.drawable.parking2,"Fermé",95,"parking Val d'hydra","Alger",12.95,17,6,7,2,100.0))
        data.add(Parking(R.drawable.parking2,"Fermé",95,"parking Val d'hydra","Alger",12.95,17,5,8,1,50.0))

    }

}