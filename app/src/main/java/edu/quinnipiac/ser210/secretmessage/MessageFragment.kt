package edu.quinnipiac.ser210.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController

class MessageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_message, container, false)
        val button = view.findViewById<Button>(R.id.next)
        val messageView = view.findViewById<EditText>(R.id.message)
        button.setOnClickListener{
            // gets the message
            val message = messageView.text.toString()
            // pass the message to the encrypt fragment
            val action = MessageFragmentDirections.actionMessageFragmentToEncryptFragment(message)
            // make the  button Navigate to the Encrypt Fragment along with the action
            view.findNavController().navigate(action)
        }

        return view
    }
}