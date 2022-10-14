package com.example.lesson7_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson7_3.databinding.FragmentSecondBlankBinding

class SecondBlankFragment : Fragment() {

    private lateinit var binding: FragmentSecondBlankBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBlankBinding.inflate(inflater, container, false)

        val args = this.arguments
        val input = args?.get("key")
        val input2 = args?.get("key2")
        val input3 = args?.get("key3")
        binding.text.text = input.toString()
        binding.text2.text = input2.toString()
        binding.text4.text = input3.toString()
        return binding.root
    }
}
