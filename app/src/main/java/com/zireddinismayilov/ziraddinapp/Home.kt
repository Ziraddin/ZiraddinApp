package com.zireddinismayilov.ziraddinapp


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zireddinismayilov.ziraddinapp.databinding.FragmentHomeBinding

class Home : Fragment(R.layout.fragment_home) {

    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        val magicBall = binding.magicBall

        magicBall.setOnClickListener {
            val intent = Intent(requireContext(), MagicBallActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }
}