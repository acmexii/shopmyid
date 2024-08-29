package shopmyid.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import shopmyid.config.kafka.KafkaProcessor;
import shopmyid.domain.*;

@Service
public class SearchProductViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private SearchProductRepository searchProductRepository;
    //>>> DDD / CQRS
}
