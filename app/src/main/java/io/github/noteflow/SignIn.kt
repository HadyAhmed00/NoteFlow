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



    private lateinit var viewModel: SignInViewModel
    private lateinit var binding :FragmentSignInBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //binding init
        binding = FragmentSignInBinding.inflate(layoutInflater)




        // Click Listeners
        binding.signinBtn.setOnClickListener {

            findNavController().navigate(R.id.action_signIn_to_home2)

        }
        binding.regesterBtn.setOnClickListener{
            findNavController().navigate(R.id.action_signIn_to_signUp)
        }

        return binding.root

    }



}