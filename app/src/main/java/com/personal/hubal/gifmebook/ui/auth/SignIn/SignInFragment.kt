package com.personal.hubal.gifmebook.ui.auth.SignIn

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.personal.hubal.gifmebook.R
import dagger.android.support.AndroidSupportInjection
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by hubal on 10/21/2017.
 */

class SignInFragment : Fragment() {

    @Inject lateinit var message: String

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater?.inflate(R.layout.fragment_sign_in, container, false)

        Timber.d(message)

        return view
    }
}