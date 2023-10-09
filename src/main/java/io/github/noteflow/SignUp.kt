package io.github.noteflow

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import io.github.noteflow.databinding.FragmentSignUpBinding

class SignUp : Fragment() {



    private lateinit var viewModel: SignUpViewModel
    private lateinit var binding:FragmentSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Binding init
        binding = FragmentSignUpBinding.inflate(layoutInflater)





        // Click listeners
        binding.signInTxtBtn.setOnClickListener{
            findNavController().navigate(R.id.action_signUp_to_signIn)
        }
        binding.signupBtn.setOnClickListener{
            findNavController().navigate(R.id.action_signUp_to_home2)
        }
        return binding.root
    }


}