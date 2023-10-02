package io.github.noteflow

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import io.github.noteflow.databinding.FragmentHomeBinding

class Home : Fragment() {

    companion object {
        fun newInstance() = Home()
    }

    private lateinit var viewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        val recyclerView = binding.noteRc
        val noteList = getNoteList() // Replace with your data source
        val adapter = NoteAdapter { note -> onNoteClick(note) }

        recyclerView.adapter = adapter
        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        // Submit the list to the adapter
        adapter.submitList(noteList)

        return binding.root
    }



    private fun onNoteClick(note: Note) {
        // Handle item click here
        Toast.makeText(requireContext(), "Clicked: ${note.title}", Toast.LENGTH_SHORT).show()
    }

    private fun getNoteList(): List<Note> {
        // Replace this with your data retrieval logic
        return listOf(
            Note(1, "Note 1", "Content for Note 1 Content for Note 1 Content for Note 1 Content for Note 1", "Oct 1 2023" ,"#3FD1FF" ,"work"),
            Note(2, "Note 2", "Content for Note 2", "Oct 1 2023" ,"#E2E41D" ,"work"),
            Note(2, "Note 2", "Content for Note 2", "Oct 1 2023" ,"#FE5E2B" ,"work"),
            Note(3, "Note 3", "Content for Note 3", "Oct 1 2023" ,"#E2E41D" ,"work"),
            Note(3, "Note 3", "Content for Note 3", "Oct 1 2023" ,"#FFFFFFFF" ,"work"),
            Note(4, "Note 4", "this is the one", "Oct 1 2023" ,"#FE5E2B" ,"work")
        )
    }

}