import com.github.asyncmc.module.api.ModuleLoader;
import com.github.asyncmc.protocol.java.JavaProtocolModuleLoader;

module com.github.asyncmc.protocol.java {
    requires com.github.asyncmc.module.api;
    provides ModuleLoader with JavaProtocolModuleLoader;
}
