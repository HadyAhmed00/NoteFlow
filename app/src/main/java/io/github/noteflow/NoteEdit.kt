package io.github.noteflow

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.noteflow.databinding.FragmentNoteEditBinding

class NoteEdit : Fragment() {

    companion object {
        fun newInstance() = NoteEdit()
    }

    private lateinit var viewModel: NoteEditViewModel
    private lateinit var binding: FragmentNoteEditBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel = ViewModelProvider(this).get(NoteEditViewModel::class.java)
        binding = FragmentNoteEditBinding.inflate(layoutInflater)



        return binding.root
    }



}