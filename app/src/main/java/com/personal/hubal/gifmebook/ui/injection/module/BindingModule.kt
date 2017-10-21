package com.personal.hubal.gifmebook.ui.injection.module

import com.personal.hubal.gifmebook.ui.auth.AuthActivity
import com.personal.hubal.gifmebook.ui.auth.SignIn.SignInFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap
import org.buffer.android.boilerplate.ui.injection.scopes.PerActivity

/**
 * Created by hubal on 10/21/2017.
 */

@Module
abstract class BindingModule {

    @ContributesAndroidInjector(modules = arrayOf(AuthActivityModule::class))
    abstract fun bindAuthActivity() : AuthActivity

    @ContributesAndroidInjector(modules = arrayOf(SignInFragmentModule::class))
    abstract fun bindSignInFragment() : SignInFragment
}