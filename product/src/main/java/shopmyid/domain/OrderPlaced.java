package shopmyid.domain;

import java.util.*;
import lombok.*;
import shopmyid.domain.*;
import shopmyid.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userId;
    private String productId;
    private String productName;
    private Integer qty;
    private Integer amount;
    private Date orderDt;
    private String status;
    private String address;
}
