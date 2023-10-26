package com.example.practice18_19

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class InfoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_info, container, false)
        val imageView = view?.findViewById<ImageView>(R.id.imageView)
    }



    // обновление текстового поля
    fun setSelectedItem(selectedItem: String?) {
        val views = view?.findViewById<TextView>(R.id.textView)
        val imageView = view?.findViewById<ImageView>(R.id.imageView)
        when(selectedItem){
            "Гриша" -> {views?.text = context?.getString(R.string.grisha)
                imageView?.setImageResource(R.drawable.grisha)}
            "Барсик" -> {views?.text = context?.getString(R.string.barsik)
                imageView?.setImageResource(R.drawable.barsik)}
            "Яша" -> {views?.text = context?.getString(R.string.yasha)
                imageView?.setImageResource(R.drawable.Yasha)}
            "Симба" -> {views?.text = context?.getString(R.string.simba)
                imageView?.setImageResource(R.drawable.simba)}
            "Клава" -> {views?.text = context?.getString(R.string.klava)
                imageView?.setImageResource(R.drawable.klava)}
            "Кузя" -> {views?.text = context?.getString(R.string.kuzya)
                imageView?.setImageResource(R.drawable.kuzya)}
        }

    }
}