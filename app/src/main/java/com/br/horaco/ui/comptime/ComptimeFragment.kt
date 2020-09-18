package com.br.horaco.ui.comptime

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.br.horaco.R

class ComptimeFragment : Fragment() {

    private lateinit var comptimeViewModel: ComptimeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        comptimeViewModel =
            ViewModelProviders.of(this).get(ComptimeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_comptime, container, false)
        val textView: TextView = root.findViewById(R.id.textView3)
        comptimeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}