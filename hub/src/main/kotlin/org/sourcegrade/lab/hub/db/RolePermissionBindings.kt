package org.sourcegrade.lab.hub.db

import org.jetbrains.exposed.dao.id.UUIDTable

internal object RolePermissionBindings : UUIDTable("sgl_role_permission_bindings") {
    val roleId = reference("role_id", Roles)
    val permission = varchar("permission", 255)
    val value = bool("value")

    init {
        uniqueIndex(roleId, permission)
    }
}
