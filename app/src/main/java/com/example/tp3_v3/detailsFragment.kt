package com.example.tp3_v3

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class detailsFragment : Fragment() {


//    private lateinit var binding = FragmentDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_details, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var pos = arguments?.getInt("position")as? Parking
//print(pos)
        pos?.image?.let { requireActivity().findViewById<ImageView>(R.id.imageParking).setImageResource(it).toString() }
        requireActivity().findViewById<TextView>(R.id.nom1).setText(pos?.nom)
        requireActivity().findViewById<TextView>(R.id.nom2).setText(pos?.nom)
        requireActivity().findViewById<TextView>(R.id.emplacement).setText(pos?.commune)
        requireActivity().findViewById<TextView>(R.id.state).setText(pos?.etat)
        if(pos?.etat == "Fermé"){
            requireActivity().findViewById<TextView>(R.id.state).setTextColor(Color.RED)
        }
        else{
            requireActivity().findViewById<TextView>(R.id.state).setTextColor(Color.GREEN)
        }
        requireActivity().findViewById<TextView>(R.id.pourcentage).setText(pos?.taux.toString()+"%")
        requireActivity().findViewById<TextView>(R.id.dist).setText(pos?.distance.toString()+" km")
        requireActivity().findViewById<TextView>(R.id.jour).setText("Dimanche")
        requireActivity().findViewById<TextView>(R.id.tempsdispo).setText(pos?.tempsOuv.toString()+":00 à "+pos?.tempsFerm.toString()+":00")
        requireActivity().findViewById<TextView>(R.id.nbh).setText(pos?.unitPrice.toString())
        requireActivity().findViewById<TextView>(R.id.price).setText(pos?.prix.toString())
        requireActivity().findViewById<TextView>(R.id.time).setText(pos?.duree.toString()+" min")

    }
}