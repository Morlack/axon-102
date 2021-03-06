package com.insidion.axon102.config

import org.axonframework.commandhandling.DuplicateCommandHandlerResolver
import org.axonframework.commandhandling.SimpleCommandBus
import org.axonframework.common.transaction.TransactionManager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AxonConfiguration {
    @Bean
    @Suppress("SpringJavaInjectionPointsAutowiringInspection")
    fun commandBus(
        txManager: TransactionManager,
        duplicateCommandHandlerResolver: DuplicateCommandHandlerResolver,
    ): SimpleCommandBus {
        val commandBus = SimpleCommandBus.builder()
            .transactionManager(txManager)
            .duplicateCommandHandlerResolver(duplicateCommandHandlerResolver)
            .build()

        return commandBus
    }
}
