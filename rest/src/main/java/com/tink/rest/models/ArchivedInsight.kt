/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Tink API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.tink.rest.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property id The ID of the archived insight. This is the same ID as for the corresponding insight, before it has been archived.
 * @property userId The ID of the user that the archived insight belongs to.
 * @property type The type of the archived insight.
 * @property title The title of the archived insight.
 * @property description The description of the archived insight.
 * @property `data` The data that describes the archived insight.
 * @property dateInsightCreated The epoch timestamp in UTC when the insight was created.
 * @property dateArchived The epoch timestamp in UTC when the insight was archived.
 */
@JsonClass(generateAdapter = true)
data class ArchivedInsight(
    @Json(name = "userId") @field:Json(name = "userId") var userId: String,
    @Json(name = "id") @field:Json(name = "id") var id: String? = null,
    @Json(name = "type") @field:Json(name = "type") var type: String? = null,
    @Json(name = "title") @field:Json(name = "title") var title: String? = null,
    @Json(name = "description") @field:Json(name = "description") var description: String? = null,
    @Json(name = "data") @field:Json(name = "data") var `data`: InsightData? = null,
    @Json(name = "dateInsightCreated") @field:Json(name = "dateInsightCreated") var dateInsightCreated: Long? = null,
    @Json(name = "dateArchived") @field:Json(name = "dateArchived") var dateArchived: Long? = null
)