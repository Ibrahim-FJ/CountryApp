package com.example.countryapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.countryapp.databinding.FragmentMainBinding
import com.example.countryapp.viewmodel.CountryViewModel


class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val countryViewModel: CountryViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding = FragmentMainBinding.inflate(inflater, container, false)
        _binding?.lifecycleOwner = this
        _binding?.countryViewModel = countryViewModel
        return _binding?.root

    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}