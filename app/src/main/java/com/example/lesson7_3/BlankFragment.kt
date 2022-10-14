package com.example.lesson7_3

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.lesson7_3.databinding.FragmentBlankBinding

class BlankFragment : Fragment(), NameAdapter.OnClickNameListener {

private lateinit var binding: FragmentBlankBinding
private var data = arrayListOf<Human>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        // Inflate the layout for this fragment
        binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = NameAdapter(data,this)
        binding.recycleView.adapter = adapter
    }

    private fun loadData(){
        data.add(Human("Арсен","Сейитбеков",14))
        data.add(Human("Баястан","Кумаров",27))
        data.add(Human("Ариет","Кубанычов",16))
        data.add(Human("Сейитбек","Садирбаев",48))
        data.add(Human("Умар","Максыталиев",23))
        data.add(Human("Назар","Иманбаев",19))
        data.add(Human("Тимурлан","Кудайбердиев",15))
        data.add(Human("Эрлест","Сейитбеков",21))
        data.add(Human("Адис","Асакеев",29))
        data.add(Human("Пиржан","Кубанычов",13))
        data.add(Human("Жасур","Азимов",12))

    }

    private var bundle = Bundle()
    private var fragmentTT =  SecondBlankFragment()
    override fun onNameClick(man: Human) {
        bundle.putString("key", man.name)
        bundle.putString("key2", man.surname)
        bundle.putString("key3", man.age.toString())
        bundle.size()
        fragmentTT.arguments = bundle

        replaceFragment(fragmentTT)
    }
}