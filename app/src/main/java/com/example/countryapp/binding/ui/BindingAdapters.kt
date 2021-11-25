package com.example.countryapp.binding.ui

import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.countryapp.R
import com.example.countryapp.adapter.CountryAdapter
import com.example.countryapp.model.Country


@BindingAdapter("imageUrl")
fun bindImage(imgView: ImageView, imgUrl: String?) {
    imgUrl?.let {
        val imgUri = imgUrl.toUri().buildUpon().scheme("https").build()
        imgView.load(imgUri){
            placeholder(R.drawable.loading_animation)
            error(R.drawable.ic_broken_image)
        }

     //   Picasso.get().load("https://mars.nasa.gov/msl-raw-images/msss/01000/mcam/1000MR0044631200503680E0C_DXXX.jpg").into(imgView)

    }
}


@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<Country>?){

    val adapter = recyclerView.adapter as CountryAdapter
    adapter.submitList(data)
}