package shopmyid.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopmyid.domain.*;
import shopmyid.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String userId;
    private String productId;
    private String productName;
    private Integer qty;
    private Integer amount;
    private Date orderDt;
    private String status;

    public OrderCancelled(Order aggregate) {
        super(aggregate);
    }

    public OrderCancelled() {
        super();
    }
}
//>>> DDD / Domain Event
