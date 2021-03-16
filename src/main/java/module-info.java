import com.github.asyncmc.module.api.AsyncMcModule;
import com.github.asyncmc.protocol.java.JavaProtocolModule;

module com.github.asyncmc.protocol.java {
    requires com.github.asyncmc.module.api;
    provides AsyncMcModule with JavaProtocolModule;
}
