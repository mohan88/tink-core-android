/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Tink API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.tink.rest.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property categorizationImprovement The categorization improvement achived if cluster is categorized.
 * @property description A description of the cluster to categorized.
 * @property transactions List of transactions belonging to this cluster.
 */
@JsonClass(generateAdapter = true)
data class TransactionCluster(
    @Json(name = "categorizationImprovement") @field:Json(name = "categorizationImprovement") var categorizationImprovement: Double? = null,
    @Json(name = "description") @field:Json(name = "description") var description: String? = null,
    @Json(name = "transactions") @field:Json(name = "transactions") var transactions: List<Transaction>? = null
)
