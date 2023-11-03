package ie.atu.week5jsonplaceholder;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "jsonplaceholder", url = "https://jsonplaceholder.typicode.com")
public interface TodoClient {
    @GetMapping("/todos/196")
    TodoResponse fetchData196();

    @GetMapping("/todos/")
    TodoResponse fetchData();
}
