package edu.quinnipiac.ser210.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

// TODO: Rename parameter arguments, choose names that match

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        // initializes the start button
        val startButton = view.findViewById<Button>(R.id.start)
        startButton.setOnClickListener{
            // navigate to the message fragment
            view.findNavController().navigate(R.id.action_welcomeFragment_to_messageFragment)
        }

        return view
    }
}