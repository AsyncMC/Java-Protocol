/*
 *  AsyncMC - A fully async, non blocking, thread safe and open source Minecraft server implementation
 *  Copyright (C) 2021  José Roberto de Araújo Júnior <joserobjr@gamemods.com.br>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published
 *  by the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.github.asyncmc.protocol.java

import com.github.asyncmc.module.api.Module
import com.github.asyncmc.module.api.ModuleLifecycle
import com.github.asyncmc.module.api.ModuleLoader
import com.github.asyncmc.module.api.Server
import kotlinx.coroutines.CoroutineScope

/**
 * @author joserobjr
 * @since 2021-03-17
 */
internal class JavaProtocolModule(
    moduleLoader: ModuleLoader, server: Server, name: String, secrets: ModuleLoader.LoadingSecrets
): Module(moduleLoader, server, name, secrets) {
    override fun CoroutineScope.lifecycleChanged(newState: ModuleLifecycle) {
        TODO("Not yet implemented")
    }
}
