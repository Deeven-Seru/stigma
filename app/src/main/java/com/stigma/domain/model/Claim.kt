package com.stigma.domain.model

data class Claim(
    val id: String,
    val title: String,
    val description: String,
    val context: String,
    val createdAt: Long,
    val status: AnalysisStatus
)
