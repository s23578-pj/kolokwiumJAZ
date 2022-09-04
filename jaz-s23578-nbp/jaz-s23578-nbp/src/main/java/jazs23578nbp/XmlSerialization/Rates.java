package jazs23578nbp.XmlSerialization;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;
import java.util.List;

public class Rates {
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Rate> Rate = new ArrayList<>();

    public List<Rate> getRate() {
        return Rate;
    }

    public void setRate(List<Rate> rate) {
        Rate = rate;
    }
}
