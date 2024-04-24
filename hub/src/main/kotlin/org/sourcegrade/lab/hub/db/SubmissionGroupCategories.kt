package org.sourcegrade.lab.hub.db

import org.jetbrains.exposed.dao.id.UUIDTable
import org.jetbrains.exposed.sql.kotlin.datetime.timestamp

internal object SubmissionGroupCategories : UUIDTable("sgl_submission_group_categories") {
    val createdUtc = timestamp("createdUtc")
    val name = varchar("name", 255).uniqueIndex()
    val courseId = reference("course_id", Courses)
    val minSize = integer("min_size")
    val maxSize = integer("max_size")
}
