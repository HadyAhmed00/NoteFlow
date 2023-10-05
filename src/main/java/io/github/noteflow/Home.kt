package io.github.noteflow

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
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
        findNavController().navigate(R.id.action_home2_to_noteEdit)
    }

    private fun getNoteList(): List<Note> {
        // Replace this with your data retrieval logic
        return listOf(
            Note(1, "Note 1", "Content for Note 1 Content for Note 1 Content for Note 1 Content for Note 1", "Oct 1 2023" ,"#3FD1FF" ,"work"),
            Note(2, "Note 2", "Content for Note 2", "Oct 1 2023" ,"#E2E41D" ,"work"),
            Note(3, "Note 3", "Content for Note 3 with a bit longer content to demonstrate different lengths.", "Oct 1 2023" ,"#FE5E2B" ,"work"),
            Note(4, "Note 4", "This is a short note.", "Oct 1 2023" ,"#E2E41D" ,"work"),
            Note(5, "Note 5", "Content for Note 5", "Oct 1 2023" ,"#FFFFFFFF" ,"personal"),
            Note(6, "Note 6", "This is another note with varying content.", "Oct 2 2023" ,"#FE5E2B" ,"personal"),
            Note(7, "Note 7", "Short content", "Oct 2 2023" ,"#3FD1FF" ,"personal"),
            Note(8, "Note 8", "Content for Note 8 Content for Note 8 Content for Note 8 Content for Note 8 Content for Note 8", "Oct 2 2023" ,"#E2E41D" ,"work"),
            Note(9, "Note 9", "A very brief note.", "Oct 2 2023" ,"#FE5E2B" ,"work"),
            Note(10, "Note 10", "Content for Note 10", "Oct 3 2023" ,"#E2E41D" ,"work"),
            Note(11, "Note 11", "This is a longer note to demonstrate different content lengths.", "Oct 3 2023" ,"#FFFFFFFF" ,"personal"),
            Note(12, "Note 12", "Note with unique color.", "Oct 3 2023" ,"#FF5733" ,"personal"),
            Note(13, "Note 13", "Content for Note 13", "Oct 3 2023" ,"#3FD1FF" ,"work"),
            Note(14, "Note 14", "Another short note.", "Oct 4 2023" ,"#E2E41D" ,"work"),
            Note(15, "Note 15", "Content for Note 15 Content for Note 15 Content for Note 15 Content for Note 15", "Oct 4 2023" ,"#FE5E2B" ,"work")

        )
    }

}