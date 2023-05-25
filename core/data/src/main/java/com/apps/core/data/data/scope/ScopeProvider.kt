package com.apps.core.data.data.scope

import kotlinx.coroutines.CoroutineScope

interface ScopeProvider {
    fun getServiceScope(): CoroutineScope
}