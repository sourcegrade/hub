/*
 *   Lab - SourceGrade.org
 *   Copyright (C) 2019-2024 Contributors
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.sourcegrade.lab.hub.domain.repo

import com.expediagroup.graphql.generator.annotations.GraphQLIgnore
import org.sourcegrade.lab.hub.domain.Creates
import org.sourcegrade.lab.hub.domain.DomainEntity
import org.sourcegrade.lab.hub.domain.Relation

@GraphQLIgnore
interface MutableRepository<E : DomainEntity, C : Creates<E>> : Repository<E> {
    suspend fun create(item: C, relations: List<Relation<E>> = emptyList()): E
    suspend fun put(item: C, relations: List<Relation<E>> = emptyList()): PutResult<E>

    data class PutResult<out E : DomainEntity>(val entity: E, val created: Boolean)
}
