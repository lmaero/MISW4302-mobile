package com.example.alarmas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

/**
 * A simple [Fragment] subclass.
 * Use the [Recording.newInstance] factory method to
 * create an instance of this fragment.
 */
class Recording : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recording, container, false)

        val micButton: ImageView = view.findViewById(R.id.micIcon)
        micButton.setOnClickListener {
            val fragment = Confirmation()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_host_fragment, fragment)?.commit()
        }
        return view
    }
}