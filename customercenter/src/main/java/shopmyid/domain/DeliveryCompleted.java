package shopmyid.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import shopmyid.infra.AbstractEvent;

@Data
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;
}
