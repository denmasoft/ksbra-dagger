package com.todoenterprise.droid.kacaDagger.sign.view.fragment

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.todoenterprise.droid.kacaDagger.R
import com.todoenterprise.droid.kacaDagger.sign.viewmodel.SignEmailViewModel
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class SignEmailFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by lazy { ViewModelProviders.of(this, viewModelFactory).get(SignEmailViewModel::class.java) }

    companion object {
        fun newInstance() = SignEmailFragment()
    }

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_sign_email, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {

        super.onActivityCreated(savedInstanceState)

        viewModel.test()
    }

    override fun onDestroy() {
        //viewModel.disposeElements()
        super.onDestroy()
    }
}