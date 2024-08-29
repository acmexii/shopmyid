package shopmyid.domain;

import java.util.*;
import lombok.*;
import shopmyid.domain.*;
import shopmyid.infra.AbstractEvent;

@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private Integer stock;
    private String productName;
    private String imgUrl;
    private Date registerDt;
    private String status;
}
