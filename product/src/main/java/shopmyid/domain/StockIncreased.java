package shopmyid.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopmyid.domain.*;
import shopmyid.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private Integer stock;
    private String productName;
    private String imgUrl;
    private Date registerDt;
    private String status;

    public StockIncreased(Inventory aggregate) {
        super(aggregate);
    }

    public StockIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
