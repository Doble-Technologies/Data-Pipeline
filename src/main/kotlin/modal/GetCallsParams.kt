package tech.parkhurst.modal

import kotlinx.serialization.Serializable

@Serializable
data class GetCallsParams(
    val numCalls: Int = -1,
    val departments: List<Int> = emptyList(),
    val status: String = "all"
)