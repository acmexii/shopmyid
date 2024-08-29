package shopmyid.domain;

import java.util.*;
import lombok.*;
import shopmyid.domain.*;
import shopmyid.infra.AbstractEvent;

@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private String orderId;
    private String productId;
    private String productName;
    private Integer qty;
    private Integer amount;
    private Date deliveryDt;
    private String status;
}
