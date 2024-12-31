package workflow.process.configuration


import org.springframework.amqp.support.converter.SimpleMessageConverter
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class EventsBrokerConfig {
    @Bean
    fun converter(): SimpleMessageConverter {
        val simpleMessageConverter = SimpleMessageConverter();
        simpleMessageConverter.setAllowedListPatterns(listOf("workflow.process.events.*"));
        return simpleMessageConverter
    }
}