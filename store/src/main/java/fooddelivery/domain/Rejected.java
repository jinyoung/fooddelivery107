package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Rejected extends AbstractEvent {

    private Long id;

    public Rejected(Cook aggregate) {
        super(aggregate);
    }

    public Rejected() {
        super();
    }
}
//>>> DDD / Domain Event
