package com.turbosoft.hiltinmultimodule

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen
import com.turbosoft.hiltinmultimodule.ui.AppModulFragment
import com.turbosoft.onboard.OnboardFragment


sealed interface Screens {

    object AppModuleScreen : FragmentScreen {
        override fun createFragment(factory: FragmentFactory) = AppModulFragment()
    }

    object SecondScreen : FragmentScreen {
        override fun createFragment(factory: FragmentFactory) = OnboardFragment()
    }

}

