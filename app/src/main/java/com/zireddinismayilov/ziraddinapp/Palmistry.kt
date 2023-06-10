package com.zireddinismayilov.ziraddinapp


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zireddinismayilov.ziraddinapp.databinding.FragmentPalmistryBinding

class Palmistry : Fragment(R.layout.fragment_palmistry) {

    lateinit var binding: FragmentPalmistryBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPalmistryBinding.inflate(inflater, container, false)
        return binding.root
    }
}