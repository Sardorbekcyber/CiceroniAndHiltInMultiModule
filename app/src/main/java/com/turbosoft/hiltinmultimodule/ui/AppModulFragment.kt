package com.turbosoft.hiltinmultimodule.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.github.terrakok.cicerone.Router
import com.turbosoft.hiltinmultimodule.R
import com.turbosoft.hiltinmultimodule.Screens
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AppModulFragment : Fragment() {

    private lateinit var viewModel: AppModulViewModel

    @Inject
    lateinit var router: Router


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.app_modul_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = view.findViewById<TextView>(R.id.tv_text)
        text.setOnClickListener {
            router.navigateTo(Screens.SecondScreen)
        }
    }

}