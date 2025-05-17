package com.example.homework4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.homework4.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonGitA.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.sayfaAgecis)
        }

        binding.buttonGitX.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.sayfaXgecis)
        }
        return binding.root
    }
    }
