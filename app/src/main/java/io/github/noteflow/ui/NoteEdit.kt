package io.github.noteflow.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import io.github.noteflow.viewModel.NoteEditViewModel
import io.github.noteflow.databinding.FragmentNoteEditBinding

class NoteEdit : Fragment() {

    companion object {
        fun newInstance() = NoteEdit()
    }

    private lateinit var viewModel: NoteEditViewModel
    private lateinit var binding: FragmentNoteEditBinding
    val args: io.github.noteflow.NoteEditArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel = ViewModelProvider(this).get(NoteEditViewModel::class.java)
        binding = FragmentNoteEditBinding.inflate(layoutInflater)

        val note = args.noteToEdit

        binding.note= note
        return binding.root
    }



}