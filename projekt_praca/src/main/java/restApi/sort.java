package restApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class sort {
    String order;
    List<Integer> numbers = new ArrayList();
    

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {this.order = order; }

    public List<Integer> getNumbers() {
        return this.numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
