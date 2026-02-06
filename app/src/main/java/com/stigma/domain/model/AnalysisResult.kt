package com.stigma.domain.model

data class AnalysisResult(
    val claimId: String,
    val normalizedClaim: NormalizedClaim,
    val parameters: List<AnalysisParameter>,
    val patterns: List<DiscoveredPattern>,
    val executiveSummary: String,
    val stanceFraming: String,
    val supportingTrends: List<String>,
    val correlationAnalysis: String,
    val comparativeMetrics: List<ComparisonMetric>,
    val scenarioAdvantages: List<Scenario>,
    val strategicRecommendation: String,
    val confidenceScore: Float,
    val limitations: List<String>,
    val dataSources: List<String>,
    val completedAt: Long
)

enum class AnalysisStatus {
    PENDING,
    ANALYZING,
    COMPLETED,
    FAILED
}

data class NormalizedClaim(
    val decisionObjective: String,
    val evaluationCriteria: List<String>,
    val contextAssumptions: List<String>,
    val timeframe: String,
    val scope: String
)

data class AnalysisParameter(
    val name: String,
    val value: String,
    val confidence: Double
)

data class DiscoveredPattern(
    val type: String,
    val description: String,
    val significance: Double
)

data class ComparisonMetric(
    val metric: String,
    val value: Double,
    val baseline: Double
)

data class Scenario(
    val id: String,
    val description: String,
    val probability: Double
)
