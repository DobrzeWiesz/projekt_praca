package restApi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@RestController
@RequestMapping(path="/numbers")
public class sortController
{

    @GetMapping("/sort-command")
    public List<Integer> sort_command(@RequestParam String order, @RequestParam List<Integer> numbers)
    {
        //sort s = new sort();
        if (String.format(order).equals("ASC"))
        {Collections.sort(numbers);}
        else if (String.format(order).equals("DESC"))
        {Collections.sort(numbers, Collections.reverseOrder());}
        return numbers;
    }
}
