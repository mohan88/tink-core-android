/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Tink API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.tink.rest.apis

import com.tink.rest.models.CreateBeneficiaryRequest
import com.tink.rest.models.ListBeneficiariesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

@JvmSuppressWildcards
interface BeneficiaryApi {
    /**
     * Create beneficiary
     * Initiates a request to add beneficiary to the given account belonging to the authenticated user.
     * @param body Configuration for new beneficiary. (optional)
     */
    @POST("/api/v1/beneficiaries")
    suspend fun create(
        @retrofit2.http.Body body: CreateBeneficiaryRequest
    ): Response<Unit>

    /**
     * List beneficiaries
     * Lists all beneficiaries for all accounts belonging to the authenticated user.
     */
    @GET("/api/v1/beneficiaries")
    suspend fun list(): ListBeneficiariesResponse
}
