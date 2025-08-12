package tech.parkhurst.modal.queries

import kotlinx.serialization.Serializable

@Serializable
data class GetCallsByDepartmentWithStatus(
    val numCalls: Int = -1,
    val departments: List<Int> = emptyList(),
    val status: String = "all"
)
