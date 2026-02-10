package com.stigma.domain.repository

import com.stigma.domain.model.AnalysisResult
import kotlinx.coroutines.flow.Flow

/**
 * Repository interface for managing AnalysisResult data.
 * Handles operations for local storage and remote synchronization.
 */
interface AnalysisRepository {
    /** Observe all analysis results as a stream. */
    fun getAllAnalyses(): Flow<List<AnalysisResult>>
    
    /** Observe a specific analysis by its ID. */
    fun getAnalysisById(analysisId: String): Flow<AnalysisResult?>
    
    /** Observe all analyses associated with a specific claim ID. */
    fun getAnalysesByClaimId(claimId: String): Flow<List<AnalysisResult>>
    
    /** Observe the most recent [limit] analysis results. */
    fun getRecentAnalyses(limit: Int): Flow<List<AnalysisResult>>
    
    /** Insert or update an analysis result. */
    suspend fun insertAnalysis(analysis: AnalysisResult)
    
    /** Delete an analysis result by its ID. */
    suspend fun deleteAnalysis(analysisId: String)
    
    /** Calculate the average confidence score across all analyses. */
    suspend fun getAverageConfidence(): Float
    
    /** Get the total number of stored analyses. */
    suspend fun getTotalCount(): Int
    
    /** Trigger synchronization with remote data source (Firestore). */
    suspend fun syncWithRemote()
}
