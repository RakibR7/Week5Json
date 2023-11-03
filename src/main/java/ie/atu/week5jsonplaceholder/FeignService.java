package ie.atu.week5jsonplaceholder;

import org.springframework.stereotype.Service;

@Service
public class FeignService {
    private final TodoClient todoClient;

    public FeignService(TodoClient todoClient){
        this.todoClient = todoClient;
    }

    public TodoResponse fetchData() {
        TodoResponse td = todoClient.fetchData();
        System.out.println(td);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return td;
    }
    public TodoResponse fetchData196() {
        TodoResponse td2 = todoClient.fetchData();
        System.out.println(td2);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return td2;
    }
}
