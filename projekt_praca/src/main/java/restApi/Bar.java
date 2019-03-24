package restApi;

import com.sun.javafx.collections.MappingChange;
import javafx.util.Pair;
import org.assertj.core.groups.Tuple;

import java.util.HashMap;
import java.util.List;

public class Bar {

    public String table;
    public String no;
    public String effectiveDate;
    public HashMap <String, Pair<String, Integer>> rates;



    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public HashMap<String, Pair<String, Integer>> getRates() {
        return rates;
    }

    public void setRates(HashMap<String, Pair<String, Integer>> rates) {
        this.rates = rates;
    }
}
