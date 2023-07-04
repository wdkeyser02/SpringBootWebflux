package willydekeyser.service;

import java.time.Duration;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class WebFluxService {

	public Flux<Long> getStream() {
		return Flux.interval(Duration.ofSeconds(60)); 
	}
}
