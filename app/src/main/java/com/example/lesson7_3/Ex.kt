package com.example.lesson7_3

import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
//
fun AppCompatActivity.addFragment(fragment: Fragment){
    supportFragmentManager.beginTransaction().add(R.id.conteiner,fragment).commit()
}

fun Fragment.replaceFragment(fragment: Fragment){
    requireActivity().supportFragmentManager.beginTransaction().replace(R.id.conteiner,fragment)
        .addToBackStack(null).commit()
}