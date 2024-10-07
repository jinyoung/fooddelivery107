package fooddelivery.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class AcceptCommand {

    private Boolean acceptYn;
    private String reason;
}
