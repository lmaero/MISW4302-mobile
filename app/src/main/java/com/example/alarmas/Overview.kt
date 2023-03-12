package com.example.alarmas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

/**
 * A simple [Fragment] subclass.
 * Use the [Overview.newInstance] factory method to
 * create an instance of this fragment.
 */
class Overview : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_overview, container, false)

        val micButton: Button = view.findViewById(R.id.continueButton)
        micButton.setOnClickListener {
            val fragment = AlarmsList()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_host_fragment, fragment)?.commit()
        }
        return view
    }
}