package io.github.noteflow

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import io.github.noteflow.databinding.FragmentSignInBinding

class SignIn : Fragment() {

    companion object {
        fun newInstance() = SignIn()
    }

    private lateinit var viewModel: SignInViewModel
    private lateinit var binding :FragmentSignInBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSignInBinding.inflate(layoutInflater)

        binding.signinBtn.setOnClickListener {

            findNavController().navigate(R.id.action_signIn_to_signUp)

        }

        binding.regesterBtn.setOnClickListener{
            findNavController().navigate(R.id.action_signIn_to_signUp)
        }

        return binding.root

    }



}