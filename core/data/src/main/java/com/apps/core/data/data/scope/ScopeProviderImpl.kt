package com.apps.core.data.data.scope

import com.apps.core.data.data.scope.ScopeProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

class ScopeProviderImpl : ScopeProvider {
    override fun getServiceScope() = CoroutineScope(Dispatchers.IO + SupervisorJob())
}