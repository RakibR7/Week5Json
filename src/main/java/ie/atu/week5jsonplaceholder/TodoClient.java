package ie.atu.week5jsonplaceholder;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "jsonplaceholder", url = "https://jsonplaceholder.typecode.com")
public interface TodoClient {
    @GetMapping("/todos/1")
    TodoResponse fetchData();

    return TodoResponse;
}
