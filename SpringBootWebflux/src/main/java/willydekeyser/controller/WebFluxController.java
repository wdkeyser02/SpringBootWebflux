package willydekeyser.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import willydekeyser.service.WebFluxService;

@RestController
@RequiredArgsConstructor
public class WebFluxController {

	private final WebFluxService webFluxService;
	
	@GetMapping(value="/", produces = MediaType.APPLICATION_NDJSON_VALUE)
	Flux<Long> getStream() {
		return webFluxService.getStream();
	}
}
