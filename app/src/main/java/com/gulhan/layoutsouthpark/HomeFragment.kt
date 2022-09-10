package com.gulhan.layoutsouthpark

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gulhan.layoutsouthpark.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    //Binding.
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        //Initialize binding.
        binding = FragmentHomeBinding.inflate(layoutInflater)

        //Initialize.
        this.initialize()

        return binding.root
    }

    //Initialize.
    private fun initialize() {
        //Button click listener.
        binding.button.setOnClickListener { this.buttonClick() }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        //If saved instance is not null
        savedInstanceState?.let {

            //Get bundle content.
            val content = it.getString(Key.NAME, "a")

            //Set textview.
            binding.textView.text = content
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        //Get textView message.
        val textViewMessage = binding.textView.text.toString()

        //Save textview message in bundle.
        outState.putString(Key.NAME, textViewMessage)

    }

    private fun buttonClick() {
        //Get edit text message.
        val editTextContent = binding.editTextTextPersonName.text.toString()

        //Set textView.
        binding.textView.text = "İsim: $editTextContent"
    }

}