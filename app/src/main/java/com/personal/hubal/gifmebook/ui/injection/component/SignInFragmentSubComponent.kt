package com.personal.hubal.gifmebook.ui.injection.component

import com.personal.hubal.gifmebook.ui.auth.SignIn.SignInFragment
import com.personal.hubal.gifmebook.ui.injection.module.SignInFragmentModule
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by hubal on 10/21/2017.
 */

@Subcomponent(modules = arrayOf(SignInFragmentModule::class))
interface SignInFragmentSubComponent : AndroidInjector<SignInFragment> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<SignInFragment>()
}