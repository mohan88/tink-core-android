package com.tink.service

import com.tink.service.authentication.AuthenticationService
import com.tink.service.authentication.AuthenticationServiceImpl
import com.tink.service.authorization.UserService
import com.tink.service.authorization.UserServiceImpl
import com.tink.service.consent.ConsentService
import com.tink.service.consent.ConsentServiceImpl
import com.tink.service.credential.CredentialService
import com.tink.service.credential.CredentialServiceImpl
import com.tink.service.provider.ProviderService
import com.tink.service.provider.ProviderServiceImpl
import dagger.Binds
import dagger.Module

@Module
abstract class ServiceModule {

    @Binds
    abstract fun providerService(implementation: ProviderServiceImpl): ProviderService

    @Binds
    abstract fun credentialService(implementation: CredentialServiceImpl): CredentialService

    @Binds
    internal abstract fun authenticationService(implementation: AuthenticationServiceImpl): AuthenticationService

    @Binds
    internal abstract fun authorizationService(implementation: UserServiceImpl): UserService

    @Binds
    internal abstract fun consentService(implementation: ConsentServiceImpl): ConsentService
}