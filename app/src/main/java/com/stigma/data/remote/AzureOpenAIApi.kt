package com.stigma.data.remote

import com.stigma.data.remote.dto.AzureOpenAIRequest
import com.stigma.data.remote.dto.AzureOpenAIResponse
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface AzureOpenAIApi {
    
    @POST("openai/deployments/{deployment-id}/chat/completions")
    suspend fun analyzeText(
        @Header("api-key") apiKey: String,
        @Query("api-version") apiVersion: String,
        @Body request: AzureOpenAIRequest
    ): AzureOpenAIResponse
}
