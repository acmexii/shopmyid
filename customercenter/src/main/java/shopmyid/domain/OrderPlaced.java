package shopmyid.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import shopmyid.infra.AbstractEvent;

@Data
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
